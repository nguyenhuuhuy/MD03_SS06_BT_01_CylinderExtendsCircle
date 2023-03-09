package BT_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double getArea;
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGetArea() {
        return getArea;
    }

    public void setGetArea(double getArea) {
        this.getArea = getArea;
    }

    public void getArea(){
        double getArea = radius*radius*Math.PI;
        this.getArea = getArea;
    }

    public void display() {
        System.out.println("Bán kính hình tròn" + radius);
        System.out.println("màu của hình tròn: " + color);
        System.out.println("Diện tích hình tròn" + getArea);
    }

    @Override
    public String toString() {
        return "Thuộc tính ban đầu của lớp cha: "+"Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", getArea=" + getArea +
                '}';
    }
}
