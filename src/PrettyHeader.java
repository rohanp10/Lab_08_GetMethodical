import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String msg = "";

        msg = SafeInput.getNonZeroLenString(in, "Enter the message");

        SafeInput.prettyHeader(msg);

    }

}
