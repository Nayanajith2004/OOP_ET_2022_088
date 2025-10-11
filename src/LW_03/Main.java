package LW_03;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course();
        Lecturer jhon = new Lecturer();
        Student kumar = new Student();

        oop.setCourseName("object oreanted programming");
        oop.setCourseCode("ETEC 21062");
        oop.setLic(jhon);

        jhon.setLectureName("jhon smith");
        jhon.setCourseTeaching("oop");

        kumar.setStudentName("kumar sangakkar");
        kumar.setDegreeName("ET");
        kumar.setCourseFollowing("oop");

        System.out.println("student Details:\n"+"Name: "+ kumar.getStudentName()+"\nDegree: "+kumar.getDegreeName()+"\nCourse: "+kumar.getCourseFollowing());
    }
}
