package dz;
public class Calculations {

	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 140;
		c.weight = 1342;
		c.price = 74999;
		Controller.multiplyCarParamsByCoefficient("speed", c, 15);
		Controller.multiplyCarParamsByCoefficient("weight", c, 0.01);
		Controller.multiplyCarParamsByCoefficient("price", c, 0.58);
		System.out.printf("Speed is %.2f km/h, weight is %.4f kg, price is %.3f yuan.\n", c.speed, c.weight, c.price);
		double operand_1 = 10.0, operand_2 = 3.0;
		operand_1 = Controller.mathCalculations("pow", operand_1, operand_2);
		System.out.println(operand_1);
	}

}

class Controller {
	static double mathCalculations(String function, double operand_1, double operand_2) {
		switch(function) {
		case "div":
			return (operand_2!=0)?operand_1/operand_2:operand_1/1;
		case "log10":
			return Math.log10(operand_1+operand_2);
		case "log":
			return Math.log(operand_1+operand_2);
		case "pow":
			return Math.pow(operand_1, operand_2);
			default:
				System.out.println("Unknown function. Return zero point zero to you.");
				return 0.0;
		}
	}
	static double multiplyCarParamsByCoefficient(String carParameter, Car car, double coefficient) {
		switch(carParameter) {
		case "price":
			return car.price*=coefficient;
		case "weight":
			return car.weight*=coefficient;
		case "speed":
			return car.speed*=coefficient;
			default:
				System.out.println("Unknown parameter. Return zero point zero to you.");
				return 0.0;
		}
	}
}