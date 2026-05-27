
import service.ClienteService;
import service.CompraService;
import service.ProdutoService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProdutoService produtoService = new ProdutoService();
        ClienteService clienteService = new ClienteService();
        CompraService compraService = new CompraService(produtoService, clienteService);

        int opcao;

        do {
            System.out.println("\n====================================");
            System.out.println("      MINI MERCADO - MENU");
            System.out.println("====================================");
            System.out.println("1. Produtos");
            System.out.println("2. Clientes");
            System.out.println("3. Realizar Compra");
            System.out.println("4. Controle de Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    menuProdutos(sc, produtoService);
                    break;
                case 2:
                    menuClientes(sc, clienteService);
                    break;
                case 3:
                    compraService.realizarCompra(sc);
                    break;
                case 4:
                    produtoService.listarProdutos();
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void menuProdutos(Scanner sc, ProdutoService service) {

        int opcao;

        do {
            System.out.println("\n=========== PRODUTOS ===========");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto");
            System.out.println("4. Alterar Produto");
            System.out.println("5. Remover Produto");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    service.cadastrarProduto(sc);
                    break;
                case 2:
                    service.listarProdutos();
                    break;
                case 3:
                    service.buscarProduto(sc);
                    break;
                case 4:
                    service.alterarProduto(sc);
                    break;
                case 5:
                    service.removerProduto(sc);
                    break;
            }

        } while (opcao != 0);
    }

    public static void menuClientes(Scanner sc, ClienteService service) {

        int opcao;

        do {
            System.out.println("\n=========== CLIENTES ===========");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Buscar Cliente");
            System.out.println("4. Alterar Cliente");
            System.out.println("5. Remover Cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    service.cadastrarCliente(sc);
                    break;
                case 2:
                    service.listarClientes();
                    break;
                case 3:
                    service.buscarCliente(sc);
                    break;
                case 4:
                    service.alterarCliente(sc);
                    break;
                case 5:
                    service.removerCliente(sc);
                    break;
            }

        } while (opcao != 0);
    }
}
