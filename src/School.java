public class School {
    private String students;
    private String teachers;
    private String courses;

    public School() {
        this.students = "";
        this.teachers = "";
        this.courses = "";
    }

    public void enrollStudent(Student student) {
        students += student.name + ":" + ":" + student.gender + ":" + student.id + ",";
    }

    public void hireTeacher(Teacher teacher) {
        teachers += teacher.name + ":" + ":" + teacher.gender + ":" + teacher.id + ",";
    }

    public void offerCourse(Course course) {
        courses += course.getName() + ":" + course.id + ":" + course.teacher.name + ",";
    }
}
