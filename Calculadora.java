package codigo;
public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;		
	}
	
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}
	
	public boolean resta2() {
		if(num1>=num2) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer divide2() {
		if (num2==0) {
			return null;
		}
		int resul = num1/num2;
		return resul;
	}
	
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}
	
	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
}

