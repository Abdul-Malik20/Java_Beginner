package org.company;

public class CompanyInfo {
    
    public void companyName() {
        System.out.println("Company name not provided.");
    }
    public void companyName(String name) {
        System.out.println("Company Name: " + name);
    }
    public void companyName(int id) {
        System.out.println("Company ID: " + id);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        CompanyInfo company = new CompanyInfo();
        
        company.companyName();
        company.companyName("XYZ Corp");
        company.companyName(123);
    }
}

