import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        boolean flag = false;

        System.out.println("Simple calculator returns field of volume of figures");

        do {
            Menu menu = new Menu();
            menu.start();

            System.out.println(" ");
            System.out.print("Once again?  (y/n) ?:  ");
            Scanner sc = new Scanner(System.in);
            String valid = sc.next();

            if (valid.equals("y") || valid.equals("Y")) {
                flag = true;
                System.out.println(" ");
            }
            else {
                flag = false;
            }
        }
        while (flag == true);

        System.out.println("See You next time ;)");
    }
}
