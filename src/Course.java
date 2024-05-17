public class Course extends Role{
    private String name;


    public Teacher teacher;
    private String studentsRegistered;

    public Course(String name, String id, Teacher teacher) {
        super(id);
        this.name = name;
        this.teacher = teacher;
        this.studentsRegistered = "";
    }

    public String getName() {
        return name;
    }

    public void registerStudent(String Student) {
        studentsRegistered += Student + ",";
        System.out.println(studentsRegistered);
    }


}
