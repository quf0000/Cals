package hansung;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculate {

	@Test
	public void test() {
		Cals c = new Cals();
		int k = c.add(1,4);
		assertEquals(k,5);
	}

}
