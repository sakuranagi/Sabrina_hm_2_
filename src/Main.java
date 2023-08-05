import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(canYouGoWalk(12, 20));
        System.out.println(canYouGoWalk(35, 20));
        System.out.println(canYouGoWalk(50, 30));
        System.out.println(canYouGoWalk(generateRandomAge(), 20));
        System.out.println(canYouGoWalk(generateRandomAge(), 20));

    }

    public static String canYouGoWalk(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
