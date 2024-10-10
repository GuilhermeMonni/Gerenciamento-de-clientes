import java.util.Locale;

public class Main {
    public static void main(String[] args){

    Locale.setDefault(Locale.US);

    //1 compra cliente a
    System.out.println("----- Cliente A -----");
    Cliente clienteA = new ClienteA();
    clienteA.mostrarLimite();   //mostra limite
    comprar(clienteA, 5000, "CLIENTE A");   //efetua compra
    bonus(clienteA, 5000);  //adiciona bonus
    pagamento(clienteA, 3000);  //pagamento do debito
    clienteA.mostrarLimite();   
    System.out.println("---------");

    //2 compra cliente a com desconto
    System.out.println("----- Cliente A - Segunda compra-----");
    System.out.println("Compra com desconto");
    comprar(clienteA, 1000, "CLIENTE A");   //efetua compra
    clienteA.mostrarLimite();   //mostra limite
    clienteA.saldoDevedor();    //mostra debito
    System.out.println("---------");

    //compra cliente b sem limite
    System.out.println("----- Cliente B -----");
    Cliente clienteB = new ClienteB();
    clienteB.mostrarLimite();   //mostra limite
    comprar(clienteB, 5000, "CLIENTE B");   //efetua compra
    pagamento(clienteB, 1000);  //pagamento do debito

    //cliente b com limite insuficiente
    System.out.println("----- Limite insuficiente -----");
    System.out.println("CLIENTE B - Saldo insuficiente ");
    clienteB.mostrarLimite();  //mostrar limite
    clienteB.desconto(8000); //valor desconto
    comprar(clienteB, 8000, "CLIENTE B");
    System.out.println("---------");

    // cliente c
    System.out.println("----- Cliente C -----");
    Cliente clienteC = new ClienteC();
    clienteC.mostrarLimite(); //mostrA limite
    comprar(clienteC, 800, "CLIENTE C");
    pagamento(clienteC, 500);   //pagamento
    clienteC.mostrarLimite();
    }

    private static void comprar(Cliente cliente, double valorCompra, String descricao) {
        if(cliente.verificarLimite(valorCompra)){
            double desconto = cliente.desconto(valorCompra);
            cliente.comprar(valorCompra - desconto);
            System.out.println(descricao + " - Compra efetuada com sucesso");
        }else{
            System.out.println(descricao + " - Saldo insuficiente");
        }
    }

    private static void pagamento(Cliente cliente, double valorPagamento){
        cliente.pagamento(valorPagamento);
    }

    private static void bonus(Cliente cliente, double valorCompra){
        if (valorCompra >= 5000) {
            cliente.bonus();
        }
    }
}
