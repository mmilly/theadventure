package game;

public class Pokemon {

	public String name;
	public String move1;
	public String move2;
	public String type1;
	public String type2;
	public String move1type;
	public String move2type;
	public String pic;
	public int health;
	
	
	
	
	public void initialize(String n, String m1, String m2, String t1, String t2, String m1t, String m2t, String picture, int hlt) {
		name = n;
		move1 = m1;
		move2 = m2;
		type1 = t1;
		type2 = t2;
		move1type = m1t;
		move2type = m2t;
		pic = picture;
		health = hlt;
	}
	
	public void reduceHealth(int amount) {
		health = health - amount;
	}
}
