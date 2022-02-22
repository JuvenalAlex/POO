public class Main {
    public static void main(String[] args){
        Mercadinho mercadinho = new Mercadinho();

        Regular Regular = new Regular(50.00, "Juvenal");
        Regular Regular2 = new Regular(0.00, "Mateus");
        Vip Vip = new Vip(50.00, "Marcela", "62357932-94");
        OuroVIP OuroVip = new OuroVIP(45.00, "Deris", "Rua Juscelino Kubistchek, 210");

        mercadinho.adicionarCliente(Regular);
        mercadinho.adicionarCliente(Vip);
        mercadinho.adicionarCliente(OuroVip);
        mercadinho.adicionarCliente(Regular2);

        mercadinho.comprasTotal();
        mercadinho.listarCliente();


    }
}