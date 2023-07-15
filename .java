import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		// codigo 4 da o resultado final de itens selecionados
		while (x != 4) {
			// codigo 1 o alcool
			if (x == 1) {
				alcool += 1;
			}
      // codigo 2 a gasolina
			else if (x == 2) {
				gasolina += 1;
			}
      // codigo 3 o diesel
			else if (x == 3) {
				diesel += 1;
			}
			x = sc.nextInt();
		}
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool:" + alcool);
			System.out.println("Gasolina:" + gasolina);
			System.out.println("Diesel:" + diesel);
		
		sc.close();
		
	}
}
