import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager starbucksCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager neroCustomerManager= new NeroCustomerManager();
		
		
		Customer starbucksCustomer = new Customer(1,"Mertcan","Karataþ",new Date(1997),"11111111111");
		Customer neroCustomer = new Customer(2,"can","Karataþ",new Date(1997),"1111111");

		starbucksCustomerManager.save(starbucksCustomer);
		neroCustomerManager.save(neroCustomer);

	}

}