package odev.pkg2;

public class Odev2 {
    
    

    public static void main(String[] args) {
        Stock share = new Stock ("ORCL", "Oracle Corporation");
        share.PreviousClosingPrice = 34.5;
        share.CurrentPrice = 34.35;
        
        System.out.println("hisse sembolu=" + share.symbol);
        System.out.println("hisse adi=" + share.name);
        System.out.println("fiyat degisim yuzdesi=" + share.GetChangePercent());
    }
    
}
