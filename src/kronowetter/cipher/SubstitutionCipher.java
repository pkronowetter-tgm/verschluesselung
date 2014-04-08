package kronowetter.cipher;

	
public class SubstitutionCipher extends MonoAlphabeticCipher{
		
		public SubstitutionCipher(String secretAlphabet){
			this.setSecretAlphabet(secretAlphabet);
		}

		public void setSecretAlphabet(String secretAlphabet){
			super.setsecretAlphabet(secretAlphabet);
		}
		public static void main(String[] args) {
			String secret = "qaywsxedcrfvtgbzhnujmikolpöäüß"; //zum testen
			SubstitutionCipher s = new SubstitutionCipher(secret);
			String text = "hallo, das ist ein test";
			String enc = s.encrypt(text);
			System.out.println(enc);
			String norm = s.decrypt(enc);
			System.out.println(norm);
			
		}
}

