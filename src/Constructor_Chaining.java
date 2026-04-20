public class Constructor_Chaining {

    String name;
    int age;
    String city;

    // Constructor 2 - takes all 3 parameters
    Constructor_Chaining(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Constructor 2 called!");
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    // Constructor 1 - calls Constructor 2 using this()
    Constructor_Chaining(String name, int age) {
        this(name, age, "Unknown");
        System.out.println("Constructor 1 called!");
        System.out.println("City was not provided, defaulted to: Unknown");
    }

    public static void main(String[] args) {

        System.out.println("--- Creating object with all 3 params ---");
        Constructor_Chaining obj1 = new Constructor_Chaining("Dharun", 21, "Hyderabad");

        System.out.println();

        System.out.println("--- Creating object with 2 params (chaining happens) ---");
        Constructor_Chaining obj2 = new Constructor_Chaining("Dd", 22);
    }
}