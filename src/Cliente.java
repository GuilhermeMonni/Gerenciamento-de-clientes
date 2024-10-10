public class Cliente {
  //atributos
  protected double limite, debito, pagamento;

  //verificar limite disponivel
  public boolean verificarLimite(double valorCompra){
    if (valorCompra <= (limite - debito)) {
      return true;
    } else{
      return false;
    }
  }

  //informar limite atual
  public void mostrarLimite(){
    System.out.println("Seu atual limite é de: " + limite);
  }

  //mostrar divida 
  public void saldoDevedor(){
    System.out.println("Seu saldo devedor é de: " + debito);
  }

  //fazer pagamento do debito
  public void pagamento(double valorPagamento){
    debito -= valorPagamento; //abate debito
    limite += valorPagamento; //aumenta limite
    System.out.println("Pagamento efetuado: " + String.format("%.2f", valorPagamento) + ". Saldo devedor: " + String.format("%.2f", debito));
  }

  //efetuar compra
  public void comprar(double valorCompra){
    debito += valorCompra; //aumenta gasto
    limite -= valorCompra;// diminui limite
    System.out.println("Compra de: " + String.format("%.2f", valorCompra) + " efetuada. Saldo devedor: " + String.format("%.2f", debito));
  }

  //calcular desconto
  public double desconto(double valorCompra){
    System.out.println("Desconto aplicado: ");
    return 0;
  }

  //aumentar limite
  public void bonus(){
    System.out.println("Limite aumentado!");
  }

}