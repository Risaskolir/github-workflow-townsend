/**
 * Created by towns on 1/17/2017.
 */
public class Product {

    //add name, sell price and stock number variable
    private String name;
    private double sellPrice;
    private int amountInStock;


    //create constructors
    public Product(){

    }
    public Product(String prodName, double price, int stockAmt){

        name = prodName;
        sellPrice = price;
        amountInStock = stockAmt;
    }

    //create getters and setters for the variables
    public double getPrice(){
        return sellPrice;
    }

    public void setPrice(double newPrice){
        sellPrice = newPrice;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){name = newName;}

    public int getStock(){
        return amountInStock;
    }

    public void setStock(int newStockAmount){
        amountInStock = newStockAmount;
    }



    @Override
    public String toString(){
        return name + ":  Number in Stock " + amountInStock + "Sold For " + sellPrice;
    }

}
