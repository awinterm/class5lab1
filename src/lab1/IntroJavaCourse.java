package lab1;

/**
 * This class has its own name and number but inherits its credits and prerequisites from
 * abstract super classes.
 *
 * @author      Andrew Wintermyer
 * @version     1.00
 */
public class IntroJavaCourse extends AdvancedCollegeClass {
    private String courseName;
    private String courseNumber;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }



    
}
