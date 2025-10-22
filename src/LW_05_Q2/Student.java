package LW_05_Q2;

import java.util.ArrayList;

public class Student extends Person{
    @Override
    public void displayinfo() {
        System.out.println("StudentID: "+studentID);
        System.out.println("Year: "+year);

    }
    private String studentID,year;
    private Degree degree;

    private ArrayList<Course> courseEnrolled =new ArrayList<>();

    public Student(String name, String studentID,String year) {
        super(name);
        this.studentID = studentID;
        this.year=year;
    }

    public Student(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(){

    }
    public void displayDegreeInfo(){

    }
    public void enrollCourse(Course course){
          courseEnrolled.add(course);
    }
    public void unenrollCourse(Course course){
        courseEnrolled.remove(course);
    }
    public void listCoursesEnrolled(){
        for(Course course:courseEnrolled){
            System.out.println(course);
        }
    }
}
