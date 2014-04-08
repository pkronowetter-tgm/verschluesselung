package kronowetter.cipher;

	
public class SubstitutionCipher extends MonoAlphabeticCipher{
		
		public SubstitutionCipher(String secretAlphabet){
			this.setSecretAlphabet(secretAlphabet);
		}

		public void setSecretAlphabet(String secretAlphabet){
			super.setsecretAlphabet(secretAlphabet);
		}
}

