import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    static void StringFormat(){
        System.out.println("Enter The Mobile Number");
        Scanner sc = new Scanner(System.in);
        String Number = sc.next();
        String CheckEmailId= ("^[9]{1}[1]{1}[ ]{1}[0-9]{10}$");
        boolean valid = Pattern.compile(Number).matcher(CheckEmailId).matches();
        System.out.println(valid);
    }
    public static void main(String[] args) {
        System.out.println("WelCome To Regex Problem");
        StringFormat();
    }
}
