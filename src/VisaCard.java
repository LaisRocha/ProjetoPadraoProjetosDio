public class VisaCard extends Pagamentos {
    @Override
    public void pay(double preco) {
        System.out.println("Pagamento de R$ " + preco + " com VisaCard");
    }
}
