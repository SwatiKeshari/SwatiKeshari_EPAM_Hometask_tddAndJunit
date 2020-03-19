package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Delete2charsTest {

	@Test
	void test1() {
		Delete2chars delete2chars = new Delete2chars();
		String actual = delete2chars.del("ABCD");
		assertEquals("BCD",actual);
	}

	@Test
	void test2() {
		Delete2chars delete2chars = new Delete2chars();
		String actual = delete2chars.del("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void test3() {
		Delete2chars delete2chars = new Delete2chars();
		String actual = delete2chars.del("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void test4() {
		Delete2chars delete2chars = new Delete2chars();
		String actual = delete2chars.del("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void test5() {
		Delete2chars delete2chars = new Delete2chars();
		String actual = delete2chars.del("AABAA");
		assertEquals("BAA",actual);
	}
	
	
}
