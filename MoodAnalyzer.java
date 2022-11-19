package bridgeLabzs;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	// method to return mood
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
	}

	// Method for analyze respond Happy or Sad Mood
	// return : HAPPY or SAD

	public String analyseMood() throws MoodAnalysisException {

    	try {
        if (message.contains("SAD"))
            return "SAD";
        else if (message.contains(""))
        		throw new MoodAnalysisException("Empty input");
        else
            return "HAPPY";
        
    }catch (NullPointerException e) {
    	
    	throw new MoodAnalysisException("Null Input");
    }
    }

	public static void main(String[] args) throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
		String result = moodAnalyzer.analyseMood();
		System.out.println(result + " MOOD");
	}
}
