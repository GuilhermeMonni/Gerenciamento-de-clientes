public class ClienteB extends Cliente{

  //atributos 
  protected double desconto;
  protected int qtdDesconto;

  public ClienteB(){ //definindo valores
    this.desconto = 0.05; //valor desconto
    limite = 5000; //valor limite
  }
  
  //calcular desconto
  @Override
  public double desconto(double valorCompra){
    double descontoAplicado = 0; //valor do desconto definido
    if (qtdDesconto > 0) {
      descontoAplicado = valorCompra * desconto;
      System.out.println(" Cliente B - Valor do desconto: " + String.format("%.2f", descontoAplicado));
    }

    return descontoAplicado;
  }

  //efetuar pagamento
  public void pagamento(double valorPagamento){
    debito -= valorPagamento; //diminui debito
    limite += valorPagamento; //aumenta limite
    System.out.println("Cliente B - Pagamento efetuado: " + String.format("%.2f", valorPagamento) + ". Saldo devedor: " + String.format("%.2f", debito));
    if (valorPagamento >= 1000) { 
      //verificacao dos descontos
      System.out.println("Cliente B - Quantidade de descontos aplicados: " + qtdDesconto);
    }
  }
  
}