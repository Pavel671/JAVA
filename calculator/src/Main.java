import javax.swing.*;


class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
