package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner in = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter with the number of products: ");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" +(i+1)+ ":");
			System.out.print("Comon, used or imported (c/u/i)? ");
			char resp = in.next().charAt(0);
			System.out.print("Name: ");
			String name = in.next();
			System.out.print("Price: ");
			double price = in.nextDouble();

			if (resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date day = sdf.parse(in.next());
				Product used = new UsedProduct(name, price, day);
				list.add(used);
			} else if (resp == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = in.nextDouble();
				Product imported = new ImportedProduct(name, price, customsFee);
				
				list.add(imported);
			} else {
				Product product = new Product(name, price);
				list.add(product);
			}

		}
		System.out.println();
		System.out.println("Price Tags: ");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}

	}

}
