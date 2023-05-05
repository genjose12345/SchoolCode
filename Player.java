package exercise_player_advancedPlayer;

public class Player {
	protected String name;
	protected int points;

	public Player(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public Player(String name) {
		this(name,0);
	}
	
	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
}