public class MeTor {
    public static void main(String[] args) {
        int i = 1;

        // Perulangan while
        while(i > 5) {
            System.out.println("Perulangan ke - " + i);
            i++;
        }

        do {
            System.out.println("Perulangan do-while ke - " + i);
            i++;
        } while(i < 5);
    }
}
