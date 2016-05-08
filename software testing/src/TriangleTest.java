import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	@Test
	public void test2() {
		Triangle triangle=new Triangle();
		assertEquals( 0,Triangle.ifTri(0,2,3));
		assertEquals( 1,Triangle.ifTri(5,4,3));
		assertEquals( 0,Triangle.ifTri(0,0,0));
		assertEquals( 2,Triangle.kindTri(5,4,3));
		assertEquals( 3,Triangle.kindTri(5,4,2));
		assertEquals(1,Triangle.kindTri(3,4,3));
		assertEquals(4,Triangle.kindTri(7,5,6));
	}
	
	
}
