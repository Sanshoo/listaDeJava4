package school.cesar.q1;
import java.util.Scanner; 

public class TresLetras {
	
	private String target;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	TresLetras (){
		
	}
	
	TresLetras (String alvo){
		this.target = alvo;
	}
	
	public boolean validar() {
		if (this.target.length() != 5) {
			return false;
		}
		for (int a = 0; a < 5; a++) {
			if (this.target.charAt(a) < 65 || this.target.charAt(a) > 90 && this.target.charAt(a) < 97 || this.target.charAt(a) > 122) {
				return false;
			} // 65 > 90 maiusculas a z, 97 > 122 minusculas a z
		}
		return true;
	}
	
	public void switcheroo() {
		if (this.validar() == false) {
			//throw InvalidParameterException; idk como lancar excecoes
			System.out.println("Deu ruim");
		}
		else {
		System.out.printf("%c%c%c, %c%c%c, %c%c%c, %c%c%c, %c%c%c, %c%c%c", this.target.charAt(0), this.target.charAt(1), this.target.charAt(2), this.target.charAt(0), this.target.charAt(2), this.target.charAt(1), this.target.charAt(1), this.target.charAt(0), this.target.charAt(2), this.target.charAt(1), this.target.charAt(2), this.target.charAt(0), this.target.charAt(2), this.target.charAt(0), this.target.charAt(1), this.target.charAt(2), this.target.charAt(1), this.target.charAt(0));
		}
	}//solucao mto feia ate eu pensar num algoritmo decente. pelomenos funciona.

	public static void main(String[] args) {
		System.out.println("Digita ae uma palavra pra ser feito o troca-troca das TresLetras: ");
		Scanner myscan = new Scanner(System.in);
		TresLetras teste = new TresLetras(myscan.nextLine());
		myscan.close();
		teste.switcheroo();
	}
}
