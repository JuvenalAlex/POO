import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Scanner input = new Scanner(System.in);
        
        int opcao = 1;
        while (opcao != 0){
            System.out.println("===========================");
            System.out.println("  0 - Encerrar             ");
            System.out.println("  1 - Cadastrar Banco      ");
            System.out.println("  2 - Listar               ");
            System.out.println("  3 - Cadastrar Conta      ");
            System.out.println("  4 - Depósito             ");
            System.out.println("  5 - Saque                ");
            System.out.println("  6 - Transfência          ");
            System.out.println("  7 - Saldo                ");
            System.out.println("  8 - Extrato              ");
            System.out.println("  9 - Rendimentos          ");
            System.out.println(" 10 - Desativar Conta      ");
            System.out.println(" 11 - Reativar Conta       ");
            System.out.println("===========================");
            opcao = Integer.parseInt(input.nextLine());
            if(opcao == 1){
                System.out.println("======Cadastrar Banco======");
                String nomeBanco = input.nextLine();
                sistema.cadastrarBanco(new Banco(nomeBanco));
            }else if(opcao == 2){
                System.out.println("======Bancos Cadastrados======");
                sistema.listarBancos();
            }else if(opcao == 3){
                System.out.println("======Cadastrar Conta======");
                System.out.println("Nome do Cliente: ");
                String cliente = input.nextLine();
                System.out.println("Número da Conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Saldo Inicial: ");
                String saldo = input.nextLine();
                System.out.println("Tipo da conta: 1 - Corrente, 2 - Poupança, 3 - Especial");
                String tipo = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                ContaGeral conta = null;

                if(tipo.equals("1")){
                    conta = new ContaPoupanca(cliente, numero, agencia,  Double.parseDouble(saldo), 0.0);
                }else  if(tipo.equals("2")) {
                    conta = new ContaCorrente(cliente, numero, agencia,  Double.parseDouble(saldo), 0.0);
                }else  if(tipo.equals("3")) {
                    System.out.println("Informe o limit da conta especial: ");
                    String limit = input.nextLine();
                    conta = new ContaEspecial(cliente, numero, agencia,  Double.parseDouble(saldo), Double.parseDouble(limit));
                }
                sistema.cadastrarConta(conta, Integer.parseInt(banco));
            }
            else if(opcao == 4){
                System.out.println("======Depósito======");
                System.out.println("Número da conta:");
                String numero = input.nextLine();
                System.out.println("Agência:");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                System.out.println("Valor do depósito: ");
                String valor = input.nextLine();
                sistema.depositar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
            }
            else if(opcao == 5){
                System.out.println("======Saque======");
                System.out.println("Número da Conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                System.out.println("Valor do saque: ");
                String valor = input.nextLine();
                sistema.sacar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
            }else if(opcao == 6){
                System.out.println("======Transferência======");
                System.out.println("Número da Conta: ");
                String numero = input.nextLine();
                System.out.println("Agência:");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                System.out.println("Número da conta destino: ");
                String numeroDestino = input.nextLine();
                System.out.println("Agência da conta destino: ");
                String agenciaDestino = input.nextLine();
                System.out.println("Código do banco destino: ");
                sistema.listarBancos();
                String bancoDestino = input.nextLine();
                System.out.println("Valor da transferência: ");
                String valor = input.nextLine();
                sistema.transferir(Integer.parseInt(banco), numero, agencia, Integer.parseInt(bancoDestino), numeroDestino, agenciaDestino, Double.parseDouble(valor));
            }else if(opcao == 7){
                System.out.println("======Saldo======");
                System.out.println("Número da conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.exibirSaldo(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 8){
                System.out.println("======Extrato======");
                System.out.println("Número da conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.exibirExtrato(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 9){
                System.out.println("======Rendimentos======");
                System.out.println("Conta recente, ainda não há rendimentos");
            }else if(opcao == 10){
                System.out.println("======Desativar Conta=======");
                System.out.println("Número da conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.encerrarConta(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 11){
                System.out.println("======Reativar conta======");
                System.out.println("Número da conta: ");
                String numero = input.nextLine();
                System.out.println("Agência: ");
                String agencia = input.nextLine();
                System.out.println("Código do Banco: ");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.reativarConta(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 0){
                System.out.println("SISTEMA ENCERRADO!");
                break;
            }
        }

    }
}
