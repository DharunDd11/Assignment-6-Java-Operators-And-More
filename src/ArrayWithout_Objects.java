public class ArrayWithout_Objects {

    String message;

    ArrayWithout_Objects(String message) {
        this.message = message;
        System.out.println("Constructor called with: " + message);
    }

    public static void main(String[] args) {

        System.out.println("--- Creating array of references ---");

        // Only array created, NO objects
        ArrayWithout_Objects[] arr = new ArrayWithout_Objects[5];

        System.out.println("--- Array created ---");
        System.out.println("Notice: No constructor messages printed above!");
        System.out.println();

        System.out.println("--- Printing array elements ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}