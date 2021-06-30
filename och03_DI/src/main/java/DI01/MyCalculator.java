package DI01;

public class MyCalculator {
	Calculator calculator; // Object Type Member Variable
	private int firstNum; // Member Variable == field
	private int secondNum; // Member Variable == field

	public MyCalculator() { // Constructor
	}

	public void add() { // Method
		calculator.addition(firstNum, firstNum);
	}

	public void sub() { // Method
		calculator.subtraction(firstNum, secondNum);
	}

	public void mul() { // Method
		calculator.multiplication(firstNum, secondNum);
	}

	public void div() { // Method
		calculator.division(firstNum, secondNum);
	}

	public void setCalculator(Calculator calculator) { // setter
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

}
