import java.util.Scanner;

public class hello {
    String passorfail(int score) {
        if (score < 35) {
            return "fail";
        } else {
            return "pass";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tmark = scan.nextInt();
        hello obj = new hello();
        String result = obj.passorfail(tmark);
        System.out.println(result);
    }

}
