import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st ;
        System.out.println("moi ban nhap: ");
        st = scanner.nextLine();
        ValidateAccount validateAccount = new ValidateAccount();
        System.out.println(validateAccount.validate(st));
    }


}
