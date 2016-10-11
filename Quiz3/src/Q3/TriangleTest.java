package Q3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import TriangleExceptions.TriangleException;

public class TriangleTest {

		@Test
		public final void triangleAreaTest() throws TriangleException {
			
			try {
				Triangle t = new Triangle(3,4,5);
				assertEquals("6 Expected, actual is 6",(long)t.getArea(),(long)6);
				Triangle r = new Triangle(3,4,13);
				assertEquals("undefined Expected, actual is undefined",(long)r.getArea(),(long)6);
			}
				catch(TriangleException e) {
					System.out.println("TriangleException caught: Impossible Triangle");
				}
		}

		@Test
		public final void trianglePerimeterTest() throws TriangleException {
			
			try {
			Triangle t = new Triangle(3,4,5);
			assertEquals("15 Expected, actual is 15",(long)t.getPerimeter(),(long)15);
			Triangle r = new Triangle(3,4,13);
			assertEquals("undefined Expected, actual is undefined",(long)r.getPerimeter(),(long)6);
			}
			catch(TriangleException e) {
				System.out.println("TriangleException caught: Impossible Triangle");
			}
	}
			
}