package codebase;

public class ContentFilter {

	public static String FilteredMessge(String Message, String Gebruiker) {

		String ReturnMessage = null;

		if (Gebruiker.equalsIgnoreCase(contentReader.Cursevictim) && contentReader.cursed == true) {
		
			
			
			
			ReturnMessage = curse.CastCurse(Message, Gebruiker);
		}

		else {
			ReturnMessage = contentReader.GetContent(Message, Gebruiker);
		}

		return ReturnMessage;

	}

	public static void main(String[] args) {

		System.out.println(FilteredMessge("!coffee", "Teefy"));

	}

}
