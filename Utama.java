package bangundatar;

/**
 *
 * @author Fredika Sanjaya
 */
public class Utama {
    public static void main(String[] args){
        
        BangunDatar bangunDatar = new BangunDatar();
        Lingkaran lingkaran = new Lingkaran (50);
        Segitiga segitiga = new Segitiga(6,3);
        Persegi persegi = new Persegi(4);
        
        //Memanggil Method Luas dan Keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());
        
    }
    
}
