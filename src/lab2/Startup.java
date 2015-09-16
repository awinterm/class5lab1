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
        
          CollegeClass class2 = new AdvancedJavaCourse("myclass", "thisclass");
        
        class2.setCourseName("Advanced Java With Jim Lombardo");
        class2.getCourseName();
        class2.setCredits(4);
        class2.getCredits();
        class2.setCourseNumber("8675309");
        class2.getCourseNumber();
    
}
}