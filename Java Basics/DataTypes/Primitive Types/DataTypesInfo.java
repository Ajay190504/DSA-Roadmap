public class DataTypesInfo {

    // Default values (instance variables)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {

        System.out.println("===== PRIMITIVE DATA TYPES IN JAVA =====\n");

        System.out.println("Type: byte");
        System.out.println("Size: " + Byte.SIZE + " bits");
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println("Max: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("Type: short");
        System.out.println("Size: " + Short.SIZE + " bits");
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Type: int");
        System.out.println("Size: " + Integer.SIZE + " bits");
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Type: long");
        System.out.println("Size: " + Long.SIZE + " bits");
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Type: float");
        System.out.println("Size: " + Float.SIZE + " bits");
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("Type: double");
        System.out.println("Size: " + Double.SIZE + " bits");
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Type: char");
        System.out.println("Size: " + Character.SIZE + " bits");
        System.out.println("Min: " + (int) Character.MIN_VALUE);
        System.out.println("Max: " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("Type: boolean");
        System.out.println("Size: JVM dependent (typically 1 bit)");
        System.out.println("Values: true or false");
        System.out.println();

        // Default values demonstration
        DataTypesInfo obj = new DataTypesInfo();

        System.out.println("===== DEFAULT VALUES (Instance Variables) =====\n");

        System.out.println("byte default: " + obj.defaultByte);
        System.out.println("short default: " + obj.defaultShort);
        System.out.println("int default: " + obj.defaultInt);
        System.out.println("long default: " + obj.defaultLong);
        System.out.println("float default: " + obj.defaultFloat);
        System.out.println("double default: " + obj.defaultDouble);
        System.out.println("char default: [" + obj.defaultChar + "]");
        System.out.println("boolean default: " + obj.defaultBoolean);
    }
}