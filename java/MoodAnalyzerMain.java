

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerMain {
	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void Happymessage() {

		String result = moodanalyzer.analyseMood("i am in Happy Mood");

		Assert.assertEquals("HAPPY", result);
	}
}
