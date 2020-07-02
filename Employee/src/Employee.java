public class Employee {   //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String fullName;// ФИО
    String position;// дожность
    String email;
    String telephone;// телефон
    String salary;// заплата
    int age;// возраст

    public Employee(String fullName, String position, String email, String telephone, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public Employee() { }

    public static void main(String[] args) {
        Employee[] P = new Employee[5];
        P[0] = new Employee("Борисов Андрей Валерьевич", "менеджер", "borya43@bk.ru", "89265887887", "45000", 35);
        P[1] = new Employee("Борисов Сергей Валерьевич", "водитель", "borya23@bk.ru", "89265887888", "30000", 23);
        P[2] = new Employee("Борисов Дмитрий Валерьевич", "логист", "borya34@bk.ru", "89265887889", "40000", 41);
        P[3] = new Employee("Борисов Владимир Валерьевич", "снабженец", "borya52@bk.ru", "89265887890", "50000", 52);
        P[4] = new Employee("Борисов Олег Валерьевич", "директор", "borya39@bk.ru", "89265887891", "55000", 39);
        for (int i = 0; i < P.length; i++)
            if (P[i].age > 40)
        System.out.println(String.valueOf("Сотрудник1 имя:" + P[i].fullName + "\nдолжность:" + P[i].position + "\nemail:" + P[i].email + "\nтелефон:" + P[i].telephone + "\nзарплата:" + P[i].salary + "\nвозраст:" + P[i].age));
    }
}

