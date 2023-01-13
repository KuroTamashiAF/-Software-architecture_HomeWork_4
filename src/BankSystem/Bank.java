package BankSystem;

import SubSystemClientService.Customers.Customers;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map <Customers, Double> map;    // Double - типо деньги на счету
    
    public Bank() {
        this.map = new HashMap<>();
    }

    public Map<Customers, Double> getMap() {
        return map;
    }
}
