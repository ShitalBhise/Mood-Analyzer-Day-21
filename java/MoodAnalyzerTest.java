
public class MoodAnalyzerTest {
	/*
	 * we are converting the passing message to lower case and checking the contains
	 * happy or sad word and if happy and sad present then we can return values
	 */
	String message;;

	/* getter setter created for string Message */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/* default constructor */
	public MoodAnalyzer() {

	}

	/* Parameterized constructor */
	public void MoodAnalyzer(String message) {
		this.message = message;

	}
	
	public String analyseMood() {

		try {
			if (message.toLowerCase().contains("happy")) {
				return "HAPPY";
			} else if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else if (message.toLowerCase().contains("any")) {
				return "HAPPY";
			} else
				return "ANY";

		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}
