/**
 * Created by towns on 1/17/2017.
 */
public class Frog extends Animal{
    double hop;

    public Frog(double price, int amt, double hopLen) {
        this.setPrice(price);
        this.setStock(amt);
        this.setName("Frog");
        hop = hopLen;

    }

    public void hop(){
        System.out.println("The frog hops " + hop + "inches away from you.");
    }

    public void croak(){
        System.out.println("The frog croaks loudly.");
    }

}
