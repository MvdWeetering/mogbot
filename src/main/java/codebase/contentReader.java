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
			Reactie = "We have the following commands: rev, time, hello, insult, hug, online, punchline, binchicken, bringcoffee, god?, joke, care, nn, roo, shagger, trashpanda, shitgold, spider, coffee, wafflecunt, curgon, ibis, boo, news, aww, slap, pink, dankie, teefy, who is a fuckstick, who licks the fuckstick, lick me fuckstick, drongo, beer, ragequit, kick<user>, 8b<text>, hug<user>, slap<user>, coffee | All commands need an ! before them";
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
				
		case "!rev":
			Reactie = "http://stream1.gifsoup.com/view6/2789483/sub-zero-fatality-2-o.gif";
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
		case "!punchline":
			Reactie = "https://www.youtube.com/watch?v=g-4-gLlF0uw";
			break;
		case "!binchicken":
			Reactie = "https://youtu.be/mO-OpFjHRbE";
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

		case "!time":
			java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+6");
			java.util.Calendar c = java.util.Calendar.getInstance(tz);

			String Time = 
					 
					"Rotor & Mog & mc_fatigue: " + time.GetTime("Australia/Adelaide") +System.lineSeparator()
					+ "Chippy & Phoenix: " + time.GetTime("Australia/Queensland") +System.lineSeparator()
					+ "Teefy: " + time.GetTime("Europe/Amsterdam") + System.lineSeparator()
					+ "Ice & Void: " + time.GetTime("Europe/London") +System.lineSeparator()
					+ "Rev & Dankie & Bonbon & Ganga: " + time.GetTime("America/Detroit") +System.lineSeparator()
					+ "Vudue & Curgon: " + time.GetTime("GMT-6") +System.lineSeparator()
										 
					; 
			Reactie = Time;
			break;
			
		case "!bored":
			Reactie = "https://giphy.com/gifs/tumbleweed-landscape-5x89XRx3sBZFC";
			break;
		
		case "!care":
			Reactie = "http://www.vitamin-ha.com/wp-content/uploads/2012/05/VH-and-not-a-single-fuck-was-given-that-day-owl.jpg";
			break;

		case "!nn":
			Reactie = "https://tenor.com/view/goodnight-cute-rollsover-collapse-falls-gif-5641950";
			break;
			
		case "!name":
			Reactie = NameGenerator.generateName();
			break;
		case "!roo":
			Reactie = "https://giphy.com/gifs/kangaroo-gZjzkJEzwuB0Y";
			break;	
			
		case "!shagger":
			Reactie = "https://giphy.com/gifs/sheep-ALYS5Jq5B3XHi";
			break;	
		
		case "!trashpanda":
			Reactie = "https://media.giphy.com/media/AB734caB4jx84/giphy.gif";
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
		case "!curgon":
			Reactie = "https://giphy.com/gifs/wtf-LNiN5XDyRnlFC";
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
		case "!slap":
			Reactie = slaps.slaps();
			break;
		case "!pink":
			Reactie = "no ! commander Squirt !!";
			break;
			
		case "!dankie":
			Reactie = "http://aforgrave.ca/detritus/wp-content/uploads/2012/12/Beaker6_280.gif";
			break;	
			
		case "!teefy":
			Reactie = Teefy.Lazy();
			break;
		case "!who is a fuckstick":
			Reactie = "curgon is a fuckstick";
			break;
			
		case "!who licks the fuckstick":
			Reactie = "curgon licks the fuckstick";
			break;
			
		case "!lick me fuckstick":
			Reactie = "https://www.hensnightshop.com.au/media/catalog/product/cache/5/image/650x/040ec09b1e35df139433887a97daa66f/o/r/orange-pecker-lollipop_3.jpg";
			break;	

		case "!drongo":
			Reactie = "https://www.youtube.com/watch?v=tEYCjJqr21A";
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

		case "!ragequit":
			Reactie = ragequit.RageQuit();
			break;	
			
		// https://cruxnow.com/wp-content/uploads/2017/03/Beer_Credit_Africa_Studio_Shutterstock_CNA.jpeg

		}

		if (Bericht.contains("!kick ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
			Reactie = "*/Kicks " + Victim + " in the balls*";
		}

		if (Bericht.contains("!8b ")) {
			Reactie = eightball.ReturnEightBall();
		}
		
		if (Bericht.contains("!curse ") && cursed == false) {
			
			Cursevictim = Bericht.substring(7, Bericht.length());
			
			if (Cursevictim.equalsIgnoreCase("Teefy") | Cursevictim.equalsIgnoreCase("Icestorm") | Cursevictim.equalsIgnoreCase("mog_no_1") | Cursevictim.equalsIgnoreCase("vuduepriest") | Cursevictim.equalsIgnoreCase("commissarr")) {
				cursed = true;
				counter = 3;
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

		System.out.println(GetContent("!slap", "Teefy"));

		
	
	}

}
