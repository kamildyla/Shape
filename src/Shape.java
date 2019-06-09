import java.util.InputMismatchException;
import java.util.Scanner;

public class Shape {

    // attributes
    private double r;
    private boolean active;

    // constructor
    public Shape (double r) {
        this.r = r;
    }

    // default constructor
    public Shape() {
        this(1);
    }

    // methods
    Scanner sc = new Scanner(System.in);

    public void data() {
        System.out.println("side = " + r);
    }

    public double field ()
    {
        return r*r;
    }

    // getters
    public int getActive() {
        if (active == true) {
            return 1;
        }
        else return 0;
    }

    public double getR()
    {
        return r;
    }

    // setters
    public void setActive () {
        boolean a = false;
        System.out.println(" ");
        System.out.println("Only for active figures, calculations are possible");
        System.out.print("Do you want to activate the figure (y/n) ?:  ");
        String x = sc.next();
        if (x.equals("y") || x.equals("Y")) {
            a = true;
        }
        active = a;
    }

    public void setR ()
    {
        // try, catch
        try {
            double b = sc.nextDouble();
            this.r = b;
        } catch (InputMismatchException e) {
            System.out.println("Data has been incorrectly entered");
        }
    }
}
