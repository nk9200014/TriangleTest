import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TriangleTest {
	
	@Test
	public void test1() {
		Triangle testT = new Triangle();
		String expectation = "不是三角形";
		String resule = testT.IsTriangle(7, 3, 4);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test2() {
		Triangle testT = new Triangle();
		String expectation = "等腰鈍角三角形";
		String resule = testT.IsTriangle(5, 5, 9);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test3() {
		Triangle testT = new Triangle();
		String expectation = "鈍角三角形";
		String resule = testT.IsTriangle(5, 6, 10);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test4() {
		Triangle testT = new Triangle();
		String expectation = "直角三角形";
		String resule = testT.IsTriangle(3, 4, 5);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test5() {
		Triangle testT = new Triangle();
		String expectation = "正三角形";
		String resule = testT.IsTriangle(6, 6, 6);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test6() {
		Triangle testT = new Triangle();
		String expectation = "等腰銳角三角形";
		String resule = testT.IsTriangle(5, 5, 2);
		assertEquals(expectation,resule);
	}
	
	@Test
	public void test7() {
		Triangle testT = new Triangle();
		String expectation = "銳角三角形";
		String resule = testT.IsTriangle(7, 6, 5);
		assertEquals(expectation,resule);
	}

}
