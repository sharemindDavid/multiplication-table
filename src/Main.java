import java.io.Console;
public class Main {

    public static void main (String[] args){
        Console console = System.console();
        for (int i = 2; i < 10; i++) {
            System.out.println("");
            System.out.println(i + " 단입니다!!!!!");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " +( i * j ));
            }
        }

        System.out.println("\n 세로/가로");

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                int answer = i * j;
                 String a = String.valueOf(answer);
                if(a.length() == 1){
                     a = "0" + a;
                }
                System.out.print(j + " x " + i + " = " + a);
                System.out.print("    ");
            }
            System.out.println();
        }

        int david = 20;

        String dave = Integer.toString(david);

        System.out.println(dave.length());
    }
}
