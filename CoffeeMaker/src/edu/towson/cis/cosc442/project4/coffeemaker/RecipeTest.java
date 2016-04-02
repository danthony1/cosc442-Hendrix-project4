package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName((String) null);
		Recipe r = new Recipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("Nope");
		Recipe r = new Recipe();
		r.setName("");

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe r1 = new Recipe();
		r1.setName("Coffee");
		
		Recipe r = new Recipe();
		r.setName("Coffee");

		boolean result = r1.equals(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	@Test
	public void testEquals_4()
		throws Exception {
		Recipe r1 = new Recipe();
		r1.setName("");
		
		Recipe r = new Recipe();
		r.setName("Coffee");

		boolean result = r1.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_5()
		throws Exception {
		Recipe r1 = new Recipe();
		r1.setName(null);
		
		Recipe r = new Recipe();
		r.setName("Coffee");

		boolean result = r1.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtChocolate = -1;
		
		fixture.setAmtChocolate(amtChocolate);
		assertEquals(fixture.getAmtChocolate(), 0, .001);
		
		// add additional test code here
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);

		// add additional test code here
	}
	
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtChocolate = 0;
		
		fixture.setAmtChocolate(amtChocolate);
		assertEquals(fixture.getAmtChocolate(), 0, .001);
		
		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}
	
	@Test
	public void testSetAmtCoffee_3()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtCoffee = 0;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}
	
	@Test
	public void testSetAmtMilk_3()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtMilk = 0;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}
	
	@Test
	public void testSetAmtSugar_3()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int amtSugar = 0;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int price = -1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/29/16 2:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}
