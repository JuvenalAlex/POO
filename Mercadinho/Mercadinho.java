import java.util.ArrayList;

public class Mercadinho {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente C){
        clientes.add(C);
    }
    public void comprasTotal(){
        double Total = 0;
        for (int p = 0; p < clientes.size(); p++) {
            if (clientes.get(p).getValorDaCompra() <= 0) {
                System.out.println("O valor da compra deve ultrapassar R$0,00 reais mas o cliente " + clientes.get(p).getNome() + " não fez uma compra no valor R$0.00 reais.");
            } else {
                Total += clientes.get(p).calcularPagamento();
            }
        }
        System.out.println("O valor da compra de todos os clientes é de R$" + Total + " reais.");
        System.out.println("\nClientes Registrados: ");
    }
    public void listarCliente(){
        for (int p = 0; p < clientes.size(); p++){
            System.out.println(clientes.get(p).getNome());
        }
    }
}