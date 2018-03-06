package java8.ex01;

import org.junit.Test;

public class AdditionTest {
	
	@Test
	public void test_1_plus_2() {
		Addition addition = new Addition();
		int resultat = addition.somme(1, 2);
		assert resultat == 3;
	}

}
