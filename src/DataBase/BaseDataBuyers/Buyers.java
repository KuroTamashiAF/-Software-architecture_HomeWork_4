package DataBase.BaseDataBuyers;

import SubSystemClientService.Customers.Customers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buyers {
    private Map <Customers, List<String>> dataBase;

    public Buyers() {
        this.dataBase = new HashMap<>();
    }

    public Map<Customers, List<String>> getDataBase() {
        return dataBase;
    }
}
