package OOP_Java.Grade;

public class Grade {

    private String name;
    private double grade1;
    private double grade2;

    public Grade() {
    }

    public Grade(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double averageGrade(double grade1, double grade2) {
        return (grade1 + grade2) / 2.0;
    }

    public String result() {
        if (averageGrade(grade1, grade2) >= 7.0) {
            return "Approved";
        } else {
            return "Reproved";
        }
    }

    @Override
    public String toString() {
        return "The student's name is " + name + " and the average grade is " + averageGrade(grade1, grade2)
                + " situation: " + result();
    }

}
