package abstractclasses;

public class Main {

	public static void main(String[] args) {
		WomanCalculator womancalculator = new WomanCalculator();
		womancalculator.calculate();
		womancalculator.gameOver();
		
		//can't create new instance of abstract classes. Only way to do it is to override all the functions but meaningless
		ScoreCalculator scorecalculator = new MaleCalculator();
		scorecalculator.calculate();
	}

}
