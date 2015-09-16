/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author andre_000
 */
public interface CollegeClass {

    // The word abstract is not needed however is here to illustrate the point that these are abstract methods.
    // These are the methods that all collegeClasses require.
    // I have included get and set prerequisites classes that have none should set this var to "None"
    
      public abstract String getCourseNumber();
      public abstract void setCourseNumber(String courseNumber);
      public abstract double getCredits();
      public abstract void setCredits(double credits);

      public abstract String getCourseName();
      public abstract void setCourseName(String courseName);

}
