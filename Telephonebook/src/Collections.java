public class Collections {

    public static class MainClass {
        public static void main(String[] args) {


            Telephonebook book = new Telephonebook();
            System.out.println("Telephonebook");
            book.add("Jonson", "1234567");
            book.add("Lemon", "1122334");
            book.add("Smit", "9514587");
            book.add("Jonson", "3579256");
            book.add("Lemon", "4567864");


            System.out.println("Jonson: " + book.get("Jonson"));
            System.out.println("Lemon: " + book.get("Lemon"));
            System.out.println("Smit: " + book.get("Smit"));
            System.out.println("Willson: " + book.get("Willson"));


        }
    }
}
