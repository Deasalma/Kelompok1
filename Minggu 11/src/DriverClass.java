import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DriverClass {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			ListData result = gson.fromJson(new FileReader("D://dataCustomer.json"), ListData.class);
			for(Customer customer : result.getCustomers()) {
				System.out.println(customer.toString());
			}
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
