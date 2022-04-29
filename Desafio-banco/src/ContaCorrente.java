public class ContaCorrente  extends Conta{

    @Override
    public void ImprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        super.ImprimirInfosComuns();
    }
}
