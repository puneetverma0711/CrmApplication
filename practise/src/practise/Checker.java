package practise;

public class Checker implements Comparable<Player> {
	
	
	String name;
	int score;

	Checker(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public int compareTo(Player p2) {
		
		if(p2.getScore()>this.getScore()) 
			return 1;
		else if(p2.getScore()==this.getScore())
			return this.name.compareTo(p2.name);
		else
			return -1;

	}



}
