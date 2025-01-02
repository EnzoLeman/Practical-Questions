package InvoiceHardware;

public class Invoice {
    // instance Variables
    String part_no,part_desc;
    int quanty;
    Double price_Per_item;

    // Setter&Getter Methods
    public String getPart_no() {
        return part_no;
    }

    public void setPart_no(String part_no) {
        this.part_no = part_no;
    }

    public String getPart_desc() {
        return part_desc;
    }

    public void setPart_desc(String part_desc) {
        this.part_desc = part_desc;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public Double getPrice_Per_item() {
        return price_Per_item;
    }

    public void setPrice_Per_item(Double price_Per_item) {
        this.price_Per_item = price_Per_item;
    }

    // Constructor
    public Invoice(String no, String desc, int qty, Double price)
    {
        this.part_no = no;
        this.part_desc = desc;
        this.quanty = qty;
        this.price_Per_item = price;
    }

    // invoiceAmount Method
    public void getInvoiceAmount(int quanty, Double price_Per_item)
    {   
        Double amount;

        if (quanty<0) {
            quanty = 0;
        } 
        else if (price_Per_item<0) 
        {
            price_Per_item = 0.0;
        }
        
        amount = quanty*price_Per_item;
        System.out.println("The amount of "+part_desc+" sold: "+amount);
    }
}
