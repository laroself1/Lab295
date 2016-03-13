
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkPersonWithRegExp(String userNameString) {
        String checkingString = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(checkingString);
        Matcher mathPattern = pattern.matcher(userNameString);
        return mathPattern.matches();
    }
    public static void main(String[] args) {

        String[] names = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String name : names) {
            if (checkPersonWithRegExp(name)) System.out.println(name + " - name");
            else System.out.println(name + " - not name");
        }
    }}


