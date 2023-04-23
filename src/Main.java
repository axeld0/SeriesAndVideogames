import model.Series;
import model.Test;
import model.VideoGame;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();

        t.constructArray();
        t.lendSomeProducts();
        System.out.println("We lend "+ t.howMuchHaveWeLend());
    }
}