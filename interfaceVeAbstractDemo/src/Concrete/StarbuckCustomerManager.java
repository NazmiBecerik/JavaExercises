package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager 
{
	private PersonCheckService checkService;
	public StarbuckCustomerManager(PersonCheckService checkService) 
	{
		this.checkService=checkService;
	}
	@Override
	public void save(Customer customer) 
	{
		if(checkService.chechIfRealPerson(customer)) 
		{
			System.out.println("Starbuck Müşterisi : "+customer.getFirstName()+" Kaydedildi");
		}
		else   
		{
			System.out.println("Kişi bilgileri doğrulanmamıştır.");
		}
	}
}
