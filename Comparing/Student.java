class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering by marks (ascending)
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // ascending order
        // For descending, use: other.marks - this.marks
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}
