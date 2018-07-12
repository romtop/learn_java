package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

       int a = 3;
       int b = 4;
       int c = 2;
       int d = 2;
       System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));
       System.out.println("Сумма сторон прямоугольника, составлящих " + c + " и " + d + ", равна " + sum(c, d));

    }

    public static int area (int a, int b) {
        return a * b;

    }

    public static int sum (int c, int d) {
        return c + d;

    }
}