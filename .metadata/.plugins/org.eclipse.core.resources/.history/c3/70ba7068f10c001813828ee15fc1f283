/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("is very nice") >= 0){
			response = "I am very nice too";
		}
		else if (statement.indexOf("hello") >= 0
				|| statement.indexOf("greetings") >= 0){
			response = "Hello.";
		}
		else if (statement.indexOf("why") >= 0 ){
			response = "Why indeed? I wonder.";
		}
		else if (statement.indexOf("who are you") >= 0){
			response = "I am a chatbot.";
		}
		else if (statement.indexOf("who") >= 0){
			response = "I don't know. Your mother perhaps?";
		}
		else if (statement.indexOf("sorry") >= 0){
			response = "You are forgiven.";
		}
		else if (statement.indexOf("when") >= 0){
			response = "Last year, maybe?";
		}
		else if (statement.indexOf("you") >= 0 &&
				statement.indexOf("bot") >= 0){
			response = "Indeed, I am a bot.";
		}
		else if (statement.indexOf("yes") >= 0){
			response = "Okay.";
		}
		else if (statement.indexOf("thank") >= 0){
			response = "You are welcome.";
		}
		else if (statement.equals("")){
			response = "Speak up, please.";
		}
		else 
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
