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
			Reactie = "We have the following commands: javelin, yay, morning, rev, time, hello, insult, hug, online, punchline, binchicken, bringcoffee, god?, joke, care, nn, roo, shagger, trashpanda, shitgold, spider, coffee, wafflecunt, curgon, ibis, boo, news, aww, slap, pink, dankie, teefy, who is a fuckstick, who licks the fuckstick, lick me fuckstick, drongo, beer, ragequit, kick<user>, 8b<text>, hug<user>, slap<user>, coffee | All commands need an ! before them";
			break;
		case "!hello":

			if (Gebruiker.equalsIgnoreCase("Teefy")) {
				Reactie = "Hello, beautiful /wink";
			} else if (Gebruiker.equalsIgnoreCase("Icestormers")) {
				Reactie = "Hello, you Manly Man";
			} else if (Gebruiker.equalsIgnoreCase("Mog_no_1")) {
				Reactie = "All bow before the Great Leader and Master ! hi Mog :)";
			} else {
				Reactie = "Hello, " + Gebruiker + ". Its good to see the plebs has found their way here";
			}
			break;

		case "!shame":
			Reactie = "https://media.tenor.com/images/b8ecdafa8469b57e1497fa7264f3638a/tenor.gif";
			break;

		case "!yes":
			Reactie = "https://gph.is/2RYUmyh";
			break;
			
		case "!ree":
			Reactie = "https://imgur.com/a/prnlz9k";
			break;
			
		case "!grats":
			Reactie = "https://giphy.com/gifs/carnaval-carnival-dance-10hO3rDNqqg2Xe";
			break;
			
			
			
				
				
		case "!size":
			Reactie = "https://imgur.com/a/5TEJYeu";
			break;
				
				
				
		case "!zone":
			Reactie = Timezonestuff.getTimezoneData().toString();
			break;

		case "!nope":
			Reactie = "https://tenor.com/tRI3.gif";
			break;

		case "!friend":
			Reactie = "https://tenor.com/R019.gif";
			break;
			
		case "!hi":
			Reactie = "	https://gph.is/2OhO4In";
			break;

		case "!mercury":
			Reactie = "https://gph.is/2p33hkV";
			break;

		case "!chrispy":
			Reactie = "https://giphy.com/gifs/movie-the-godfather-francis-ford-coppola-l0Iy5Wa8fkAewhfW0";
			break;

		case "!dog":
			Reactie = "https://gph.is/2krvPnU";
			break;

		case "!aspen":
			Reactie = randomcsv.RandomCSV("grumpy.csv");
			break;

		case "!mog":
			Reactie = "https://media.giphy.com/media/qUDrfc1q5BM4w/giphy-downsized-large.gif";
			break;

		case "!boom":
			Reactie = "https://gph.is/2MgdAR0";
			break;

		case "!chippy":
			Reactie = "https://gph.is/2P9TrK7";
			break;

		case "!facepalm":
			Reactie = "https://gph.is/2pbhdJ3";
			break;

		case "!banshee":
			Reactie = "https://imgur.com/a/vqEf9VE";
			break;

			
	
			
			
		case "!unicorn":
			// Reactie = "https://imgur.com/a/vqEf9VE";
			// Reactie = "https://imgur.com/a/ss5NTue";
			Reactie = randomcsv.RandomCSV("unicorn.csv");
			
			break;
	
			
		case "!cintara":
			// Reactie = "https://imgur.com/a/vqEf9VE";
			// Reactie = "https://imgur.com/a/ss5NTue";
			Reactie = "https://imgur.com/a/ss5NTue";
			
			break;

		case "!butt":
			Reactie = "http://i64.tinypic.com/30s7uhd.png";
			break;

		case "!fuckingrotor":
			Reactie = "https://imgur.com/a/rP8XP6n";
			break;

		case "!rotor":
			Reactie = "https://gph.is/2vKvIrB";
			break;

		case "!phoenix":
			Reactie = "https://gph.is/2MfE1WI";
			break;

