/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании
 (т.е. не надо в телефонную запись добавлять еще дополнительные поля
 (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
 Консоль желательно не использовать (в том числе Scanner),
 тестировать просто из метода main() прописывая add() и get().
 */


import java.util.*;

public abstract class Array implements Collection {



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("house");
        list.add("light");
        list.add("score");
        list.add("region");
        list.add("cottage");
        list.add("telephone");
        list.add("light");
        list.add("water");
        list.add("fire");
        list.add("rain");
        list.add("snow");
        list.add("score");
        list.add("light");
        list.add("region");
        list.add("water");

        Set<String> unique = new HashSet<String>(list);

        System.out.println();
        System.out.println("Array: " +list.toString());
        System.out.println();
        System.out.println("Unique words: " + unique.toString());
        System.out.println("Every word occurs");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(list, key));
        }
    }

}

