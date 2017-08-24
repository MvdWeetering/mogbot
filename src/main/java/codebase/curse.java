package codebase;

public class curse {

	static String Curse = null;
	
	public static String CastCurse(String Bericht,String CurseVictim) {
		
		Curse = CastParrot(Bericht, CurseVictim);
		
		
		return Curse;
		
	}
	
	public static String CastTourretes(String Bericht,String CurseVictim) {
		
		Curse = CurseVictim+", Fuck off. You " + loadInsults.returnInsult();
		
	return Curse;	
	}
	
public static String CastParrot(String Bericht,String CurseVictim) {
		
		Curse = Bericht.replaceAll("!", "") + ":troll:";
		
	return Curse;	
	}
	
	
	
	
}
