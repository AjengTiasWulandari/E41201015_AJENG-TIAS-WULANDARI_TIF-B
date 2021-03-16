/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @ajengtiaswulandari
 */
public class Person {
      String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public Person(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    Person(String fName, String lName, String stuStatus, int stuId) {
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getStuStatus() {
        return stuStatus;
    }
    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    } 
    
    public static void main(String[] args){
        String fName, IName, stuStatus;
        int stuId;
        
        fName = "Lisa Palombo";
        IName = "Lisa";
        stuStatus = "Active";
        stuId = 123456789;
        
        System.out.println("Student Name : " + fName);
        System.out.println("IName : " + IName);
        System.out.println("Student Status : " + stuStatus);
        System.out.println("Student ID : " + stuId);
    }
    }

