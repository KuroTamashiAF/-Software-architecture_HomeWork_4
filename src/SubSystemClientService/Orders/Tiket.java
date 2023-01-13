package SubSystemClientService.Orders;

public class Tiket {
    private int idTiket;

    public Tiket() {
        this.idTiket = (int)Math.random()*100;
    }

    public int getIdTiket() {
        return idTiket;
    }
}
