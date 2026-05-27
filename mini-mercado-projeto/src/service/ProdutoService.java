
package service;

import model.Produto;
import util.ArquivoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();
    private final String ARQUIVO = "produtos.csv";

    public ProdutoService() {
        carregarProdutos();
    }

    public void cadastrarProduto(Scanner sc) {

        System.out.print("Código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = Double.parseDouble(sc.nextLine());

        System.out.print("Estoque: ");
        int estoque = Integer.parseInt(sc.nextLine());

        Produto produto = new Produto(codigo, nome, preco, estoque);

        produtos.add(produto);

        salvarProdutos();

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void buscarProduto(Scanner sc) {

        System.out.print("Digite o código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Produto produto = encontrarProduto(codigo);

        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void alterarProduto(Scanner sc) {

        System.out.print("Digite o código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Produto produto = encontrarProduto(codigo);

        if (produto != null) {

            System.out.print("Novo nome: ");
            produto.setNome(sc.nextLine());

            System.out.print("Novo preço: ");
            produto.setPreco(Double.parseDouble(sc.nextLine()));

            System.out.print("Novo estoque: ");
            produto.setEstoque(Integer.parseInt(sc.nextLine()));

            salvarProdutos();

            System.out.println("Produto alterado com sucesso!");
        }
    }

    public void removerProduto(Scanner sc) {

        System.out.print("Digite o código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Produto produto = encontrarProduto(codigo);

        if (produto != null) {
            produtos.remove(produto);
            salvarProdutos();
            System.out.println("Produto removido com sucesso!");
        }
    }

    public Produto encontrarProduto(int codigo) {

        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }

        return null;
    }

    public void salvarProdutos() {

        List<String> linhas = new ArrayList<>();

        for (Produto p : produtos) {
            linhas.add(p.getCodigo() + ";" +
                    p.getNome() + ";" +
                    p.getPreco() + ";" +
                    p.getEstoque());
        }

        ArquivoUtil.escreverArquivo(ARQUIVO, linhas);
    }

    public void carregarProdutos() {

        List<String> linhas = ArquivoUtil.lerArquivo(ARQUIVO);

        for (String linha : linhas) {

            String[] dados = linha.split(";");

            Produto produto = new Produto(
                    Integer.parseInt(dados[0]),
                    dados[1],
                    Double.parseDouble(dados[2]),
                    Integer.parseInt(dados[3])
            );

            produtos.add(produto);
        }
    }
}
