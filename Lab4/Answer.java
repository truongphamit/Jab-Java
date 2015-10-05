
public class Answer {
	private char answer[];
	private int score;

	public Answer() {

	}

	public Answer(char answer[], int score) {
		this.answer = answer;
		this.score = score;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
