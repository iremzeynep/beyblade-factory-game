package beyblademain;

public class Fabrika {
    
    public Beyblade uret(String beybladeTuru) {
    
        if(beybladeTuru.equals("Dragon")) {
            return new Dragon("Kutsal canavarla konuşma", "Mavi Ejderha", "Takao", 800, 300);
        }
        else if(beybladeTuru.equals("Dranza")) {
            return new Dranza("Kırmızı Anka Kuşu", "Kai", 600, 400);  
        }
        else if(beybladeTuru.equals("Drayga")) {
            return new Drayga("Beyaz Kaplan", "Rei", 800, 250);
        }
        else if(beybladeTuru.equals("Draciel")) {
            // YANLIŞ SINIF ÇAĞRISI (BUG) BURADA DÜZELTİLDİ:
            return new Draciel("Kara kaplumbağa", "Max", 400, 1000);    
        }       
        else {
            return null;
        }
    }
}