package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();
		i = new Inventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	@Test
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	@Test
	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	@Test
	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	@Test
	public void testAddInventory1() {
		assertTrue(cm.addInventory(30, 10, 10, 10));
	}
	
	@Test
	public void testAddInventory2() {
		assertFalse(cm.addInventory(-50, 10, 10, 10));
	}
	
	@Test
	public void testAddInventory3() {
		assertFalse(cm.addInventory(30, -50, 10, 10));
	}
	
	@Test
	public void testAddInventory4() {
		assertFalse(cm.addInventory(30, 10, -50, 10));
	}
	
	@Test
	public void testAddInventory5() {
		assertFalse(cm.addInventory(30, 10, 10, -50));
	}
	
	@Test
	public void testAddInventory6() {
		i.setCoffee(5);
		
		cm.addInventory(1,1,1,1);
		int j = i.getCoffee();
		
		if(j != 6){
			fail();
		} 
	}
	
	@Test
	public void testAddInventory7() {
		i.setChocolate(5);
		
		cm.addInventory(1,1,1,1);
		int j = i.getChocolate();
		
		if(j != 6){
			fail();
		} 
	}
	
	@Test
	public void testAddInventory8() {
		i.setMilk(5);
		
		cm.addInventory(1,1,1,1);
		int j = i.getMilk();
		
		if(j != 6){
			fail();
		} 
	}
	
	@Test
	public void testAddInventory9() {
		i.setSugar(5);
		
		cm.addInventory(1,1,1,1);
		int j = i.getSugar();
		
		if(j != 6){
			fail();
		} 
	}
	
	@Test
	public void testCheckInventory1() {
		try{
			cm.checkInventory();
		} catch(Exception e){}
	}
	
	@Test
	public void testCheckInventory2() {
		if(cm.checkInventory() == null){
			fail();
		}
	}
	
	@Test
	public void testpurchaseBeverage1() {
		cm.addRecipe(r1);
		
		int amtPaid = 50;
		assertEquals(cm.makeCoffee(r1, amtPaid), 0, .001);
	}
	
	@Test
	public void testpurchaseBeverage2() {
		cm.addRecipe(r1);
		
		assertEquals(cm.makeCoffee(r1, 1), 1, .001);
	}
	
	@Test
	public void testpurchaseBeverage3() {
		cm.addRecipe(r1);
		int amtPaid = 50;
		
		int j = i.getCoffee();
		cm.makeCoffee(r1, amtPaid);
		assertEquals(i.getCoffee(), j - r1.getAmtCoffee());
	}
	
	@Test
	public void testpurchaseBeverage4() {
		cm.addRecipe(r1);
		int amtPaid = 50;
		
		int j = i.getChocolate();
		cm.makeCoffee(r1, amtPaid);
		assertEquals(i.getChocolate(), j - r1.getAmtChocolate());
	}
	
	@Test
	public void testpurchaseBeverage5() {
		cm.addRecipe(r1);
		int amtPaid = 50;
		
		int j = i.getMilk();
		cm.makeCoffee(r1, amtPaid);
		assertEquals(i.getMilk(), j - r1.getAmtMilk());
	}
	
	@Test
	public void testpurchaseBeverage6() {
		cm.addRecipe(r1);
		int amtPaid = 50;
		
		int j = i.getSugar();
		cm.makeCoffee(r1, amtPaid);
		assertEquals(i.getSugar(), j - r1.getAmtSugar());
	}
	
	@Test
	public void testGetRecipes1() {
		try{
			cm.getRecipes();
		}catch(Exception e){
			fail();
		}
	}
	
	@Test
	public void testGetRecipes2() {
		assertFalse(cm.getRecipes() == null);
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/29/16 11:09 AM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
	}
}