import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(1) + 10;
        Octopus otto = new Octopus();
        System.out.println(otto.activity(x));
    }
}
