
package test;

import static org.junit.Assert.*;

import org.junit.*;

import kronowetter.cipher.MonoAlphabeticCipher;
import kronowetter.cipher.SubstitutionCipher;


public class test {


	/**
	 * Es wird ein geheimes Alphabet erstellt und dann wird es mittels equale vergliechen ob das selbe Alphabet 
	 * zur�ck gegeben wird.
	 */
	@Test
	public void test1(){
		SubstitutionCipher su = new SubstitutionCipher("qwertzuiop��asdfghjkl��yxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiop��asdfghjkl��yxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird ge�ndert 
	 * 
	 */
	@Test
	public void test2(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		su.setSecretAlphabet("qwertzuiop��asdfghjkl��yxcvbnm");
		assertTrue(su.getSecretAlphabet().equals("qwertzuiop��asdfghjkl��yxcvbnm"));
	}
	
	/**
	 * Das Geheimalphabet wird in diesem test so getestet, dass die Exception geworfen werden sollte
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test3(){
		SubstitutionCipher su = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		su.setSecretAlphabet("qwer");
	}
	
}
