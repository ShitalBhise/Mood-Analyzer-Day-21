

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
	@Test
	public  anymood_should returnHappy() {
		moodanalyzer.setMessage("I am in Any Mood");
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}

	/**
	 * we have created this method for null exception handle Null Mood Should Return
	 * Happy
	 */
	@Test
	public void NullexceptionHadle() {
		moodanalyzer.setMessage(null);
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("Happy", result);
	}

}
