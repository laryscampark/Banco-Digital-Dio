public class Main {

    public static void main (String [] args){
        Conta cc = new ContaCorrente();
        cc.Depositar(100);

        Conta cp = new ContaPoupanca();

        cc.Transferir(100, cp);

        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
