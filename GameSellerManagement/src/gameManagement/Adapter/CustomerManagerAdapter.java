package gameManagement.Adapter;
import gameManagement.Abstract.CustomerCheckService;
import gameManagement.Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerManagerAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
			if (result) {
				return true;
			}
			System.out.println("Service Not Working");
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	


}
