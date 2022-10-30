import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static void checkPassword() {
        String nameCondition =  "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";//atleast one [uppercase/numer/special char]
        Pattern pattern = Pattern.compile(nameCondition);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String checkPassword = sc.nextLine();//Scanning first name
        Matcher fMatcher = pattern.matcher(checkPassword);
        if(fMatcher.matches()) {
            System.out.println("Valid Input");
        }
        else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
    public static void main(String[] args) {
        checkPassword();
    }
}
