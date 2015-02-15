package calculator;

public class CalculatorMB {
	int number1;
	int number2;
	int result;
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public String add(){
		this.result = this.number1+this.number2;
		return "sucess";
	}

}
