import java.util.Scanner;

public class Menu {
    public void start() {

        System.out.println("-----------------WELCOME-----------------");
        System.out.println("- calculate the circle field          (1)");
        System.out.println("- calculate the sphere field          (2)");
        System.out.println("- calculate the volume of the sphere  (3)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose action: ");
        int choose = sc.nextInt();

        switch (choose) {
            case 1: {
                Circle circleF = new Circle();
                circleF.setR();
                circleF.setActive();
                System.out.println("Field: " + (circleF.getActive() * circleF.field()));
            } break;

            case 2: {
                Sphere sphereF = new Sphere();
                sphereF.setR();
                sphereF.setActive();
                System.out.println("Field: " + (sphereF.getActive() * sphereF.field()));
            } break;

            case 3: {
                Sphere sphereV = new Sphere();
                sphereV.setR();
                sphereV.setActive();
                System.out.println("Volume: " + (sphereV.getActive() * sphereV.volume()));
            } break;

            default: {
                System.out.println("No action selected, thank you for your attention");
            } break;
        }
    }
}
