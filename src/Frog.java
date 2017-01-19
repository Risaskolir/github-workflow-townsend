/**
 * Created by Forrest Townsend on 1/17/2017.
 */
public class Frog extends Animal{
    double speed;

    public Frog(double price, int amt, double moveLen) {
        this.setPrice(price);
        this.setStock(amt);
        this.setName("Frog");
        speed = moveLen;

    }

    public void move(){
        System.out.println("The frog hops " + speed + " inches away from you.");
    }

    public void speak(){
        System.out.println("The frog croaks loudly.");
    }

}
