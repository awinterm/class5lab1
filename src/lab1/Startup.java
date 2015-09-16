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
        
        CollegeClass class2 = new AdvancedJavaCourse("myclass", "thisclass");
        CollegeClass class4 = new IntroToProgrammingCourse("this", "class");
        
        
        
        class2.setCourseName("Advanced Java With Jim Lombardo");
        System.out.println(class2.getCourseName());
        class2.setCredits(4);
        System.out.println(class2.getCredits());
        class2.setCourseNumber("8675309");
        System.out.println(class2.getCourseNumber());
        
        
        AdvancedCollegeClass class1 = new AdvancedJavaCourse( "thisisclass1", "forsurethisisclass1");
        class1.setCredits(4);
        class1.setPrerequisites("hmmmmm");
        System.out.println(class1.getPrerequisites());
        System.out.println(class1.getCourseName());
        System.out.println(class1.getCourseNumber());
        System.out.println(class1.getCredits());
        System.out.println(class1.getPrerequisites());
    }
    
}
