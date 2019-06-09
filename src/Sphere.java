import static java.lang.Math.pow;

public class Sphere extends Shape {

    @Override
    public double field() {
        //return super.field();
        return (4 * Math.PI * pow(getR(), 2));
    }

    public double volume() {
        return ((4 * Math.PI * pow(getR(), 3))/3);
    }

    @Override
    public void setR() {
        System.out.print("Enter the radius of the sphere : ");
        super.setR();
    }

    @Override
    public void setActive() {
        super.setActive();
    }
}
