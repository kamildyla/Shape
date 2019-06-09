public class Circle extends Shape {

    @Override
    public double field() {
        //return super.field(r);
        return (Math.PI*getR()*getR());
    }

    @Override
    public void setR() {
        System.out.print("Enter the radius of the circle : ");
        super.setR();
    }

    @Override
    public void setActive() {
        super.setActive();
    }
}
