package LW_05_Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering=new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo =new ArrayList<>();

    public Department(String name, Lecturer departmentHead, ArrayList<Course> coursesOffering, ArrayList<Lecturer> lecturersBelongsTo) {
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }
    public void displayinfo(){
        System.out.println("Department Name:"+name);
        System.out.println("Head of the Department:"+departmentHead);
        System.out.println("Courses offering : "+coursesOffering);
        System.out.println("Lectures belongs to Department:"+lecturersBelongsTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void appointDepartmentHead(Lecturer name){
        departmentHead=name;
    }
    public void displayDepartmentHeadInfo(){
        System.out.println(departmentHead);
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }
    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }
    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }
    public void removeLecture(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }
}
