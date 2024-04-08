public class Main {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(new Cliente("João"));

		conta1.depositar(100);
		conta1.sacar(20);

		conta1.imprimirInfos();

		Conta conta2 = new Conta(new Cliente("Maria"));
		
		conta2.imprimirInfos();

		conta2.depositar(300);
		conta2.transferir(conta1, 100);

		conta1.imprimirInfos();
		conta2.imprimirInfos();
	}
}
