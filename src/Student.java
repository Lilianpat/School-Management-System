public class Student extends Role{
    private String grade;
    private String registeredCourses;



    public Student(String name,String id, String gender, String grade) {
        super(name, id, gender);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void registerCourse(Course course, String courseId) {
        registeredCourses += course.getName();
    }

    public void takeExam(Course course, int score) {
        System.out.println(name + " took exam for course: " + course.getName() + " and scored: " + score);
    }





}
