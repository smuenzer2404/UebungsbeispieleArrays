public class ReverseArray {
    public static void main(String[] args) {

        String [] input = { "Hallo", "ich", "heiße", "Sandra"};

        System.out.println();


    }
    public static String [] reverseArray (String [] arrayToReverse) {
        String[] reversed = new String[arrayToReverse.length];
        for (int i = arrayToReverse.length - 1, j = 0; i >= 0; i--, j++) {
            String text = arrayToReverse[i];
            reversed[j] = text;

        }
        return reversed;
    }
}
