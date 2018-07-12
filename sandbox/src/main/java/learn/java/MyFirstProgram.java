package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

       /*hello("world");
       hello("user");
       hello("Roman");*/

       //double len = 5;
       //area(5);
       //area(8);

       double a = 3;
       double b = 4;
       System.out.println("Площадь прямоугольника со сторонами " + a + ", " + b + " = " + area(a, b));

    }

    /*public static void hello (String s) {

        System.out.println("Hello, " + s + "!");
    }*/
    //public static double area(double l) {
        //System.out.println("Площадь квадрата со стороной " + l + " = " + l * l);
        //return l * l;
   // }

    public static double area (double a, double b) {
        return a * b;

    }
}