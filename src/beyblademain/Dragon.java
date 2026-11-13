package beyblademain;

public class Dragon extends Beyblade {
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String gizliYetenek, String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
        System.out.println("Gizli yetenek adı: " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkartıyor.");
        System.out.println(getBeybladeci() + " saldırısı: hayalet kasırgası.");
    }
}