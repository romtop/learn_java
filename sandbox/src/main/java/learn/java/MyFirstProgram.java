package learn.java;

public class MyFirstProgram {

    public static void main(String[] args) {

        Point p1 = new Point(4, 6);
        Point p2 = new Point(2, 3);

        System.out.println ("Расстояние между точкой A с координатами " + p1.x + ", " + p1.y + " и точкой В с координатами " + p2.x + ", " + p2.y + " = " + p1.distance(p2));


       //Area r = new Area(3, 4);
       //Sum s = new Sum(2, 6);
       /*System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
       System.out.println("Сумма сторон прямоугольника, составлящих " + s.c + " и " + s.d + ", равна " + s.area());*/

        }
      /*public static double distance(Point p1, Point p2) {
      return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
   }*/
  }



