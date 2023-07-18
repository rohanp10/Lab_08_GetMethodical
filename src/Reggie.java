import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String SSN = "";
        String studentMNumber = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        studentMNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice [O, S, V, Q]", "^[OoSsVvQq]$");

    }
}
