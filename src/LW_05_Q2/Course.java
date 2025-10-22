package LW_05_Q2;

public class Course {
    private String name,enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }
    public void displayinfo(){
        System.out.println("Course Name: "+name);
        System.out.println("Enroll Type: "+enrollType);
        System.out.println("no of Students Enrolled: "+numberOfStudentsEnrolled);
        System.out.println("Lecture Incharge: "+lecturerInCharge);
        System.out.println("Degree belongs To: "+degreeBelongsTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }
    public void addaLectureIncharge(Lecturer lecturer){
        lecturerInCharge=lecturer;
    }

}
