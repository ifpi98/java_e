package template;

public class PlayerTest {

	public static void main(String[] args) {

		Player p1 = new Player();
		AdvancedLevel aL = new AdvancedLevel();
		SuperLevel sL = new SuperLevel();

		p1.play(1);
		p1.upgradeLevel(aL);
		p1.play(2);
		p1.upgradeLevel(sL);
		p1.play(3);
		

	}

}
