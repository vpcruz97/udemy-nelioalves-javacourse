package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<Product>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nProduct #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			char ch = input.next().charAt(0);
			
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Price: ");
			double price = input.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Custom fee: ");
				double customFee = input.nextDouble();
				
				list.add(new ImportedProduct(name, price, customFee));
			}
			else if (ch == 'c') {
				list.add(new Product(name, price));
			}
			else {
				System.out.print("Manufacture Date: ");
				try {
					Date date = sdf.parse(input.next());
					list.add(new UsedProduct(name, price, date));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
	}

}
