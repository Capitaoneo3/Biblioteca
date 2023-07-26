package Teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testebufered {

	private static void escreveBaseDeAutores(Livro harry1, Livro harry2, Livro harry3, Livro harry4, Livro harry5)
			throws IOException {
		// Diz o caminho a ser escrito
		FileWriter fre = new FileWriter(
				"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_livros.txt");
		// Escreve no caminho
		BufferedWriter bre = new BufferedWriter(fre);

		bre.write(harry1.getTitulo() + harry1.getAutor() + harry1.getCodigo());
		bre.newLine();
		bre.write(harry2.getTitulo() + harry2.getAutor() + harry2.getCodigo());
		bre.newLine();
		bre.write(harry3.getTitulo() + harry3.getAutor() + harry3.getCodigo());
		bre.newLine();
		bre.write(harry4.getTitulo() + harry4.getAutor() + harry4.getCodigo());
		bre.newLine();
		bre.write(harry5.getTitulo() + harry5.getAutor() + harry5.getCodigo());
		bre.newLine();
		bre.close();
	}

	private static void escreveBaseDeClientes(Cliente Joao, Cliente Maria, Cliente Erik, Cliente Artur,
			Cliente Henrique) throws IOException {
		FileWriter clientes = new FileWriter(
				"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_clientes.txt");
		BufferedWriter cli = new BufferedWriter(clientes);

		cli.write(Joao.getCPF() + ";" + Joao.getNome());
		cli.newLine();
		cli.write(Maria.getCPF() + ";" + Maria.getNome());
		cli.newLine();
		cli.write(Erik.getCPF() + ";" + Erik.getNome());
		cli.newLine();
		cli.write(Artur.getCPF() + ";" + Artur.getNome());
		cli.newLine();
		cli.write(Henrique.getCPF() + ";" + Henrique.getNome());
		cli.newLine();
		cli.close();
	}

	private static void escreveBaseDeVendas(Vendas venda1, Vendas venda2, Vendas venda3, Vendas venda4, Vendas venda5)
			throws IOException {
		FileWriter vendas = new FileWriter(
				"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_vendas.txt");
		BufferedWriter ven = new BufferedWriter(vendas);

		ven.write("Venda: " + "Cliente: " + Joao.getNome() + "Livro: " + venda1.getLivro().getTitulo()
				+ " Data da Compra: Dia: " + venda1.getDataVenda().getDayOfMonth() + " Mês: "
				+ venda1.getDataVenda().getMonth() + " Ano: " + venda1.getDataVenda().getYear());
		ven.newLine();
		ven.write("Venda: " + "Cliente: " + Maria.getNome() + "Livro: " + venda2.getLivro().getTitulo()
				+ " Data da Compra: Dia: " + venda2.getDataVenda().getDayOfMonth() + " Mês: "
				+ venda2.getDataVenda().getMonth() + " Ano: " + venda2.getDataVenda().getYear());
		ven.newLine();
		ven.write("Venda: " + "Cliente: " + Erik.getNome() + "Livro: " + venda3.getLivro().getTitulo()
				+ " Data da Compra: Dia: " + venda2.getDataVenda().getDayOfMonth() + " Mês: "
				+ venda2.getDataVenda().getMonth() + " Ano: " + venda2.getDataVenda().getYear());
		ven.newLine();
		ven.write("Venda: " + "Cliente: " + Artur.getNome() + "Livro: " + venda4.getLivro().getTitulo()
				+ " Data da Compra: Dia: " + venda3.getDataVenda().getDayOfMonth() + " Mês: "
				+ venda3.getDataVenda().getMonth() + " Ano: " + venda3.getDataVenda().getYear());
		ven.newLine();
		ven.write("Venda: " + "Cliente: " + Henrique.getNome() + "Livro: " + venda5.getLivro().getTitulo()
				+ " Data da Compra: Dia: " + venda4.getDataVenda().getDayOfMonth() + " Mês: "
				+ venda4.getDataVenda().getMonth() + " Ano: " + venda4.getDataVenda().getYear());
		ven.newLine();
		ven.close();
	}

	static Cliente Joao = new Cliente(" 015254 ", " joao ");
	static Cliente Maria = new Cliente(" 015255 ", " Maria ");
	static Cliente Erik = new Cliente(" 015256 ", " Erik ");
	static Cliente Artur = new Cliente(" 015257 ", " Artur ");
	static Cliente Henrique = new Cliente(" 015258 ", " Henrique ");

	static Livro harry1 = new Livro(" Harry Potter e a Pedra Filosofal ", " J.K Rowlling ", "        1 ");
	static Livro harry2 = new Livro(" Harry Potter e a Camara Secreta ", " J.K Rowlling ", "         2 ");
	static Livro harry3 = new Livro(" Harry Potter e o Prisioneiro de Azkaban ", " J.K Rowlling ", " 3 ");
	static Livro harry4 = new Livro(" Harry Potter e o Calice de Fogo ", " J.K Rowlling ", "         4 ");
	static Livro harry5 = new Livro(" Harry Potter e a Ordem da Fenix ", " J.K Rowlling ", "         5 ");

	static Vendas venda1 = new Vendas(Joao, harry1, LocalDate.of(2023, Month.JULY, 17));
	static Vendas venda2 = new Vendas(Maria, harry2, LocalDate.of(2023, Month.JULY, 16));
	static Vendas venda3 = new Vendas(Erik, harry2, LocalDate.of(2023, Month.JULY, 15));
	static Vendas venda4 = new Vendas(Artur, harry3, LocalDate.of(2023, Month.JULY, 14));
	static Vendas venda5 = new Vendas(Henrique, harry4, LocalDate.of(2023, Month.JULY, 13));

	static List<Cliente> clientes = new ArrayList<>();
	static void inserirDados() throws IOException {
		escreveBaseDeClientes(Joao, Maria, Erik, Artur, Henrique);
	}

	static void leBaseClientes() throws IOException {
		
		FileReader fr = new FileReader(
				"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_clientes.txt");
		BufferedReader Bf = new BufferedReader(fr);

		Scanner scanner = new Scanner(Bf);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] palavras = linha.split(";");
			// System.out.println(palavras[0]+" "+palavras[1]);

			Cliente clienteLaco = new Cliente(palavras[0], palavras[1]);
			clientes.add(clienteLaco);
			System.out.println("O cpf: " + palavras[0] + " o nome do cliente" + palavras[1]);
		}

		scanner.close();
		Bf.close();
	}

	static void retomarTrabalho() throws IOException {
		leBaseClientes();
	}

	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader(
				"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_clientes.txt");
		BufferedReader Bf = new BufferedReader(fr);
		Scanner scanner = new Scanner(Bf);
		scanner.close();
		Bf.close();


		// escreveBaseDeAutores(harry1,harry2,harry3,harry4,harry5);
		// escreveBaseDeClientes( Joao, Maria, Erik, Artur, Henrique);
		// escreveBaseDeVendas(venda1,venda2,venda3,venda4,venda5);
		if(scanner.hasNext()){
		retomarTrabalho();
		}
		else{
		escreveBaseDeClientes( Joao, Maria, Erik, Artur, Henrique);
		}
	}
}
