public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco Digital");

        Cliente cliente1 = new Cliente("Venilton");
        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca1 = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc1);
        banco.adicionarConta(poupanca1);

        cc1.depositar(100);
        cc1.transferir(50, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        banco.listarContas();
    }
}
