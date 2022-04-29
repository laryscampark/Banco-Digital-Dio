public interface IConta {
    void Sacar(double valor);
    void Depositar(double valor);
    void Transferir(double valor, Conta contaDestino);

    void ImprimirExtrato();
}
