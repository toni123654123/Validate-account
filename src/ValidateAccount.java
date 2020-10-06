import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
   private static final String VALIDATE = "^[_a-z0-9]{6,8}$";

    public ValidateAccount() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(VALIDATE);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
