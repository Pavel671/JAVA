public class Employee {   //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String fullName;// ФИО
    private String position;// дожность
    private String email;
    private String telephone;// телефон
    private String salary;// заплата
    private int age;// возраст

    public Employee(String fullName, String position, String email, String telephone, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "ФИО: " + fullName + '\'' +
                ", возраст: " + age +"";
    }
}



