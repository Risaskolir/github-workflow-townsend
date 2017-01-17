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

    public void clearInventory(){
        size = 0;
        for(int i = 0; i < inventory.length; i++) {
            inventory[i] = null;
        }
    }

    public String ShowInventory(){
        String rtnStr = "";
        int i = 0;
        while(i < inventory.length && inventory[i] != null)
            rtnStr = rtnStr + "\n" + inventory[i];
        return rtnStr;
    }

}
