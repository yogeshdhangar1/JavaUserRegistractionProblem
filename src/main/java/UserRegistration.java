import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static void StringFormat(){
        System.out.println("Enter The First Name");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();
        String CheckFName = "^[A-Z]{1}[a-z]{2,}";
        boolean valid = Pattern.compile(fName).matcher(CheckFName).matches();
        System.out.println(valid);
    }

    public static void main(String[] args) {
        System.out.println("WelCome To Regex Problem");
        StringFormat();
    }
}
