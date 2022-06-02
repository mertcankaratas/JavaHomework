package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalityId()=="11111111111") {
			return true;
		}
		return false;
	}

}
