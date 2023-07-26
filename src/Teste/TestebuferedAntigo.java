package Teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

public class Testebufered {
public static void main(String[] args) throws IOException {
	
	//JoaoPedro jp = new JoaoPedro("João Pedro", "010101", 20);
	
	Livro harry1 = new Livro(" Harry Potter e a Pedra Filosofal "," J.K Rowlling ","        1 ");
	Livro harry2 = new Livro(" Harry Potter e a Camara Secreta "," J.K Rowlling ","         2 ");
	Livro harry3 = new Livro(" Harry Potter e o Prisioneiro de Azkaban "," J.K Rowlling "," 3 ");
	Livro harry4 = new Livro(" Harry Potter e o Calice de Fogo "," J.K Rowlling ","         4 ");
	Livro harry5 = new Livro(" Harry Potter e a Ordem da Fenix "," J.K Rowlling ","         5 ");
	
	
	//Diz o caminho a ser escrito
	FileWriter fre = new FileWriter("C:\\Dev\\biblioteca_digital\\base_dados\\base_livros.txt");
	//Escreve no caminho
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

	
	Cliente Joao = new Cliente(" 015254 "," joao ");
	Cliente Maria = new Cliente(" 015255 "," Maria ");
	Cliente Erik = new Cliente(" 015256 "," Erik ");
	Cliente Artur = new Cliente(" 015257 "," Artur ");
	Cliente Henrique = new Cliente(" 015258 "," Henrique ");

	FileWriter clientes = new FileWriter("C:\\\\Dev\\\\biblioteca_digital\\\\base_dados\\\\base_clientes.txt");
	BufferedWriter cli = new BufferedWriter(clientes);
	
	
	cli.write(Joao.getCPF() + Joao.getNome());
	cli.newLine();
	cli.write(Maria.getCPF() + Maria.getNome());
	cli.newLine();
	cli.write(Erik.getCPF() + Erik.getNome());
	cli.newLine();
	cli.write(Artur.getCPF() + Artur.getNome());
	cli.newLine();
	cli.write(Henrique.getCPF() + Henrique.getNome());
	cli.newLine();
	cli.close();
	
	Vendas venda1 = new Vendas(Joao, harry1 ,LocalDate.of(2023, Month.JULY, 17));
	Vendas venda2 = new Vendas(Maria, harry2 ,LocalDate.of(2023, Month.JULY, 16));
	Vendas venda3 = new Vendas(Erik, harry2 ,LocalDate.of(2023, Month.JULY, 15));
	Vendas venda4 = new Vendas(Artur, harry3 ,LocalDate.of(2023, Month.JULY, 14));
	Vendas venda5 = new Vendas(Henrique, harry4 ,LocalDate.of(2023, Month.JULY, 13));
	
	FileWriter vendas = new FileWriter("C:\\\\Dev\\\\biblioteca_digital\\\\base_dados\\\\base_vendas.txt");
	BufferedWriter ven = new BufferedWriter(vendas);
	
	ven.write("Venda: " + "Cliente: " + Joao.getNome() + "Livro: "  + venda1.getLivro().getTitulo() + " Data da Compra: Dia: " + venda1.getDataVenda().getDayOfMonth() + " Mês: " + venda1.getDataVenda().getMonth() +" Ano: " + venda1.getDataVenda().getYear());
	ven.newLine();
	ven.write("Venda: " + "Cliente: " + Maria.getNome() + "Livro: "  + venda2.getLivro().getTitulo() + " Data da Compra: Dia: " + venda2.getDataVenda().getDayOfMonth() + " Mês: " + venda2.getDataVenda().getMonth() +" Ano: " + venda2.getDataVenda().getYear());
	ven.newLine();
	ven.write("Venda: " + "Cliente: " + Erik.getNome() + "Livro: "  + venda3.getLivro().getTitulo() + " Data da Compra: Dia: " + venda2.getDataVenda().getDayOfMonth() + " Mês: " + venda2.getDataVenda().getMonth() +" Ano: " + venda2.getDataVenda().getYear());
	ven.newLine();
	ven.write("Venda: " + "Cliente: " + Artur.getNome() + "Livro: "  + venda4.getLivro().getTitulo() + " Data da Compra: Dia: " + venda3.getDataVenda().getDayOfMonth() + " Mês: " + venda3.getDataVenda().getMonth() +" Ano: " + venda3.getDataVenda().getYear());
	ven.newLine();
	ven.write("Venda: " + "Cliente: " + Henrique.getNome() + "Livro: "  + venda5.getLivro().getTitulo() + " Data da Compra: Dia: " + venda4.getDataVenda().getDayOfMonth() + " Mês: " + venda4.getDataVenda().getMonth() +" Ano: " + venda4.getDataVenda().getYear());
	ven.newLine();
	ven.close();
	
	
//	FileReader fr = new FileReader("C:\\Dev\\biblioteca_digital\\base_dados\\base_clientes.txt");
//	BufferedReader Bf = new BufferedReader(fr);
//		String textoLinha;
//		
//		while((textoLinha=Bf.readLine()) != null) {
//			
//			System.out.println(textoLinha);
//			
//		}
//	Bf.close();
//	
//	FileReader free = new FileReader("C:\\Dev\\biblioteca_digital\\base_dados\\base_livros.txt");
//	BufferedReader Bfe = new BufferedReader(free);
//		String textoLinha1;
//		
//		while((textoLinha1=Bfe.readLine()) != null) {
//			
//			System.out.println(textoLinha1);
//			
//		}
//	Bfe.close();
//	
//	
//	
//	FileReader fri = new FileReader("C:\\Dev\\biblioteca_digital\\base_dados\\base_vendas.txt");
//	BufferedReader Bfi = new BufferedReader(fri);
//		String textoLinha2;
//		
//		while((textoLinha2=Bfi.readLine()) != null) {
//			
//			System.out.println(textoLinha2);
//			
//		}
//	Bfi.close();
	

	//metodo que le txt e traz pro java
	
	
	
	
	
	

}
}
