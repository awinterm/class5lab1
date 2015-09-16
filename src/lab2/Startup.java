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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CollegeClass class1 = new AdvancedJavaCourse("Advanced Java", "00000003");
        CollegeClass class2 = new IntroToProgrammingCourse("Intro to Programming", "0000002");
        CollegeClass class3 = new IntroJavaCourse("Intro to Java", "00000001");
        
        class1.setCredits(4);
        class2.setCredits(3);
        class3.setCredits(3);
        
        System.out.println(class1.getCourseName() + " " + class1.getCourseNumber());
        System.out.println("Credits: " + class1.getCredits());
        System.out.println(" ");
        System.out.println(class2.getCourseName() + " " + class2.getCourseNumber());
        System.out.println("Credits: " + class2.getCredits());
        System.out.println(" ");
        System.out.println(class3.getCourseName() + " " + class3.getCourseNumber());
        System.out.println("Credits: " + class3.getCredits());
        System.out.println(" ");
        
        
        // Ok so this is weird, Once again I am seeing the issues of when you can
        // and cannot use the Liskov Substitution principle. When you create an
        // abstract object of a class I don't think you should be able to call methods
        // not common to the abstraction you are calling. Netbeans is agreeing with me 
        // and putting red under these methods. However at run time it works...
        // I assume this has to do with the common naming conventions between the two programs
        // and something here is messed up. I will have to make sure to ask Jim about this.

        // Also I noticed that the abstract class version was able to access the name and number 
        // Varibles that are stored at the subclass level and their getters and setters. 
        // However the interface version seems only able to access the methods of 
        // the particular interface called.  
        
        // It is to your advantage to use Liskov Substitution principle when you are only 
        // dealing with what makes them common. 
        
        // The interface route is more free at the subclass level. These methods can do what 
        // They do the way it makes sense at that level. Which is more open to change. 
        // The Abstract class route demanded more univeriality in the ways things
        // were done but in the end was less open to change without overriding. 
        
        
        AdvancedCollegeClass class4 = new AdvancedJavaCourse( "Advanced Java", "001001001");
        AdvancedCollegeClass class5 = new IntroJavaCourse("Intro to Java", "0000002");
        
        class4.setPrerequisites("Intro to Java");
        class5.setPrerequisites("Intro to Programming");
        class4.setCredits(4);
        class5.setCredits(3);
        
        System.out.println(class4.getCourseName() + " " + class4.getCourseNumber());
        System.out.println("Credits: " + class4.getCredits());
        System.out.println("Prerequisites: " + class4.getPrerequisites());
        System.out.println(" ");
        System.out.println(class5.getCourseName() + " " + class5.getCourseNumber());
        System.out.println("Credits: " + class5.getCredits());
        System.out.println("Prerequisites: " + class5.getPrerequisites());
    
}
}