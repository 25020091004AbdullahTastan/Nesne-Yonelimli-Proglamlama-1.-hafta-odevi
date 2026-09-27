package odev1;

public class Odev1 {
       
    public static void main(String[] args) {
        Rectangle MyDikdortgen1 = new Rectangle(4,40);
        Rectangle MyDikdortgen2 = new Rectangle(30.5,35.9);
        
        System.out.println(" dikdortgen 1");
        System.out.println("genislik=" + MyDikdortgen1.width);
        System.out.println("yukseklik=" + MyDikdortgen1.height);
        System.out.println("alan=" + MyDikdortgen1.getArea());
        System.out.println("cevre=" + MyDikdortgen1.getPerimeter());
        
        System.out.println("dikdortgen 2");
        System.out.println("genislik=" + MyDikdortgen2.width);
        System.out.println("yukseklik=" + MyDikdortgen2.height);
        System.out.println("alan=" + MyDikdortgen2.getArea());
        System.out.println("cevre=" + MyDikdortgen2.getPerimeter());
        
       
    }
    
}