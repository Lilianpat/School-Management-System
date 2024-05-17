public class Teacher extends Role{


    public Teacher(String name, String id, String gender) {
        super(name, id, gender);

    }
    public void courseTeaching(Course course) {
        System.out.println(name + " is teaching course: " + course.getName());
    }
    public void assignGrade(Student student, Course course, int score) {
        System.out.println(name + " assigned grade " + score + " to " + student.getName() + " for course: " + course.getName());
    }

}
