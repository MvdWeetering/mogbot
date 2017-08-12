package codebase;

import java.util.function.IntSupplier;

public class contentReader {

	public static String GetContent(String Bericht, String Gebruiker) {

		String Reactie = null;

		Bericht = Bericht.toLowerCase();

		switch (Bericht) {

		case "!commands":
			Reactie = "We have the following commands: !hello, !insult, !hug, !slap, !kick";
			break;
		case "!hello":
			Reactie = "Hello, " + Gebruiker;
			break;
		case "!insult":
			Reactie = "Fuck off, you " + loadInsults.returnInsult();
			break;
		case "!hug":
			Reactie = "c'mere, lets give you a hug !";
			break;
		case "!slap":
			Reactie = "/Slaps Mog accross the face ";
			break;
		case "!kick":
			Reactie = "/Kicks Mog in the Roo testicles. Hurts, doesn't it !";
			break;

		}

		return Reactie;

	}
	

}
