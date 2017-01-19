/**
 * Created by Forrest Townsend on 1/19/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //create store
        PetStore petStor = new PetStore("Lil Pets",3);
        //create several animal instances
        Frog frog1 = new Frog(15.00,8,9.5);
        Turtle turt1 = new Turtle(34.00,4,2);
        Lizard liz1 = new Lizard(57.99,1,16);

        //test to see if empty store to string works
        System.out.println("Show empty store.");
        System.out.println(petStor.showInventory());
        //add animals products to the store, returns true for each added
        System.out.println("Adding 3 Animals, expect 3 true.");
        System.out.println(petStor.addProduct(frog1));
        System.out.println(petStor.addProduct(turt1));
        System.out.println(petStor.addProduct(liz1));
        //show all products in store (should be three)
        System.out.println();
        System.out.println("Store with 3 animals.");
        System.out.println(petStor.showInventory());
        //test all speak/move methods on the animals
        System.out.println();
        System.out.println("Make all animals speak.");
        frog1.speak();
        turt1.speak();
        liz1.speak();
        System.out.println();
        System.out.println("Make all animals move.");
        frog1.move();
        turt1.move();
        liz1.move();
        System.out.println();
        //sell lizard, could do with all animals but method is the same regardless
        System.out.println("Sell a lizard, expect true.");
        System.out.println(petStor.sellProduct(2));
        System.out.println();
        //test to see if the number of lizards has actually been changed
        System.out.println("Show inventory, lizard will have 0 items in stock.");
        System.out.println(petStor.showInventory());
        System.out.println();
        //test to make sure the correct text is given when there are no lizards
        //left in inventory
        System.out.println("Attempt to sell a lizard, expect false.");
        System.out.println(petStor.sellProduct(2));
        System.out.println();
        //clear list and show empty inventory
        System.out.println("Clearing Inventory.");
        System.out.println();
        petStor.clearInventory();
        System.out.println("Showing empty inventory.");
        System.out.println();
        System.out.println(petStor.showInventory());
        System.out.println();
        System.out.println("Testing Complete.");
    }
}
