import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MovieTest {
	Movie movie1;
	@Before
	public void setUp() throws Exception {
		movie1 = new Movie("abc",1000);
	}

	@Test
	public void testMovie() {
		
	}

	@Test
	public void testPriceCode() {
		
	}

	@Test
	public void testGetName() {
		assertEquals("abc",movie1.getName());
	}

}
