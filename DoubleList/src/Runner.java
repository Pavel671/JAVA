public class Runner {
    public static void main(String[] args) {
        Runner();
    }


    private static void Runner() {
        List list = new List();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

        List.Iterator iterator = list.getIterator();
        System.out.println("First:");
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
        System.out.println("End:");
        while (iterator.hasPrev()) {
            System.out.println(iterator.getPrev());
        }

        list.insert(4, "inserted 4");
        list.insert(list.getCount(), "inserted last");
        System.out.println("");
        iterator.reset();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }

        System.out.println("Length :" + list.getCount());
    }
}



