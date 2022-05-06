public class PagamentoDebito extends TipodePagamento {
    @Override
    public void pay(double tipo) {
        System.out.println("Pagamento no débito ");
    }
}