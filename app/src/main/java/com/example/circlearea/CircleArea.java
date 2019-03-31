package com.example.circlearea;

public class CircleArea {
   private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
       this.radius = radius;
    }

    public double areaofCircle(){
        double result;
       result = (Math.PI * radius* radius);
       return result;
    }

}
