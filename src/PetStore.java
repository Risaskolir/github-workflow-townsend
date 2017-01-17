/**
 * Created by towns on 1/17/2017.
 */
public class PetStore extends Store {

    public PetStore(String name,int inventorySize) {
        this.setName(name);
        inventory = new Animal[inventorySize];
        size = 0;
    }
}
