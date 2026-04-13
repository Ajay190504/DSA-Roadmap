// Interface definition (used for abstraction)
interface Animal {
    void sound(); // abstract method
}

// Class implementing interface (runtime polymorphism)
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Custom class (user-defined data type)
class Student {
    int id;          // instance variable (default = 0)
    String name;     // reference variable (default = null)

    // Method to display object data
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class NonPrimitiveDemo {

    // Instance variables to demonstrate default values
    String defaultString;     // default = null
    int[] defaultArray;       // default = null
    Student defaultObject;    // default = null

    public static void main(String[] args) {

        // ================= STRING =================
        System.out.println("===== STRING =====");

        // String literal (stored in String Pool)
        String s1 = "Ajay";

        // String object using 'new' keyword (stored in Heap)
        String s2 = new String("Ajay");

        // Reference comparison (checks memory address)
        System.out.println("s1 == s2: " + (s1 == s2)); // false

        // Value comparison (checks actual content)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true


        // ================= ARRAY =================
        System.out.println("\n===== ARRAY =====");

        // Array creation (stored in heap, fixed size)
        int[] arr = {10, 20, 30};

        // Accessing array elements using index
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }


        // ================= CLASS & OBJECT =================
        System.out.println("\n===== CLASS & OBJECT =====");

        // Object creation using 'new' keyword (heap allocation)
        Student s = new Student();

        // Assigning values
        s.id = 1;
        s.name = "Ajay";

        // Calling method
        s.display();


        // ================= REFERENCE BEHAVIOR =================
        System.out.println("\n===== OBJECT REFERENCE BEHAVIOR =====");

        Student ref1 = new Student(); // new object created
        ref1.id = 101;

        // Copying reference (NOT object)
        Student ref2 = ref1;

        // Changing value using second reference
        ref2.id = 202;

        // Both print 202 because both refer same object
        System.out.println("ref1.id: " + ref1.id);
        System.out.println("ref2.id: " + ref2.id);


        // ================= INTERFACE =================
        System.out.println("\n===== INTERFACE =====");

        // Interface reference holding implementing class object
        Animal a = new Dog();

        // Runtime polymorphism (method decided at runtime)
        a.sound();


        // ================= WRAPPER CLASS =================
        System.out.println("\n===== WRAPPER CLASS =====");

        int primitive = 10;

        // Autoboxing: converting primitive to object
        Integer wrapper = primitive;

        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapper: " + wrapper);


        // ================= DEFAULT VALUES =================
        System.out.println("\n===== DEFAULT VALUES =====");

        // Creating object to access instance variables
        NonPrimitiveDemo obj = new NonPrimitiveDemo();

        // All reference types default to null
        System.out.println("Default String: " + obj.defaultString);
        System.out.println("Default Array: " + obj.defaultArray);
        System.out.println("Default Object: " + obj.defaultObject);


        // ================= STRING IMMUTABILITY =================
        System.out.println("\n===== STRING IMMUTABILITY =====");

        String str = "Hello";

        // Creates new object, original remains unchanged
        str.concat(" World");

        System.out.println("After concat (without assignment): " + str); // Hello

        // Now assigning new value
        str = str.concat(" World");

        System.out.println("After concat (with assignment): " + str); // Hello World


        // ================= MULTI-DIMENSIONAL ARRAY =================
        System.out.println("\n===== 2D ARRAY =====");

        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        // Traversing 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // ================= NULL POINTER EXCEPTION DEMO =================
        System.out.println("\n===== NULL POINTER EXCEPTION DEMO =====");

        try {
            Student sNull = null;

            // This will throw NullPointerException
            System.out.println(sNull.name);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Object is null");
        }
    }
}