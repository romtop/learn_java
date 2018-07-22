package learn.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

   @Test // 1. Test for method, common case
      public void testDistance1 () {
      Point p1 = new Point(4, 6);
      Point p2 = new Point(2, 3);
      assert (p1.distance(p2) == 3.605551275463989);
   }

   @Test // 2. Test for method, positive quadrants
   public void testDistance2 () {
      Point p1 = new Point(4, 6);
      Point p2 = new Point(2, 3);
      Assert.assertEquals (p1.distance(p2), 3.605551275463989);
   }

   @Test // 2. Test for method, positive and negative quadrants
   public void testDistance3 () {
      Point p1 = new Point(-4, 6);
      Point p2 = new Point(2, -3);
      Assert.assertEquals (p1.distance(p2), 10.816653826391969);
   }
}
