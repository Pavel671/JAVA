import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private int PORT;
    private boolean isRunnable;
    private ServerSocket srv;
    private HashMap<String, ChatThread> listClient;

    public Server() {
        this.PORT = 8181;
        this.listClient = new HashMap<String, ChatThread>();
    }

    public Server(int port) {
        this.PORT = port;
        this.listClient = new HashMap<String, ChatThread>();
    }

    public static void main(String[] args) {
        Server srv = new Server();
        try {
            srv.startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean isRunning() {
        return isRunnable;
    }

    public void startServer() throws IOException {
        srv = new ServerSocket(this.PORT);
        this.isRunnable = true;

        System.out.println("Start server...");

        while (isRunning()) {
            Socket socket = srv.accept();
            ChatThread thread = new ChatThread(this, socket);
            thread.start();
        }
    }

    public boolean closeClient(String name) {
        if (!listClient.isEmpty()) {
            listClient.remove(name);
            return true;
        }
        return false;
    }

    public boolean addClient(String name, ChatThread cTh){
        if (!listClient.containsKey(name)) {
            listClient.put(name, cTh);

            System.out.println("New client " + name);
            return true;
        }
        return false;
    }

    public void stopServer() throws IOException {
        this.isRunnable = false;

        if (!listClient.isEmpty()) {
            for (String name : listClient.keySet()) {
                ChatThread map = listClient.get(name);
                map.closeConnection();
            }
            listClient.clear();
        }
        if (!srv.isClosed()) {
            srv.close();
        }

        System.out.println("Server stop");
    }

    public void sendAll(String nameClient, String msg) throws IOException {
        if (!listClient.isEmpty()) {
            for (ChatThread map : listClient.values()) {
                map.sendMessage("" + nameClient + ": " + msg);
            }
        }
    }

    public void sendAll(String msg) throws IOException {
        if (!listClient.isEmpty()) {
            for (ChatThread map : listClient.values()) {
                map.sendMessage(msg);

                System.out.println("Server: " + msg);
            }
        }
    }



}
