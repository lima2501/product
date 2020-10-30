package product;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com os dados do produto:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Preço: ");
		Double price = scan.nextDouble();
		System.out.print("Quantidade em estoque: ");
		Integer quantity = scan.nextInt();

		Product product = new Product(name, price, quantity);
		System.out.println(product);

		System.out.print("Entre com o número de produtos que serão adicionados ao estoque: ");
		quantity = scan.nextInt();
		product.addProducts(quantity);
		scan.nextLine();

		System.out.println();
		System.out.println("Dados atualizados");
		System.out.println(product);

		System.out.println();
		System.out.print("Entre com o número de produtos que serão removidos do estoque: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados");
		System.out.println(product);

		scan.close();
	}
}
