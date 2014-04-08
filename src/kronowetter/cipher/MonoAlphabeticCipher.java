package kronowetter.cipher;

public class MonoAlphabeticCipher  {
	private String  secretAlphabet;
	
	public MonoAlphabeticCipher(){
		this.secretAlphabet =" abcdefghijklmnopqrstuvwxyzäöüß";
		
	}
	
	public String getSecretAlphabet(){
		return secretAlphabet;
		
	}
	
	protected void setsecretAlphabet(String seccretAlphabet){
		
	}
}
