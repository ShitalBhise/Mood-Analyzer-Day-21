

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerMain {
	MoodAnalyzerTest moodanalyzer = new MoodAnalyzerTest();
	@Test
	public void givenMsg_Proper_ShouldReturnSad() {

		String result = MoodAnalyzerTest.analyseMood("I'm in Sad Mood");
		Assert.assertEquals("SAD", result);
	}
	@Test
	public void givenMsg_Proper_AnyMood_ShouldReturnHAPPY() {

		String result = moodanalyzer.analyseMood("I am in Any Mood");

		Assert.assertEquals("HAPPY", result);
	}

}
