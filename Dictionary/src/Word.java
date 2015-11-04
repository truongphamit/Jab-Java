
public class Word implements Comparable<Word>{
	private String word;
	private String result;
	
	public Word() {
		// TODO Auto-generated constructor stub
	}

	public Word(String word, String result) {
		this.word = word;
		this.result = result;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public int compareTo(Word o) {
		return word.compareTo(o.getWord());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Word) {
			return ((Word)obj).getWord().equals(word);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return word + "\t" + result;
	}
}
