import java.util.*;
public class ComparatorMasterDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3,"Ajay",85));
        list.add(new Student(1,"Ravi",70));
        list.add(new Student(2,"Meena",90));
        list.add(new Student(4,"Karan",70));

        System.out.println("Original List");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 1 Sort by ID
        // ----------------------------------------------------

        list.sort(Comparator.comparingInt(s -> s.id));
        // comparingInt → compares integer field

        System.out.println("\nSort by ID");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 2 Sort by Name
        // ----------------------------------------------------

        list.sort(Comparator.comparing(s -> s.name));
        // comparing → compares object property

        System.out.println("\nSort by Name");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 3 Sort by Marks
        // ----------------------------------------------------

        list.sort(Comparator.comparingInt(s -> s.marks));

        System.out.println("\nSort by Marks");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 4 Reverse Order
        // ----------------------------------------------------

        list.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
        // reversed() → reverses comparator result

        System.out.println("\nSort Marks Descending");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 5 Multiple Field Sorting
        // ----------------------------------------------------

        list.sort(
            Comparator.comparingInt((Student s) -> s.marks)
                      .thenComparing(s -> s.name)
        );
        // thenComparing → secondary comparison

        System.out.println("\nSort by Marks then Name");
        list.forEach(System.out::println);


        // ----------------------------------------------------
        // 6 Null Handling
        // ----------------------------------------------------

        List<String> names = new ArrayList<>();

        names.add("Ajay");
        names.add(null);
        names.add("Vijay");

        names.sort(Comparator.nullsFirst(String::compareTo));
        // nullsFirst → places null values first

        System.out.println("\nNulls First");
        System.out.println(names);

        names.sort(Comparator.nullsLast(String::compareTo));
        // nullsLast → places null values last

        System.out.println("\nNulls Last");
        System.out.println(names);


        // ----------------------------------------------------
        // 7 Natural Order
        // ----------------------------------------------------

        List<Integer> nums = Arrays.asList(5,2,9,1);

        nums.sort(Comparator.naturalOrder());
        // naturalOrder → ascending order

        System.out.println("\nNatural Order");
        System.out.println(nums);


        // ----------------------------------------------------
        // 8 Reverse Order
        // ----------------------------------------------------

        nums.sort(Comparator.reverseOrder());
        // reverseOrder → descending order

        System.out.println("\nReverse Order");
        System.out.println(nums);


        // ----------------------------------------------------
        // 9 Comparing Double
        // ----------------------------------------------------

        class Product {
            String name;
            double price;

            Product(String name,double price){
                this.name=name;
                this.price=price;
            }

            public String toString(){
                return name+" "+price;
            }
        }

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop",50000));
        products.add(new Product("Mobile",20000));
        products.add(new Product("Tablet",30000));

        products.sort(Comparator.comparingDouble(p -> p.price));
        // comparingDouble → compares double field

        System.out.println("\nSort by Price");
        products.forEach(System.out::println);


        // ----------------------------------------------------
        // 10 Comparator using Lambda
        // ----------------------------------------------------

        nums.sort((a,b) -> a - b);
        // custom comparator using lambda

        System.out.println("\nLambda Sort");
        System.out.println(nums);


        // ----------------------------------------------------
        // 11 Comparator using Anonymous Class
        // ----------------------------------------------------

        Collections.sort(nums,new Comparator<Integer>(){

            public int compare(Integer a,Integer b){
                return b - a;
            }
        });
        // anonymous comparator class

        System.out.println("\nAnonymous Comparator Desc");
        System.out.println(nums);


        // ----------------------------------------------------
        // 12 Length Based Sorting
        // ----------------------------------------------------

        List<String> words = Arrays.asList("Java","AI","MachineLearning","Code");

        words.sort(Comparator.comparingInt(String::length));
        // comparingInt(String::length) → sort by string length

        System.out.println("\nSort by Length");
        System.out.println(words);

    }
}