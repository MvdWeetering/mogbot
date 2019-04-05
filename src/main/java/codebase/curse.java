package codebase;

public class curse {

	static String Curse = null;

	
	public static String CastCurse(String Bericht, String CurseVictim) {

		
		if (contentReader.counter == 0) {
			contentReader.liftCurse(CurseVictim);
			Curse = "*The curse has expired. awww*";
			
		}
		else {
		
		switch (contentReader.SelectedCurse) {

		case 1:
		 CastTourretes(Bericht, CurseVictim);
			break;
		case 2:
			CastParrot(Bericht, CurseVictim);
			break;
		case 3:
			 Asskisser(Bericht, CurseVictim);
			break;
		}
		contentReader.counter = contentReader.counter -1;
		}
		return Curse;
						

	}

	public static String CastTourretes(String Bericht, String CurseVictim) {

		Curse = CurseVictim + ", Fuck off. You " + loadInsults.returnInsult();

		return Curse;
	}

	public static String CastParrot(String Bericht, String CurseVictim) {

		String replacer = null;
		replacer = Bericht;
		Curse = replacer.replaceAll("!", "") + " <:troll:519837514589011969>";

		return Curse;
	}

	public static String Asskisser(String Bericht, String CurseVictim) {

		Curse = AssKisser.loadCompliment();

		return Curse;
	}



}
