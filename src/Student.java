public class Student
{
    private String name;
    private int gradeLevel;
    private String school;

    /* Write the two constructors here, as described above */
    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;

        if (gradeLevel >= 9 && gradeLevel <= 12) {
            school = "High School";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            school = "Middle School";
        } else if (gradeLevel < 6) {
            school = "Elementary School";
        }
    }

    public String toString()
    {
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
