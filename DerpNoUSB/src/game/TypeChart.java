package game;

import java.util.ArrayList;

public class TypeChart {

	public ArrayList<String> getStrongAgainst(String type){
		ArrayList<String> a = new ArrayList<String>();
		
		if (type == "Fairy") {
			a.add("Fight");
			a.add("Dragon");
			a.add("Dark");
		}
		if (type == "Steel") {
			a.add("Ice");
			a.add("Rock");
			a.add("Fairy");
		}		
		if (type == "Dark") {
			a.add("Psychic");
			a.add("Ghost");
		}
		if (type == "Dragon") {
			a.add("Dragon");			
		}
		if (type == "Ghost") {
			a.add("Psychic");
			a.add("Ghost");
		}
		if (type == "Rock") {
			a.add("Fire");
			a.add("Ice");
			a.add("Flying");
			a.add("Bug");
		}
		if (type == "Bug") {
			a.add("Grass");
			a.add("Psychic");
			a.add("Dark");
		}
		if (type == "Psychic") {
			a.add("Fight");
			a.add("Poison");
		}
		if (type == "Flying") {
			a.add("Grass");
			a.add("Fighting");
			a.add("Bug");
		}
		if (type == "Ground") {
			a.add("Fire");
			a.add("Electric");
			a.add("Poison");
			a.add("Rock");
			a.add("Steel");
		}
		if (type == "Poison") {
			a.add("Grass");
			a.add("Fairy");
		}
		if (type == "Fighting") {
			a.add("Normal");
			a.add("Ice");
			a.add("Rock");
			a.add("Dark");
			a.add("Steel");
		}
		if (type == "Ice") {
			a.add("Grass");
			a.add("Ground");
			a.add("Flying");
			a.add("Dragon");
		}
		if (type == "Grass") {
			a.add("Water");
			a.add("Ground");
			a.add("Rock");
		}
		if (type == "Electric") {
			a.add("Water");
			a.add("Flying");
		}
		if (type == "Water") {
			a.add("Fire");
			a.add("Ground");
			a.add("Rock");
		}
		if (type == "Fire") {
			a.add("Grass");
			a.add("Ice");
			a.add("Bug");
			a.add("Steel");
		}
		
		
		return a;
	}
	
	
	
	
	
	
	
	
	
	public ArrayList<String> getWeakAgainst(String type){
		ArrayList<String> a = new ArrayList<String>();
		
		if (type == "Fairy") {
			a.add("Poison");
			a.add("Steel");
			a.add("Fire");
		}
		if (type == "Steel") {
			a.add("Steel");
			a.add("Fire");
			a.add("Water");
			a.add("Electric");
		}		
		if (type == "Dark") {
			a.add("Fighting");
			a.add("Dark");
			a.add("Fairy");
		}
		if (type == "Dragon") {
			a.add("Steel");
			a.add("Fairy");
		}
		if (type == "Ghost") {
			a.add("Normal");
			a.add("Dark");
		}
		if (type == "Rock") {
			a.add("Fightin");
			a.add("Ground");
			a.add("Steel");
	
		}
		if (type == "Bug") {
			a.add("Fighting");
			a.add("Flying");
			a.add("Poison");
			a.add("Ghost");
			a.add("Steel");
			a.add("Fire");
			a.add("Fairy");
		}
		if (type == "Psychic") {
			a.add("Steel");
			a.add("Psychic");
			a.add("Dark");
		}
		if (type == "Flying") {
			a.add("Rock");
			a.add("Steel");
			a.add("Electric");
		}
		if (type == "Ground") {
			a.add("Flying");
			a.add("Bug");
			a.add("Grass");
		}
		if (type == "Poison") {
			a.add("Poison");
			a.add("Ground");
			a.add("Rock");
			a.add("Ghost");
			a.add("Steel");
		}
		if (type == "Fighting") {
			a.add("Flying");
			a.add("Poison");
			a.add("Bug");
			a.add("Ghost");
			a.add("Psychic");
			a.add("Fairy");
			
		}
		if (type == "Ice") {
			a.add("Steel");
			a.add("Fire");
			a.add("Water");
			a.add("Ice");
		}
		if (type == "Grass") {
			a.add("Flying");
			a.add("Poison");
			a.add("Bug");
			a.add("Steel");
			a.add("Fire");
			a.add("Grass");
			a.add("Dragon");
		}
		if (type == "Electric") {
			a.add("Ground");
			a.add("Grass");
			a.add("Electric");
			a.add("Dragon");
		}
		if (type == "Water") {
			a.add("Water");
			a.add("Grass");
			a.add("Dragon");
		}
		if (type == "Fire") {
			a.add("Rock");
			a.add("Fire");
			a.add("Water");
			a.add("Dragon");
		}
		
		
		return a;
	}
	
	
	
}
