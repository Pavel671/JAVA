import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Telephonebook {

    private HashMap<String, List<String>> book;

    public Telephonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
            } else {
                System.out.println(String.format("The number is in the phone book %s", number));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("Missing from the telephonebook %s", surname));
            return new ArrayList<>();
        }
    }


}

