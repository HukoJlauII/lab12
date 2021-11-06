import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passwd=sc.next();
        Pattern p=Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher m=p.matcher(passwd);

        if (m.find())
        {
            System.out.println("Password is correct");
        }else
        {
            System.out.println("Password is incorrect");
        }
    }
}
