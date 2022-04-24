package com.DrinksRest.RestDrinks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class restDrinksApplicationTests {

	@Test
	void contextLoads() {
	}

	/**
	 * getValueTest should receive a value of 32
	 */

	@Test
	void getValueTest() {

		DrinksController drinksController = new DrinksController();
		Assertions.assertEquals(32, drinksController.getValue("10", "22"));
	}

	@Test
	void getMappingResponseForGet(){

		DrinksController drinksController = new DrinksController();
		Assertions.assertSame("HTTP POST drink request has been sent", drinksController.createMethodDrink());
	}

	@Test
	void drinksNamesArrayList(){

		DrinksController drinks = new DrinksController();
		Assertions.assertEquals(5, drinks.getDrinkNames().size());
		Assertions.assertTrue("mai tai" == drinks.getDrinkNames().get(0));
		Assertions.assertTrue("miami vice" == drinks.getDrinkNames().get(4));
		Assertions.assertFalse(drinks.getDrinkNames().contains("pina colada"));
	}
}
