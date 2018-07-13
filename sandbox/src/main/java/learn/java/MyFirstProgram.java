package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

       Area r = new Area(3, 4);

       Sum s = new Sum(2, 6);

       System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
       System.out.println("Сумма сторон прямоугольника, составлящих " + s.c + " и " + s.d + ", равна " + s.area());

    }

}