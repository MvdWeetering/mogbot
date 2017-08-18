package codebase;

public class contentReader {

	public static String GetContent(String Bericht, String Gebruiker) {

		String Reactie = null;

		Bericht = Bericht.toLowerCase();

		switch (Bericht) {

		case "!commands":
			Reactie = "We have the following commands: hello, insult, hug <user>, slap <user>, kick <user>, God?, joke | All commands need an ! before them";
			break;
		case "!hello":

			if (Gebruiker.equalsIgnoreCase("Teefy")) {
				Reactie = "Hello, beautiful /wink";
			} 
			else if (Gebruiker.equalsIgnoreCase("Icestorm")) {
				Reactie = "Hello, you Manly Man";
			}
			else if (Gebruiker.equalsIgnoreCase("Mog_no_1")) {
				Reactie = "All bow before the Great Leader and Captain ! hi Mog :)";
			}
			else {
				Reactie = "Hello, " + Gebruiker + ". Its good to see the plebs has found their way here";
			}
			break;

		case "!insult":
			Reactie = "Fuck off, you " + loadInsults.returnInsult();
			break;
		case "!hug":
			Reactie = "c'mere, lets give you a hug !";
			break;
		case "!god?":
			Reactie = "All bow before the overlord, Our Saviour, Mog the Merciful, the Bringer of Pain and Suffering !";
			break;
		case "!joke":
			Reactie = jokes.loadJoke();
		
		}

		if (Bericht.contains("!kick ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "/Kicks " + Victim + " in the balls";
		}

		if (Bericht.contains("!hug ")) {
			String Victim = null;
			Victim = Bericht.substring(5, Bericht.length());
			Reactie = "/Hugs " + Victim + "... Awww !!!";
		}

		if (Bericht.contains("!slap ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "/Slaps " + Victim + " accross the face. Ouch !!!";
		}	

		return Reactie;

	}

	public static void main(String[] args) {

		System.out.println(GetContent("!slap teefy", "Teefy"));

	}

}
