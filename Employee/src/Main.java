public class Main {
    public static void main(String[] args) {
        Employee[] P = new Employee[5];
        P[0] = new Employee("Борисов Андрей Валерьевич", "менеджер", "borya43@bk.ru", "89265887887", "45000", 35);
        P[1] = new Employee("Борисов Сергей Валерьевич", "водитель", "borya23@bk.ru", "89265887888", "30000", 23);
        P[2] = new Employee("Борисов Дмитрий Валерьевич", "логист", "borya34@bk.ru", "89265887889", "40000", 41);
        P[3] = new Employee("Борисов Владимир Валерьевич", "снабженец", "borya52@bk.ru", "89265887890", "50000", 52);
        P[4] = new Employee("Борисов Олег Валерьевич", "директор", "borya39@bk.ru", "89265887891", "55000", 39);
        for (int i = 0; i < P.length; i++)
            if (P[i].getAge() > 40)
                System.out.println(P[i].toString());
    }

    public void printInfo() {
        System.out.println("Сотрудник1 имя:%s\nдолжность:%s\nemail:%s\nтелефон:%s\nзарплата:%s\nвозраст:%s%n");
    }
}