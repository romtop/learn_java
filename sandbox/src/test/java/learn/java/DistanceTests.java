package learn.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import static learn.java.MyFirstProgram.distance;

public class DistanceTests {

   @Test // 1. Test for function, positive quadrants
      public void testDistance1 () {
      Point p1 = new Point(4, 6);
      Point p2 = new Point(2, 3);
      Assert.assertEquals (distance( p1, p2), 3.605551275463989);
   }

   @Test // 2. Test for function, positive and negative quadrants
   public void testDistance2 () {
      Point p1 = new Point(-4, 6);
      Point p2 = new Point(2, -3);
      Assert.assertEquals (distance( p1, p2), 10.816653826391969);
   }
}
