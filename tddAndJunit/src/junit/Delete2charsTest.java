package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Delete2charsTest {

	@Test
	void test1() {
		Delete2chars delete2chars = new Delete2chars();
		assertEquals("BCD",delete2chars.del("ABCD"));
	}

	@Test
	void test2() {
		Delete2chars delete2chars = new Delete2chars();
		assertEquals("CD",delete2chars.del("AACD"));
	}
	
	@Test
	void test3() {
		Delete2chars delete2chars = new Delete2chars();
		assertEquals("BBAA",delete2chars.del("BBAA"));
	}
	
	@Test
	void test4() {
		Delete2chars delete2chars = new Delete2chars();
		assertEquals("BCD",delete2chars.del("ABCD"));
	}
	
	@Test
	void test5() {
		Delete2chars delete2chars = new Delete2chars();
		assertEquals("BAA",delete2chars.del("AABAA"));
	}
	
	
}
