import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static void checkEmail() {
        String emailCondition = "[abc]{3}([-+_])?([.a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
        Pattern pattern = Pattern.compile(emailCondition);

        String validemailId[] = {"abc@yahoo.com", "abc-100@yahoo.com", "abc-100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",
                "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au",
                "abc1..@gmail.com"};

        for (int i = 0; i < validemailId.length; i++) {
            Matcher email = pattern.matcher(validemailId[i]);
            if (email.matches()) {

                System.out.println(validemailId[i] + " Valid Input");
            } else {
                System.out.println(validemailId[i] + " Invalid Input");
            }
        }
    }
    public static void main(String[] args) {
        checkEmail();
    }
}
