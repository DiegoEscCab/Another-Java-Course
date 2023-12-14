import java.util.concurrent.ThreadLocalRandom;
public class GasStation {
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(0,70);
        System.out.println(random);
        if(random >=1 && random < 20){
            System.out.println("Insufficient");
        } else if (random >=20 && random < 35) {
            System.out.println("Enough");
        } else if (random >=35 && random < 40) {
            System.out.println("Half Tank");
        } else if (random >=40 && random < 60) {
            System.out.println("¾ of Tank");
        } else if (random >=60 && random < 70) {
            System.out.println("Almost Full Tank");
        } else if (random == 70) {
            System.out.println("Full Tank");
        } else {
            System.out.println("Empty Tank");
        }
    }
}

