
package service;

import model.Cliente;
import util.ArquivoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();
    private final String ARQUIVO = "clientes.csv";

    public ClienteService() {
        carregarClientes();
    }

    public void cadastrarCliente(Scanner sc) {

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome, telefone, email);

        clientes.add(cliente);

        salvarClientes();

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void buscarCliente(Scanner sc) {

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = encontrarCliente(cpf);

        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void alterarCliente(Scanner sc) {

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = encontrarCliente(cpf);

        if (cliente != null) {

            System.out.print("Novo nome: ");
            cliente.setNome(sc.nextLine());

            System.out.print("Novo telefone: ");
            cliente.setTelefone(sc.nextLine());

            System.out.print("Novo email: ");
            cliente.setEmail(sc.nextLine());

            salvarClientes();

            System.out.println("Cliente alterado com sucesso!");
        }
    }

    public void removerCliente(Scanner sc) {

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = encontrarCliente(cpf);

        if (cliente != null) {
            clientes.remove(cliente);
            salvarClientes();
            System.out.println("Cliente removido com sucesso!");
        }
    }

    public Cliente encontrarCliente(String cpf) {

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }

        return null;
    }

    public void salvarClientes() {

        List<String> linhas = new ArrayList<>();

        for (Cliente c : clientes) {
            linhas.add(c.getCpf() + ";" +
                    c.getNome() + ";" +
                    c.getTelefone() + ";" +
                    c.getEmail());
        }

        ArquivoUtil.escreverArquivo(ARQUIVO, linhas);
    }

    public void carregarClientes() {

        List<String> linhas = ArquivoUtil.lerArquivo(ARQUIVO);

        for (String linha : linhas) {

            String[] dados = linha.split(";");

            Cliente cliente = new Cliente(
                    dados[0],
                    dados[1],
                    dados[2],
                    dados[3]
            );

            clientes.add(cliente);
        }
    }
}
