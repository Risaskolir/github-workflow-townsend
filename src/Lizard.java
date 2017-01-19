/**
 * Created by Forrest Townsend on 1/19/2017.
 */
public class Lizard extends Animal{
    double speed;

    public Lizard(double price, int amt, double moveLen) {
        this.setPrice(price);
        this.setStock(amt);
        this.setName("Lizard");
        speed = moveLen;

    }

    public void move(){
        System.out.println("The lizard waddles " + speed + " closer to you.");
    }

    public void speak(){
        System.out.println("The lizard makes a small creaking noise.");
    }


}
