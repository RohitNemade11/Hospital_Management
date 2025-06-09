//  Q2. in the Section : B

class Product {
    private int pid;
    private String pname;
    private int quantity;
    private double rate;

    
    public Product(int pid, String pname, int quantity, double rate) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.rate = rate;
    }

    // Gettter method  

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getRate() {
        return rate;
    }

    // Method to calculate total cost for the product
    public double getTotalCost() {
        return quantity * rate;
    }

    // print the in output 

    public String toString() {
        return "Product_ID: " + pid + ", Name: " + pname + ", Quantitty: " + quantity + ", Rate: " + rate;
    }
}


class Bill {

    // Method to calculate total bill using varargs
    public void generateBill(Product... products) {
        double totalWithoutGST = 0;

        System.out.println("\nProduct Details:");
        for (Product product : products) {
            System.out.println(product);
            totalWithoutGST += product.getTotalCost();
        }

        System.out.println("\nTotal Bill (Without GST): Rs. " + totalWithoutGST);

        double gst = totalWithoutGST * 0.18;
        double totalWithGST = totalWithoutGST + gst;

        System.out.println("Total Bill (With 18% GST): Rs. " + totalWithGST);
    }
}

public class BillApp {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product(1, "Laptop", 2, 50000);
        Product product2 = new Product(2, "Mouse", 5, 500);
        Product product3 = new Product(3, "Keyboard", 3, 1500);

        // Create Bill object  of the bill class 
        Bill bill = new Bill();

        // Generate bill with multiple products
        bill.generateBill(product1, product2, product3);
    }
}
