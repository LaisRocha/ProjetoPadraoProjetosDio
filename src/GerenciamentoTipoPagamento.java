public class GerenciamentoTipoPagamento {
    private TipodePagamento tipodepagamento;
    public GerenciamentoTipoPagamento (TipodePagamento tipodePagamento){
        this.tipodepagamento = tipodePagamento;
    }
    public void tipoPagamento(int tipo){
        tipodepagamento.pay(tipo);
    }

}
