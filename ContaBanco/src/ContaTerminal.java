import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
	
	private int Numero;
	private String Agencia;
	private String Nome_Cliente;
	private double Saldo; 
	
	public static void main(String[] args) {
		
		ContaTerminal contaTerminal = new ContaTerminal();
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Preencha seus dados");
		
		System.out.println("Por favor digite o número da conta:");
		contaTerminal.Numero = scan.nextInt();
		System.out.println("Por favor digite o número da Agência:");
		contaTerminal.Agencia = scan.next();
		System.out.println("Por favor digite seu nome:");
		contaTerminal.Nome_Cliente = scan.next();
		contaTerminal.Saldo = random.nextInt(10000);
		
		System.out.println("Olá " + contaTerminal.Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.Agencia + ", conta " + contaTerminal.Numero + " e seu saldo " + contaTerminal.Saldo + "R$ já está disponível para saque");
		
		scan.close();
	}

}
