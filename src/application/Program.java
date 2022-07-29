package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date contractDate = sdf.parse("28/09/1993");

		Product p = new UsedProduct("TV", 200.0, contractDate);
		
		System.out.println(p.priceTag());
		
		
	}

}
