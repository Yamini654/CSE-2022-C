package internal;

interface shape {
     void printArea();
    }
    class Rectangle implements shape {
     int length;
     int width;

     Rectangle(int length, int width) {
         this.length = length;
         this.width = width;
     }

     public void printArea() {
         int area = length * width;
         System.out.println("Area of Rectangle: " + area);
     }
    }

    class Triangle implements shape {
     private int base;
     private int height;

     Triangle(int base, int height) {
         this.base = base;
         this.height = height;
     }
     public void printArea() {
         double area = 0.5 * base * height;
         System.out.println("Area of Triangle: " + area);
     }
    }


    class Circle implements shape {
     private int radius;

     Circle(int radius) {
         this.radius = radius;
     }
     public void printArea() {
         double area = Math.PI * radius * radius;
         System.out.println("Area of Circle: " + area);
     }
    }

public class area{
        
         public static void main(String[] args) {
           
             Rectangle rectangle = new Rectangle(4, 5);
             Triangle triangle = new Triangle(3, 6);
             Circle circle = new Circle(3);
             rectangle.printArea();
             triangle.printArea();
             circle.printArea();
         }
        }