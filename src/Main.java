public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 19 ; i++) {
            System.out.println("Batch "+ i + " is great");
            Thread.sleep(2000);
        }
        System.out.println("But teh Batch 19 is the greatest!");
    }
}
