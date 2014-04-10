
package test;

import static org.junit.Assert.*;

import org.junit.*;

import kronowetter.cipher.MonoAlphabeticCipher;
import kronowetter.cipher.SubstitutionCipher;


public class test {


	/**
	 * Es wird ein geheimes Alphabet erstellt und dann wird es mittels equale vergliechen ob das selbe Alphabet 
	 * zurück gegeben wird.
	 */
	@Test
	public void test1(){
		SubstitutionCipher su = new SubstitutionCipher("qwertzuiopüßasdfghjklöäyxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiopüßasdfghjklöäyxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird geändert 
	 * 
	 */
	@Test
	public void test2(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		su.setSecretAlphabet("qwertzuiopüßasdfghjklöäyxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiopüßasdfghjklöäyxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird in diesem test so getestet, dass die Exception geworfen werden sollte
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test3(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		su.setSecretAlphabet("qwer");
	}
	
}
