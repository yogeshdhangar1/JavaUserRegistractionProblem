import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static void StringFormat(){
        System.out.println("Enter The Email Id ");
        Scanner sc = new Scanner(System.in);
        String Email = sc.next();
        String CheckEmailId= ("^[a-z]{3}[.]?[@#$%]{1}[a-z]{2}[.]{1}[a-z]{2}$");
        boolean valid = Pattern.compile(Email).matcher(CheckEmailId).matches();
        System.out.println(valid);
    }

    public static void main(String[] args) {
        System.out.println("WelCome To Regex Problem");
        StringFormat();
    }
}
