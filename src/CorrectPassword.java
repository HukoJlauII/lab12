import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Pattern p=Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}$");
        //(?=.*[0-9]) - хотя бы одна цифра
        //(?=.*[a-z]) - хотя бы одна латинская строчная буква
        //(?=.*[A-Z]) - хотя бы одна латинская заглавная буква
        //[0-9a-zA-Z_]{8,}$ - от 8 символов из предложенных в конце строки
        for (int i=0;i<4;i++) {
            System.out.print("Enter your password: ");
            String passwd = sc.next();
            Matcher m = p.matcher(passwd);
            if (m.find()) {
                System.out.println("Password is correct");
            } else {
                System.out.println("Password is incorrect");
            }
        }
//        – пример правильных выражений: F032_Password, TrySpy11.
//        – пример неправильных выражений: smart_pass, A007

    }
}
