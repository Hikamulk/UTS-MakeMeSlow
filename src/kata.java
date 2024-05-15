public class kata {
    public static void makeMeSlow() {
        try {
            Thread.sleep(7000); // Menunggu selama 7000 milidetik (7 detik)
        } catch (InterruptedException e) {
            System.err.println("Jeda terganggu!");
        }
    }
} 