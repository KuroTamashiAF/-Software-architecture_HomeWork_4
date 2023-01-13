package SubSystemClientService.Customers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomersRepozitoriy {
    private ArrayList <Customers> CusList;

    public CustomersRepozitoriy() {
        this.CusList = new ArrayList<>();
    }

    public ArrayList<Customers> getCusList() {
        return CusList;
    }
    public void addCustomers(Customers customers) {
        CusList.add(customers);
    }
}
