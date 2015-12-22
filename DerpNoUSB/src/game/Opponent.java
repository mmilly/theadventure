package game;

public class Opponent {
	
	public Pokemon pokemon1;
	public Pokemon pokemon2;
	public Pokemon pokemon3;
	public Pokemon pokemon4;
	
	public void initialize(int i) {
		pokemon1 = new Pokemon();
		pokemon2 = new Pokemon();
		pokemon3 = new Pokemon();
		pokemon4 = new Pokemon();
		
		if (i == 1) {
		pokemon1.initialize("Absol","Night Slash","Psycho Cut","Dark","","Dark","Psychic", "absol.jpg", 100);
		pokemon2.initialize("Umbreon", "Assurance", "Last Resort", "Dark", "", "Dark", "Normal","umbreon.jpg", 100);
		pokemon3.initialize("Murkrow", "Feint Attack", "Wing Attack", "Dark", "Flying", "Dark", "Flying","murkrow.png", 100);
		pokemon4.initialize("Kadabra", "Psychic", "Round", "Psychic", "", "Psychic", "Normal","kadabra.jpg", 100);
		}
		if (i == 2) {
			pokemon1.initialize("Koffing", "Sludge", "Belch", "Poison", "", "Poison", "Poison","koffing.jpg", 100);
			pokemon2.initialize("Metagross", "Metal Claw", "Zen Headbutt", "Steel", "Psychic", "Steel", "Psychic","metagross.jpg", 100);
			pokemon3.initialize("Grimer", "Sludge Bomb", "Mud Bomb", "Poison", "", "Poison", "Ground","grimer.jpg", 100);
			pokemon4.initialize("Vileplume", "Venoshock", "Solar Beam", "Poison", "Grass", "Poison", "Grass","vileplume.jpg", 100);
			}
		if (i == 3) {
			pokemon1.initialize("Machoke", "Submission", "Cross Chop", "Fighting", "", "Fighting", "Fighting","machoke.jpg", 100);
			pokemon2.initialize("Lucario", "Close Combat", "Metal Claw", "Fighting", "Steel", "Fighting", "Steel","lucario.jpg", 100);
			pokemon3.initialize("Hitmonlee", "Jump Kick", "Brick Break", "Fighting", "", "Fighting", "Fighting","hitmonlee.jpg", 100);
			pokemon4.initialize("Blaziken", "Blaze Kick", "Sky Uppercut", "Fire", "Fighting", "Fire", "Fighting","blaziken.jpg", 100);
			
		}
		if (i == 4) {
			pokemon1.initialize("Onix", "Rock Throw", "Dig", "Rock", "Ground", "Rock", "Ground","onix.jpg", 100);
			pokemon2.initialize("Sudowoodo", "Rock Slide", "Sucker Punch", "Rock", "", "Rock", "Dark","sudowoodo.jpg", 100);
			pokemon3.initialize("Kabutops", "Ancient Power", "Aqua Jet", "Rock", "Water", "Rock", "Water","kabutops.jpg", 100);
			pokemon4.initialize("Aggron", "Iron Tail", "Rock Tomb", "Steel", "Rock", "Steel", "Rock","aggron.jpg", 100);
		}
		if (i == 5) {
			pokemon1.initialize("Mewtwo", "Obliterate", "Obliterate", "", "", "", "", "mewtwo.png", 100);
		}
		
	}
	
	
	
	
	
}