//
//		case "!aspen":
//			Reactie = "https://imgur.com/a/cU7L4Fy";
//			break;	

		case "!stfu":
			Reactie = randomcsv.RandomCSV("stfu.csv");
			break;

		case "!javelin":
			Reactie = "https://imgur.com/a/yQm7su6";
			break;

		case "!morning":
			Reactie = "https://tenor.com/view/morning-bugsbunny-gif-3477317";
			
			break;

		case "!quite":
			Reactie = "https://imgur.com/a/ueZmNKU";
			break;

		case "!yay":
			Reactie = "https://media.giphy.com/media/3oFzmm2tb3OzC8Lhjq/giphy.gif";
			break;

		case "!rev":
			Reactie = "https://gph.is/2pNNsii";
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
		case "!wtf":
			Reactie = "http://gph.is/2j3rbK0";
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
			Reactie = randomcsv.RandomCSV("jokes.csv");
			break;

		case "!time":
			java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+6");
			java.util.Calendar c = java.util.Calendar.getInstance(tz);

			String Time =
					"Mog: " + time.GetTime("Australia/Adelaide")  
							+ System.lineSeparator() + "Chrispy: " + time.GetTime("Australia/Sydney")
							+ System.lineSeparator() + "Ice & Void: " + time.GetTime("Europe/London")
							+ System.lineSeparator() + "Teefy & Cintara: " + time.GetTime("Europe/Amsterdam")
							+ System.lineSeparator() + "Vudue: " + time.GetTime("America/Chicago")
							+ System.lineSeparator();
			Reactie = Time;
			break;

		case "!bored":
			Reactie = "https://giphy.com/gifs/tumbleweed-landscape-5x89XRx3sBZFC";
			break;

		case "!care":
			Reactie = "http://www.vitamin-ha.com/wp-content/uploads/2012/05/VH-and-not-a-single-fuck-was-given-that-day-owl.jpg";
			break;

		case "!nn":
			Reactie =  randomcsv.RandomCSV("nn.csv");
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
			Reactie = randomcsv.RandomCSV("slaps.csv");
			break;
		case "!pink":
			Reactie = "no ! commander Squirt !!";
			break;

		case "!dankie":
			Reactie = "https://gph.is/2IRxYlS";
			break;

		case "!teefy":
			Reactie = randomcsv.RandomCSV("Teefy.csv");
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

		case "!chrispypays":
			Reactie = "https://cdn.discordapp.com/attachments/346287163995848706/516554939808481280/giphy_2.gif";
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
			Reactie = randomcsv.RandomCSV("ragequit.csv");
			break;

		// https://cruxnow.com/wp-content/uploads/2017/03/Beer_Credit_Africa_Studio_Shutterstock_CNA.jpeg

		}

		if (Bericht.contains("!kick ")) {
			String Victim = null;
			Victim = Bericht.substring(6, Bericht.length());
				
			if (Victim.equalsIgnoreCase("@cin")) {
				Reactie = "*/Kicks " + Victim + " in the hemeroids*";
			} 
			else {
			Reactie = "*/Kicks " + Victim + " in the balls*";
			}
			
			
		}

		if (Bericht.contains("!8b ")) {

			if (Bericht.contains("teefy")) {

				Reactie = randomcsv.RandomCSV("8ballTeefy.csv");
			}

			else {
				Reactie = randomcsv.RandomCSV("8ball.csv");			}
		}

		if (Bericht.contains("!curse ") && cursed == false) {

			Cursevictim = Bericht.substring(7, Bericht.length());

			if (Cursevictim.equalsIgnoreCase("Teefy") 
				| Cursevictim.equalsIgnoreCase("Icestormers")
				| Cursevictim.equalsIgnoreCase("mog_no_1") 
				| Cursevictim.equalsIgnoreCase("vuduepriest")
				| Cursevictim.equalsIgnoreCase("rotorboy") 
				| Cursevictim.equalsIgnoreCase("cintara")
				| Cursevictim.equalsIgnoreCase("voidslicer")
				| Cursevictim.equalsIgnoreCase("chippy_x")
				| Cursevictim.equalsIgnoreCase("phoenix_x")
				| Cursevictim.equalsIgnoreCase("revoxxer")
				| Cursevictim.equalsIgnoreCase("dankie")
				| Cursevictim.equalsIgnoreCase("chrispykoala"))
			{
				cursed = true;
				counter = 3;
				Random r = new Random();
				// column 1
				SelectedCurse = 1 + r.nextInt(3);
				Reactie = "Mogbot the terrible has cursed " + Cursevictim;

			} else {
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
		} else {
			Reactie = "Mogbot the Merciful has not cursed anyone. yet..";
		}
		return Reactie;
	}

	public static void main(String[] args) {

		System.out.println(GetContent("!time", "teefy"));

	}

}
