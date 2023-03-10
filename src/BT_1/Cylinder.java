package BT_1;

public class Cylinder extends Circle{
    private double height=1.0;
    private double cylindricalVolume;
    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getCylindricalVolume() {
        double getCylindricalVolume = this.getRadius()*this.getRadius()*height*Math.PI;
        this.cylindricalVolume = getCylindricalVolume;
    }
    @Override
    public String toString() {
        return super.toString()+ "\nLớp con kế thừa lớp cha và thêm thuộc tính độ dài:  Cylinder{" +
                "height=" + height
                +", có thể tích: "
                +cylindricalVolume
                +'}';
    }
}
