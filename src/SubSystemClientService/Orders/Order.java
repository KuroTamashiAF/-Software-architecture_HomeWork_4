package SubSystemClientService.Orders;

import SubSystemClientService.Customers.Customers;

public class Order {
    Customers cus;
    Tiket tik;

    public Order(Customers cus, Tiket tik) {
        this.cus = cus;
        this.tik = tik;
    }

    public Customers getCus() {
        return cus;
    }

    public Tiket getTik() {
        return tik;
    }
}
