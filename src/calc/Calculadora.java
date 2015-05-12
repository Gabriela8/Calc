package calc;

import java.util.Scanner;

/* Este é um comentário para demo do Commit */
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float num1, num2, res = 0;
		int op;		
		
		do{
			System.out.println("Calculadora:");
			System.out.println("Operações: \nsomar (1) \nsubtrair (2) \nmultiplicar (3) \ndividir (4) \nsair(5)");
			op = in.nextInt();
			if (op != 5){			
				System.out.println("Digite o Numero 1");
				num1 = in.nextFloat();			
				System.out.println("Digite o Numero 2");
				num2 = in.nextFloat();
				
				switch (op){
				             /*  4  =  2   +  2 */
					case 1 :	res = num1 + num2;
						break;
					case 2 :	res = num1 - num2;
						break;
					case 3 :	res = num1 * num2;
						break;
					case 4 :	res = num1 / num2;
						break;
					default :	System.out.println("Operação incorreta.");
				}			
				System.out.println("A resposta e: " + res);
			}
		}while (op != 5);
	}

}
