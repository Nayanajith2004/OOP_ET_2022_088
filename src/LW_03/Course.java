package LW_03;

public class Course {
    private String courseName,courseCode;
    private Lecturer lic;


    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLic() {
        return lic;
    }

    public void setLic(Lecturer lic) {
        this.lic = lic;
    }
}

