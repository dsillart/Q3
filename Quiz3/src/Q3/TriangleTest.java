package Q3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

		@Test
		public final void triangleAreaTest() {
			Triangle t = new Triangle(3,4,5);
			assertEquals("6 Expected, actual is 6",(long)t.getArea(),(long)6);
		}

		@Test
		public final void trianglePerimeterTest() {
			Triangle t = new Triangle(3,4,5);
			assertEquals("15 Expected, actual is 15",(long)t.getPerimeter(),(long)15);
		}
			
}