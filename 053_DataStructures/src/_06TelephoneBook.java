import java.util.HashMap;
import java.util.Map;

public class _06TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("William A.", "Lathan	405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

//        Create an application which solves the following problems.
//
//        What is John K. Miller's phone number?
        System.out.println("John K. Miller's phone number: ");
        System.out.println(phoneBook.get("John K. Miller") + "\n");

//        Whose phone number is 307-687-2982?
        String searchedName = "";
        for (Map.Entry<String, String> element : phoneBook.entrySet()) {
            if (element.getValue() == "307-687-2982") {
                searchedName = element.getKey();
            }
        }
        System.out.println("The 307-687-2982 phone number's owner: \n" + searchedName + "\n");

//        Do we know Chris E. Myers' phone number?
        System.out.println("Do we know Chris E. Myers' phone number? " );
        if (phoneBook.get("Chris E. Myers") != null) {
            System.out.print("Yes\n");
        } else {
            System.out.println("No\n");
        }
    }
}
