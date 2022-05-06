public class GerenciamentoPagamentos {
    private Pagamentos pagamentos;
    public GerenciamentoPagamentos (Pagamentos pagamentos){
        this.pagamentos = pagamentos;
    }
    public void fazerPagamento(double preco){
        pagamentos.pay(preco);
    }
}
