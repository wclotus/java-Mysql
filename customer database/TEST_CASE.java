import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TEST_CASE {

	@Test
	void test() {
		account admin = new admin("A", "b");
		String output = admin.toString();
		String expected = "account [username=A,password=b]";
		assertEquals(expected, output);
	}

	@Test
	void test1() {
		account admin = new admin("A", "b");
		String output = admin.getUsername();
		String expected = "A";
		assertEquals(expected, output);

	}
	
	@Test
	void test2() {
		account admin = new admin("A", "b");
		String output = admin.getPassword();
		String expected = "b";
		assertEquals(expected, output);

	}

}
