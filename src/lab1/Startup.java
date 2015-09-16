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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // I have noticed that when using the abstract class to create an instance of
        // a subclass you only get access to the common methods of that abstract class.
        // The way I did this assignment I used two superclasses CollegeClass and AdvancedCollegeClass
        
        // I thought I was being so smart letting the course that needed prerequisites inherit from this 
        // abstract class.  Turns out I can't access the get set prerequisites methods unless
        // I create an advancedCollegeClass object.  Makes sense.  But That means
        // the Liskov Substitution principle can only be used when you only want to deal with the 
        // Common methods or properties of a class. If you want to use things only in the subclass you 
        // cannot use this principle.  
        
        // As far as the differences between abstract class as a super vs interface. 
        // Interfaces seem to lend it self to the 3 rules for quality code more so than abstract classes. 
        // However it does depend on the system. Abstract classes inheritance can limit freedom 
        // in the subclasses. This could be useful to limit how a subclass can be written.
        
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
