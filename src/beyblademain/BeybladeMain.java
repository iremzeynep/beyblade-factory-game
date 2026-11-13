package beyblademain;
import java.util.Scanner;

public class BeybladeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beyblade fabrikamıza hoşgeldiniz.");
        
        while(true) {
            
            System.out.println("Üretebileceğiniz 4 tane beyblade var:\n"
                    + "1. Dranza\n"
                    + "2. Drayga\n"
                    + "3. Draciel\n"
                    + "4. Dragon\n"
                    + "Üretmek istediğiniz beyblade'in ismini girin.\n"
                    + "Çıkış yapmak istiyorsanız da q'ya basın.");
                    
            String tur = scanner.nextLine();
            
            if(tur.equals("q")) {
                System.out.println("Sistemden çıkış yapılıyor...");
                System.out.println("Sistemden çıkış yapıldı.");
                break;
            }
            else {
                Fabrika fabrika = new Fabrika();
                Beyblade beyblade = fabrika.uret(tur);
                
                if(beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade girin.");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }    
            }     
        }
    }
}
