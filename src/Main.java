public class Main {
    public static void main(String[] args) {

        School school = new School();

        Teacher cosTeacher = new Teacher("John Doe", "SS/35", "Male");
        Teacher statTeacher = new Teacher("Jane Smith", "SS/40", "Female");
        school.hireTeacher(cosTeacher);
        school.hireTeacher(statTeacher);

        Student Lilian = new Student("Alice", "2020/252081", "Female", "201");
        Student Chinonye = new Student("Bob", "2021/243123", "Male", "202");
        school.enrollStudent(Lilian);
        school.enrollStudent(Chinonye);

        Course cosCourse = new Course("Mathematics", "301", cosTeacher);
        Course statCourse = new Course("Physics", "302", statTeacher);
        school.offerCourse(cosCourse);
        school.offerCourse(statCourse);

        cosCourse.registerStudent("Lilian");
        cosCourse.registerStudent("Chinonye");

        statCourse.registerStudent("Chinonye");


    }
}