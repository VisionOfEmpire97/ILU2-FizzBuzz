package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
		}

	@Test
	void test_fb1() {
		assertEquals("1",fb.fizzBuzz(1));
	}

	@Test
	void test_fb2() {
		assertEquals("2",fb.fizzBuzz(2));
	}
	
	@Test
	void test_fb3() {
		assertEquals("fizz",fb.fizzBuzz(3));
	}
	
	@Test
	void test_fbNombre() {
		assertEquals("4",fb.fizzBuzz(4));
		assertEquals("13",fb.fizzBuzz(13));
	}
	
	@Test
	void test_fb5() {
		assertEquals("buzz",fb.fizzBuzz(5));
	}
	@Test
	void test_fb6() {
		assertEquals("fizz",fb.fizzBuzz(6));
		assertEquals("buzz",fb.fizzBuzz(400));
		assertEquals("fizz",fb.fizzBuzz(13 * 3));
		assertEquals("buzz",fb.fizzBuzz(13*5));
		assertEquals("401",fb.fizzBuzz(401));
	}
	
	@Test
	void test_fb15() {
		assertEquals("fizzbuzz",fb.fizzBuzz(15));
	}
	
	@Test
	void test_autre() {
		assertEquals("fizzbuzz",fb.fizzBuzz(3*5*1276));
		assertEquals("fizz",fb.fizzBuzz(3*999));
		assertEquals("1001",fb.fizzBuzz(1001));
		assertEquals("fizzbuzz", fb.fizzBuzz(555555));
	}
}
