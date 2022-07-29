package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct() {	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {		
		StringBuilder sc = new StringBuilder();		
		sc.append(super.getName() + "(used)");
		sc.append(" $ ");
		sc.append(String.format("%.2f", +super.getPrice()));
		sc.append(" (Manufature date : " +sdf.format(manufactureDate) + ")");
		return  sc.toString();
	}
	

}
