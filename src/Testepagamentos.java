import java.util.Scanner;

public class Testepagamentos {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Você precisa pagar R$150,00 pela lavagem do seu carro");
        System.out.println("Por favor selecione o tipo de pagamento: 6- débito, 7-crédito");
        int code1 = on.nextInt();
        GerenciamentoTipoPagamento gerenciamentotipopagamento = null;
        if (code1 == 6) {
            gerenciamentotipopagamento = new GerenciamentoTipoPagamento(new PagamentoDebito());
        } else if (code1 == 7) {
            gerenciamentotipopagamento = new GerenciamentoTipoPagamento(new PagamentoCredito());
        }
        gerenciamentotipopagamento.tipoPagamento(6);

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor selecione o metódo de pagamento: 1-Mastercard, 2-VisaCard, 3 - Paypal)");

        int code = in.nextInt();
        GerenciamentoPagamentos gerenciamentoPagamentos = null;
        if (code == 1) {
            gerenciamentoPagamentos = new GerenciamentoPagamentos(new MasterCard());
        } else if (code == 2) {
            gerenciamentoPagamentos = new GerenciamentoPagamentos(new VisaCard());
        } else if (code == 3) {
            gerenciamentoPagamentos = new GerenciamentoPagamentos(new Paypal());
        }
        gerenciamentoPagamentos.fazerPagamento(150);


    }

}







