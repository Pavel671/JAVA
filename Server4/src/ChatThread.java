import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatThread {
    private Socket socket;
    private Server server;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;

    public ChatThread(Server server, Socket socket) throws IOException {
        this.server = server;
        this.socket = socket;

        in = new DataInputStream(this.socket.getInputStream());
        out = new DataOutputStream(this.socket.getOutputStream());
    }

    public void start() throws IOException {
        System.out.println("Authentication");
        Thread thread = new Thread(() -> {
            try {
                readMessage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        if (authentication()) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        closeConnection();
    }

    private boolean authentication() throws IOException {
        String str = in.readUTF();

        if (str.equalsIgnoreCase("/end")) {
            return false;
        }

        this.name = str;

        String msg = "";
        if (server.addClient(name, this)) {
            server.sendAll(msg);
            return true;
        } else {
            out.writeUTF(msg);
            return false;
        }
    }

    private void readMessage() throws IOException {

        while (server.isRunning()) {
            if (!socket.isConnected()) {
                closeConnection();
                break;
            }

            String str = in.readUTF();

            System.out.println("client: " + name + " message: " + str);

            if (str.equalsIgnoreCase("/end")) {
                closeConnection();
                break;
            }

            if (str.equalsIgnoreCase("/stopServer")) {
                server.stopServer();
                break;
            }

            String[] msg = str.split(" ", 3);
            if (msg[0].equalsIgnoreCase("/w")) {
                String nameOut = msg[1];
            } else {
                server.sendAll(this.name, str);
            }
        }
    }

    public void closeConnection() {
        try {
            if (!server.closeClient(this.name)) return;
            server.sendAll("Client : " + this.name + "  disconnect.");

            sendMessage("/end");

            in.close();
            out.close();

            if (!socket.isClosed()) {
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg) throws IOException {
        if (!socket.isConnected()) {
            closeConnection();
            return;
        }

        out.writeUTF(msg);
        out.flush();

    }
}