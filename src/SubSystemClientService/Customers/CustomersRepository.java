package SubSystemClientService.Customers;

import java.util.ArrayList;

public class CustomersRepository {
    private ArrayList <Customers> CusList;

    public CustomersRepository() {
        this.CusList = new ArrayList<>();
    }

    public ArrayList<Customers> getCusList() {
        return CusList;
    }
    public void addCustomers(Customers customers) {
        CusList.add(customers);
    }
}
