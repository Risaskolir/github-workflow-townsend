/**
 * Created by Forrest Townsend on 1/19/2017.
 */
public class Turtle extends Animal {

    double speed;

    public Turtle(double price, int amt, double moveLen) {
        this.setPrice(price);
        this.setStock(amt);
        this.setName("Turtle");
        speed = moveLen;

    }

    public void move(){
        System.out.println("The turtle creeps " + speed + " inches away from you, very slowly.");
    }

    public void speak(){
        System.out.println("The turtle makes a quiet grunt in your general direction.");
    }
}
