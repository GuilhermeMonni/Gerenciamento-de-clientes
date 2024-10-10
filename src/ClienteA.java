public class ClienteA extends Cliente{

  //atributos
  protected double desconto;
  protected int qtdDesconto;

  public ClienteA(){ //definindo valor
    this.desconto = 0.1;  //valor desconto
    this.qtdDesconto = 0; // quantidade de descontos
    limite = 10000; //valor limite
  }
  
  //calcular desconto
  @Override
  public double desconto(double valorCompra){
    double descontoAplicado = 0; //valor do desconto definido
    if (qtdDesconto > 0) {
      descontoAplicado = valorCompra * desconto;
      System.out.println(" Cliente A - Valor do desconto: " + String.format("%.2f", descontoAplicado));
    }

    return descontoAplicado;
  }
  
  //aumento de limite 
  @Override
  public void bonus(){
    limite += 500; //aumento de limite
    System.out.println("Cliente A - Bonus por compra adicionado! Novo limite: " + String.format("%.2f", limite));
  }

  //pagamento do debito
  public void pagamento(double valorPagamento){
    debito -= valorPagamento; //diminui debito
    limite += valorPagamento; //aumenta limite
    System.out.println("Cliente A - Pagamento efetuado: " + String.format("%.2f", valorPagamento) + ". Saldo devedor: " + String.format("%.2f", debito));
  }

}
