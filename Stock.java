package odev.pkg2;


public class Stock {
    String symbol;
    String name;
    double PreviousClosingPrice;
    double CurrentPrice;
    

public Stock(String newSymbol, String newName){
    symbol = newSymbol;
    name = newName;
    
}
public double GetChangePercent(){
    return ((CurrentPrice - PreviousClosingPrice)/  PreviousClosingPrice) * 100;
    
}

}