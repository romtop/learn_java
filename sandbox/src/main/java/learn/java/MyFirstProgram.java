package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

       Area r = new Area();
       r.a = 3;
       r.b = 4;

       Sum s = new Sum();
       s.c = 2;
       s.d = 2;
       System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + area(r));
       System.out.println("Сумма сторон прямоугольника, составлящих " + s.c + " и " + s.d + ", равна " + sum(s));

    }

    public static int area (Area r) {
        return r.a * r.b;

    }

    public static int sum (Sum s) {
        return s.c + s.d;

    }
}