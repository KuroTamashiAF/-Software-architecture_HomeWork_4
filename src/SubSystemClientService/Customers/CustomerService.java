package SubSystemClientService.Customers;

import java.util.Scanner;

public class CustomerService implements ILoginCustomers {
    @Override
    public String[] login() {
        String[] result  = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Login");
        result[1] = sc.next();
        System.out.println("Введите Пароль");
        result[2] = sc.next();
        return result;
    }
}
