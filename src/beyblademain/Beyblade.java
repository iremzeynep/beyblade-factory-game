package beyblademain;

public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir() {
        System.out.println(beybladeci + " " + saldiriGucu + " saldırı gücü ve " + donusHizi + " dönüş hızı ile saldırıyor.");
    }
    
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beyblade kutsal canavara sahip değil.");
    }
    
    public void bilgileriGoster() {
        System.out.println("Beybladeci ismi: " + beybladeci
                          + "\nDönüş hızı: " + donusHizi
                          + "\nSaldırı gücü: " + saldiriGucu);
    }
}