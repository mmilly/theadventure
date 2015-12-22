package game;

public class Angie {

	public Pokemon pokemon1;
	public Pokemon pokemon2;
	public Pokemon pokemon3;
	public Pokemon pokemon4;
	public Pokemon pokemon5;
	public Pokemon pokemon6;
	
	public void initialize() {
		pokemon1 = new Pokemon();
		pokemon2 = new Pokemon();
		pokemon3 = new Pokemon();
		pokemon4 = new Pokemon();
		pokemon5 = new Pokemon();
		pokemon6 = new Pokemon();
		
		pokemon1.initialize("Dragonite", "Dragon Breath", "Hurricane", "Dragon", "Flying", "Dragon", "Flying", "dragoniteback.jpg", 100);
		pokemon2.initialize("Vaporeon", "Hydro Pump", "Aurora Beam", "Water", "", "Water", "Ice", "vaporeonback.png", 100);
		pokemon3.initialize("Talonflame", "Flare Blitz", "Brave Bird", "Fire", "Flying", "Fire", "Flying", "talonflameback.png", 100);
		pokemon4.initialize("Gogoat", "Leaf Blade", "Earthquake", "Grass", "", "Grass", "Ground", "gogoatback.jpg", 100);
		pokemon5.initialize("Bulbasaur", "Vine Whip", "Sludge", "Grass", "Poison", "Grass", "Poison", "bulbasaurback.png", 100);
		pokemon6.initialize("Magikarp", "Splash", "Splash Harder", "Water", "", "", "", "magikarpback.png", 100);
		
	}
	
	
	
}
