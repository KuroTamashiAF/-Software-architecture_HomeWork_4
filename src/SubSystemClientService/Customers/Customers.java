package SubSystemClientService.Customers;

public class Customers {
    private int id;
    private String name;
    private String lastName;
    private String patronymic;                    // отчество
    private int numberPassport;
    private int passportSeries;

    public Customers(int id, String name, String lastName, String patronymic, int numberPassport, int passportSeries) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.numberPassport = numberPassport;
        this.passportSeries = passportSeries;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setNumberPassport(int numberPassport) {
        this.numberPassport = numberPassport;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }
}
