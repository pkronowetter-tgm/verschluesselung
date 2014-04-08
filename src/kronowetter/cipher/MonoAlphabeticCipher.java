package kronowetter.cipher;

public class MonoAlphabeticCipher implements Cipher {
	private String secretAlphabet;
	private String normalAlphabet;
	
	
	/**
	 * Defaul- Konstruktor Ebenso befüllt man das Attribute.
	 */
	public MonoAlphabeticCipher(){
		this.normalAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		
	}
	/**
	 * Getter Methode
	 * @return secretAlphabet das verschlüsselte Alphabet
	 */
	
	public String getSecretAlphabet(){
		return secretAlphabet;
		
	}
	/**
	 * Das Secret- Alphabet wird geschaut ob es eh nicht lmehr als 30 sind, da es ja nicht mehr sein können als beim normal Alphabet 
	 * @param secretAlphabet  verschlüsseltes Alphabet
	 * @throws Exception	wird gerufen sobald das SecretAlphabet länger als 30 buchstaben ist
	 */
	protected void setsecretAlphabet(String secretAlphabet) throws IllegalArgumentException{
		if(secretAlphabet.length() != 30)
			throw new IllegalArgumentException();
		this.secretAlphabet = secretAlphabet;
	}
	/**
	 * Methode zum verschlüsseln des Wortes. ich speicher die ganzen  Zeichen in 3 Arrays ab. Mittels toCharArray bekommt jedes Zeichen einen Index im Array
	 * toLowerCase mache ich damit man nur kleinbuchstaben eingeben kann.
	 * 
	 * In der ersten For-Schleife hole ich mir den Text von der Eingab. In der zweiten Forschleife holle ich mir das normale Alphabet. Dann wir der geschaut
	 * ob der Normale Text gleich mit dem Text der eingabe ist. Wenn das der Fall ist wird der text verschlüsselt.
	 * 
	 * @param text Ist die variable die den Text bekommt z.B Hallo
	 * @return verschltext Man bekommt den Verschlüsselten Text
	 */
	@Override
	public String encrypt (String text){ //verschlüsselt
		
		char[] ntext = text.toLowerCase().toCharArray(); // damit nur klein buchstaben eingegeben werden können
		char[] encr = secretAlphabet.toCharArray();
		char[] norm = normalAlphabet.toCharArray();
		
		String verschltext = " ";
		for (int i =0; i<ntext.length; i++){
			boolean gefunden = false;
			for(int j =0; j <norm.length; j++){
				if(ntext[i] == norm[j]){
					verschltext += encr[j];
					gefunden = true;
					break;
				}
			}
			if (gefunden == false){
				verschltext +=ntext[i];
			}
			
		}
		return verschltext;
		
	}
	/**
	 * Methode zum entschlüsseln des Wortes. Ebensospeicher ich die ganzen Zeichen in 3 Arrays ab. Mittels toCharArray bekommt jedes Zeichen einen 
	 * Index im Array  toLowerCase mache ich damit man nur kleinbuchstaben eingeben kann.
	 * 
	 * In der ersten For-Schleife hole ich mir den Text von der Eingab. In der zweiten Forschleife holle ich mir das verschlüsselte Array. Dann wir der geschaut
	 * ob der Normale Text gleich mit dem Verschlüsselten Text der eingabe ist. Wenn das der Fall ist wird der text entschlüsselt
	 * 
	 * @param text Ist die variable die den Text bekommt z.B Hallo
	 * @return entschl Man bekommt das entschlüsselte wort
	 */
	@Override
	public String decrypt(String text){
		
		char[] ntext = text.toLowerCase().toCharArray(); // damit nur klein buchstaben eingegeben werden können
		char[] encr = secretAlphabet.toCharArray();
		char[] norm = normalAlphabet.toCharArray();
		
		String entschl = " ";
		for (int i =0; i<ntext.length; i++){
			boolean gefunden = false;
			for(int j =0; j <encr.length; j++){
				if(ntext[i] == encr[j]){
					entschl +=norm[j];
					gefunden = true;
					break;
				}
			}
			if (gefunden == false){
				entschl +=ntext[i];
			
		}
		
		}
		return entschl;
	}
}
