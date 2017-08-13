package codebase;

public class contentReader {

	public static String GetContent(String Bericht, String Gebruiker) {

		String Reactie = null;

		Bericht = Bericht.toLowerCase();

		switch (Bericht) {

		case "!commands":
			Reactie = "We have the following commands: hello, insult, hug, slap, kick <user>, God? | All commands need an ! before them";
			break;
		case "!hello":

			if (Gebruiker.equalsIgnoreCase("Teefy")) {
				Reactie = "Hello, beautiful /wink";
			} else {
				Reactie = "Hello, " + Gebruiker;
			}
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
		case "!god?":
			Reactie = "All bow before the overlord, Our Saviour, Mog the Merciful, the Bringer of Pain and Suffering !";
			break;
		}

		if (Bericht.contains("!kick ")) {

			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "/Kicks " + Victim + " in the balls";

		}

		return Reactie;

	}

	public static void main(String[] args) {

		System.out.println(GetContent("!kick Mog_No_1", "Teefy"));

	}

}
