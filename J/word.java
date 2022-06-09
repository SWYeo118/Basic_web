package main;

public class word {
	public static void main(String[] args) {
	word word = new word("apple");
	System.out.println(word.isVowel(0));
	}

	private String letters;

	public word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a");
	}
}
