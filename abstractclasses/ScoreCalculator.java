package abstractclasses;


public abstract class ScoreCalculator {
//public abstract class - inherited classes must implement or override the abstract methods.
	public abstract void calculate();
//public final class - no other inherited classes can override final methods.
	public final void gameOver() {
		System.out.println("Game over");
	}
}
