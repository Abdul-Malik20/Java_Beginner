package org.univ;

public class College extends University {
    
    // Overriding the ug() method for College
    @Override
    public void ug() {
        System.out.println("Undergraduate education details (College level).");
    }
    
    // Overriding the pg() method for College
    @Override
    public void pg() {
        System.out.println("Postgraduate education details (College level).");
    }
    
    // Main method for testing
    public static void main(String[] args) {
        College college = new College();
        
        // Testing overridden versions of ug() and pg() methods
        college.ug(); // This will call the overridden method in College class
        college.pg(); // This will call the overridden method in College class
    }
}