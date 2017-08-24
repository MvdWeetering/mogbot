package codebase;

import java.util.Random;
import java.util.function.IntSupplier;

import org.hamcrest.core.IsNull;

import net.dv8tion.jda.core.entities.User;

public class contentReader {

	public static boolean cursed = false;
	public static String Cursevictim = "";
	public static int SelectedCurse;
	static int counter;
	
	public static String GetContent(String Bericht, String Gebruiker) {

		String Reactie = null;
		Bericht = Bericht.toLowerCase();

		switch (Bericht) {

		case "!commands":
			Reactie = "We have the following commands: insult,hug,online,bringcoffee,god?,joke,roo,shitgold,spider,coffee,wafflecunt,rooballs,ibis,boo,aww,beer,kick<user>,hug<user>,coffee<user>,slap<user> | All commands need an ! before them";
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
		case "!news":
			Reactie = "yes. there's news. yey..";
			break;
		case "!aww":
			Reactie = "http://gph.is/15zmlbN";
			break;
		
		case "!beer":
			Reactie = "https://cruxnow.com/wp-content/uploads/2017/03/Beer_Credit_Africa_Studio_Shutterstock_CNA.jpeg"
					+ "\n Bottoms up ! Or as the Dutch say: Proost !!!";
			break;

		case "!cursed":

			if (cursed == false) {
				Reactie = "Mogbot the Merciful has not cursed anyone. yet..";
			} else {
				Reactie = "Mogbot the terrible has cursed " + Cursevictim;
			}
			break;

		case "!liftcurse":

			Reactie = liftCurse(Cursevictim);

			break;

		// https://cruxnow.com/wp-content/uploads/2017/03/Beer_Credit_Africa_Studio_Shutterstock_CNA.jpeg

		}

		if (Bericht.contains("!kick ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "*/Kicks " + Victim + " in the balls*";
		}

		if (Bericht.contains("!curse ") && cursed == false) {
			
			Cursevictim = Bericht.substring(7, Bericht.length());
			
			if (Cursevictim.equalsIgnoreCase("Teefy") | Cursevictim.equalsIgnoreCase("Icestorm") | Cursevictim.equalsIgnoreCase("mog_no_1") | Cursevictim.equalsIgnoreCase("vuduepriest")) {
				cursed = true;
				counter = 8;
				Random r = new Random();
				//column 1
				SelectedCurse = 1 + r.nextInt(3);
				Reactie = "Mogbot the terrible has cursed " + Cursevictim;	
				
			}
			else {
				Reactie = "Mogbot can't curse a ghost. Dimwit.";				
			} 
			
		

		} else if (Bericht.contains("!curse ") && cursed == true) {
			Reactie = "someone is already cursed. what do you think Mogbot is, a wizard ?";
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
	
	public static String liftCurse(String Slachtoffer) {
		
		String Reactie;
		if (cursed == true) {
			cursed = false;
			Cursevictim = "";
			Reactie = " Someone has shown mercy. Mogbot the Merciful lifted the curse... BOOOO !!!";
		}
		else {
			Reactie = "Mogbot the Merciful has not cursed anyone. yet..";
		}
		return Reactie;
	}
	
	

	public static void main(String[] args) {

		System.out.println(GetContent("!curse teefy", "Teefy"));
		System.out.println(Boolean.toString(cursed));
		System.out.println( Integer.toString(SelectedCurse));
		System.out.println(Cursevictim);
		
		System.out.println( curse.CastCurse("message", "teefy"));
	}

}
