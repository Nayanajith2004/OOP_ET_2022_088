package LW_05_Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering =new ArrayList<>();

    public Degree(String name, int numberOfStudents, ArrayList<Course> coursesOffering) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }
    public void displayinfo(){
        System.out.println("Degree name: "+name);
        System.out.println("Number of Students follow"+numberOfStudents);
        System.out.println("Courses offering:"+coursesOffering);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }
    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }
    public void listCourseOffering(){
        System.out.println("Courses offered: ");
        for (Course course:coursesOffering){
            System.out.println(course);
        }
    }
}
