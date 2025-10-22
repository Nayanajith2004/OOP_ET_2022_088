package LW_05_Q2;

import java.util.ArrayList;

public class Lecturer extends Person{
    @Override
    public void displayinfo() {
        System.out.println("Name: "+ getName());
        System.out.println("Position: "+position);
    }
    private String position;
    private Department department;

    private ArrayList<Course> courseTeaching =new ArrayList<>();

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
    }

    public Lecturer(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){
    }

    public void addCourses (Course course){
        courseTeaching.add(course);
    }
    public void removeCourse(Course course){
        courseTeaching.remove(course);
    }
    public void listCourseTeaching(){
        System.out.println("Courses teaching: ");
        for (Course course:courseTeaching){
            System.out.println(course);
        }
    }

}
