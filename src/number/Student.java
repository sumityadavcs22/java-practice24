package number;

public class Student {
    int rollNo;
    String name;
    int year;
    double fee;

    public Student(int rollNo, String name, int year, double fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", year=" + year + ", fee=" + fee + '}';
    }
}
