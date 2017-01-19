/**
 * Created by Forrest Townsend on 1/17/2017.
 */
public class Store {
    //add name variable, product type sold variable, and inventory kept variable
    private String storeName;
    public Product[] inventory;
    public int size;

    //create constructors
    public Store(){

    }
    public Store(String name,int inventorySize){

        storeName = name;
        inventory = new Product[inventorySize];
        size = 0;
    }

    //create getters and setters for variables
    public String getName(){
        return storeName;
    }

    public void setName(String newName){
        storeName = newName;
    }

    public Product[] getInventory(){
        return inventory;
    }

    public boolean addProduct(Product productName){
        if(this.size<=inventory.length){
            inventory[size] = productName;
            size++;
            return true;
        }
        else
            return false;
    }
    //add method that clears inventory
    public void clearInventory(){
        size = 0;
        for(int i = 0; i < inventory.length; i++) {
            inventory[i] = null;
        }
    }

    //add method that shows
    public String showInventory(){
        String rtnStr = "Store: " + getName() + "\n";
        int i = 0;
        int invLen = inventory.length;
        while(i < invLen && inventory[i] != null) {
            rtnStr = rtnStr + "\n" + inventory[i] + ". In inventory index " + i;
            i++;
        }
        if(i == 0)
            rtnStr = "No items in inventory";

        return rtnStr;
    }
    //create method that 'sells' a product, reducing stock by one and returning true
    //no customer model has been created, so no money is exchanged.
    public Boolean sellProduct(int invIndex) throws NullPointerException{
        if(invIndex<0 || invIndex > inventory.length)
            throw new NullPointerException();
        boolean rtrnVal = false;
        if(inventory[invIndex].getStock()>0){
            inventory[invIndex].reduceStock();
            rtrnVal = true;
        }
        return rtrnVal;
    }

}
