package java11;

public class StringsMethods {
    public static void main(String[] args) {
        String name = " ";
        if(name.trim().isEmpty()){
            System.out.println("name is empty..");
        }
        if(name.isBlank()){
            System.out.println("inside blank...");
        }

        String address = "\u2005 123 Main Street \u2005"; // contains Unicode whitespace

// Old way: trim (only ASCII spaces)
        System.out.println("Trimmed: '" + address.trim()+ "'");
        System.out.println("Stripped: '" + address.strip() + "'");
    }
}
