public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here

        Secret[] yildiz = Secret.values();

        for (Secret x : yildiz
        ) {
            if (x.name().contains("STAR")) {
                counter++;
            }

        }

        System.out.println(counter);
    }
}

/* sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
*/