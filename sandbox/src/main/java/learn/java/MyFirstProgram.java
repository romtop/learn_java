package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

       Area r = new Area(3, 4);

       Sum s = new Sum(2, 6);
      
       System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + area(r));
       System.out.println("Сумма сторон прямоугольника, составлящих " + s.c + " и " + s.d + ", равна " + area(s));

    }

    public static int area (Area r) {
        return r.a * r.b;

    }

    public static int area (Sum s) {
        return s.c + s.d;

    }
}