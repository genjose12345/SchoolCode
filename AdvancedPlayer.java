package exercise_player_advancedPlayer;

public class AdvancedPlayer extends Player {
	protected int skillLevel;

	public AdvancedPlayer(String name, int points, int skillLevel) {
		super(name,points);
		this.skillLevel=skillLevel;
	}

	public AdvancedPlayer(String name, int points) {
		this(name, points, 1);
	}

	public AdvancedPlayer(String name) {
		this(name, 0, 1);
	}
}