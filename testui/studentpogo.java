//10) WAP to create the pojo class name as Student class with a following methods and data or variable/state

import java.util.*;

class Student {
    private int id;
    private String name;
    private float per;
    private int totalFees;
    private int disFees;
    private int actualPaidFees;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name; 
    }

    public void setPer(float per) {
        this.per = per;
    }

    public float getPer() {
        return per; 
    }

    public void setTotalFees(int totalFees) {
        this.totalFees = totalFees;
    }

    public int getTotalFees() {
        return totalFees; 
    }

    public void setDisFees(int disFees) {
        this.disFees = disFees;
    }

    public int getDisFees() {
        return disFees; 
    }

    public void setActualPaidFees(int actualPaidFees) {
        this.actualPaidFees = actualPaidFees;
    }

    public int getActualPaidFees() {
        return actualPaidFees; 
    }
}

class DiscountFees {
    private Student student; 

    public void setStudent(Student student) {
        this.student = student;
    }

    public void checkDiscountEligibility() {
        if (student.getPer() > 60) {
            int discount = (int) (student.getTotalFees() * 30/100);
            student.setDisFees(discount);
            student.setActualPaidFees(student.getTotalFees() - discount);
        }
        // float Per;
        // Scanner xyz=new Scanner(System.in);
        // Per=xyz.nextFloat(); 
        // if(Per>60)
        // {
        //     int discount=(int)(student.getTotalFees() *30/100);
        //     System.out.println(discount);
        //     student.setActualPaidFees(student.getTotalFees() - discount);
        // }

    }

    public void show() {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Percentage: " + student.getPer());
        System.out.println("Total Fees: " + student.getTotalFees());
        System.out.println("Discounted Fees: " + student.getDisFees());
        System.out.println("Actual Paid Fees: " + student.getActualPaidFees());
    }
}

public class studentpogo {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setId(1);
        student.setName("ram");
        student.setPer(70);
        student.setTotalFees(20000);

        
        DiscountFees discountFees = new DiscountFees();
        discountFees.setStudent(student);
        discountFees.checkDiscountEligibility();
        discountFees.show();   
    }
}
