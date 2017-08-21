package codebase;

import java.util.function.IntSupplier;

public class contentReader {

	private static boolean mogon;
	
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
			} else if (Gebruiker.equalsIgnoreCase("Icestorm")) {
				Reactie = "Hello, you Manly Man";
			} else if (Gebruiker.equalsIgnoreCase("Mog_no_1")) {
				Reactie = "All bow before the Great Leader and Master ! hi Mog :)";
			} else {
				Reactie = "Hello, " + Gebruiker + ". Its good to see the plebs has found their way here";
			}
			break;

		case "!insult":
			Reactie = "Fuck off, you " + loadInsults.returnInsult();
			break;
		case "!hug":
			Reactie = "c'mere, lets give you a hug !";
			break;
		case "!online":
			Reactie = "Mogbot online. hello my minions!";
			break;
		case "!bringcoffee":
			Reactie = "Get your own coffee. lazy wanker!";
			break;
		case "!god?":
			Reactie = "All bow before the overlord, Our Saviour, Mog the Merciful, the Bringer of Pain and Suffering !";
			break;
		case "!joke":
			Reactie = jokes.loadJoke();
			break;
		case "!name":
			Reactie = NameGenerator.generateName();
			break;
		case "!roo":
			Reactie = "The only good Roo is the one on my dinner plate. HAHA ! ";
			break;
		case "!shitgold":
			Reactie = "The only thing you're shitting is :poop: ! ";
			break;
		case "!spider":
			Reactie = "mogbot watches as Mog gets eaten by a giant spider. ";
			break;
		case "!coffee":
			Reactie = "Get your own coffee. do i look like the waiter ?";
			break;
		case "!wafflecunt":
			Reactie = "All hail our Master Wafflecunt, VuduePriest. HAIL !";
			break;
		case "!rooballs":
			Reactie = "Mog eats roo balls for breakfast!";
			break;
		case "!ibis":
			Reactie = "http://i.imgur.com/uluX2Gd.gifv";
			break;
		case "!boo":
			Reactie = "http://gph.is/17h4Snw";
			break;
		case "!aww":
			Reactie = "http://gph.is/15zmlbN";
			break;

		case "!mogstatus":
			Reactie = Boolean.toString(mogon);
			break;
	
		default:
			if (Gebruiker.equalsIgnoreCase("Mog_no_1") && mogon) {
			Reactie = "Shut up " + loadInsults.returnInsult() + " !!";
			break;
			}
				
			}



		if (Bericht.contains("!kick ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "/Kicks " + Victim + " in the balls";
		}

		if (Bericht.contains("!mogon") && !Gebruiker.equalsIgnoreCase("Mog_no_1")) {
			mogon = true;
		}
		
		if (Bericht.contains("!mogoff") && !Gebruiker.equalsIgnoreCase("Mog_no_1")) {
			mogon = false;
			
		}
	
		if (Bericht.contains("!coffee ")) {
			String Victim = null;
			Victim = Bericht.substring(8, Bericht.length());
			Reactie = " Mogbot serves a lovely steaming hot coffee to " + Victim;
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

		System.out.println(GetContent("!coffee", "Teefy"));

	}

}
