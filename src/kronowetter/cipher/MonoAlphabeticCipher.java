package kronowetter.cipher;

public class MonoAlphabeticCipher  {
	private String  secretAlphabet;
	
	public MonoAlphabeticCipher(){
		this.secretAlphabet =" abcdefghijklmnopqrstuvwxyz����";
		
	}
	
	public String getSecretAlphabet(){
		return secretAlphabet;
		
	}
	
	protected void setsecretAlphabet(String seccretAlphabet){
		
	}
}
