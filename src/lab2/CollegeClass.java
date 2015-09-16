/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author andre_000
 */
public interface CollegeClass {

    // The word abstract is not needed however is here to illustrate the point that these are abstract methods.
    // These are the methods that all collegeClasses require.
    
      public abstract String getCourseNumber();
      public abstract void setCourseNumber(String courseNumber);
      public abstract double getCredits();
      public abstract void setCredits(double credits);

      public abstract String getCourseName();
      public abstract void setCourseName(String courseName);

}
