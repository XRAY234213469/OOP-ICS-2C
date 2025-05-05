public class loopwhile {
    public static class LoopWithoutScanner {
        public static void main(String[] args) {
            int counter = 1;

            while (counter <= 5) {
                if (counter % 2 == 0) {
                    System.out.println(counter + " is even");
                } else {
                    System.out.println(counter + " is odd");
                }
                counter++; // increase the counter
           }
        }
    }
}
