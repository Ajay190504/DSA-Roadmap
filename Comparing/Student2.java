class Student2 {
    String name;
    int marks;

    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}
