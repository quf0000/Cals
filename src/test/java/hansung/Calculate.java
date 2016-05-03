package hansung;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculate {

	@Test
	public void test() {
		Cals c = new Cals();
		int k = c.add(1,2);
		int l = c.sub(5,1);
		assertEquals(k,3);
		assertEquals(l,4);
	}

}
