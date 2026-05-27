
package service;

import model.Cliente;
import model.Produto;

import java.util.Scanner;

public class CompraService {

    private ProdutoService produtoService;
    private ClienteService clienteService;

    public CompraService(ProdutoService produtoService, ClienteService clienteService) {
        this.produtoService = produtoService;
        this.clienteService = clienteService;
    }

    public void realizarCompra(Scanner sc) {

        System.out.print("Sou cadastrado? (S/N): ");
        String resposta = sc.nextLine();

        Cliente cliente = null;

        if (resposta.equalsIgnoreCase("S")) {

            System.out.print("Digite o CPF: ");
            String cpf = sc.nextLine();

            cliente = clienteService.encontrarCliente(cpf);

            if (cliente == null) {
                System.out.println("Cliente não encontrado.");
                return;
            }
        }

        double total = 0;
        String continuar = "N";

        do {

            System.out.print("Código do produto: ");
            int codigo = Integer.parseInt(sc.nextLine());

            Produto produto = produtoService.encontrarProduto(codigo);

            if (produto == null) {
                System.out.println("Produto não encontrado.");
                continue;
            }

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            if (quantidade > produto.getEstoque()) {
                System.out.println("Estoque insuficiente.");
                continue;
            }

            double subtotal = quantidade * produto.getPreco();

            total += subtotal;

            produto.setEstoque(produto.getEstoque() - quantidade);

            System.out.println("Subtotal: R$" + subtotal);

            System.out.print("Adicionar mais produtos? (S/N): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        produtoService.salvarProdutos();

        System.out.println("\n===== RESUMO DA COMPRA =====");

        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNome());
        }

        System.out.println("Total da compra: R$" + total);
    }
}
