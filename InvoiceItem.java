public class InvoiceItem {
    String id;
    String desc;
    int quantity;
    double unitPrice;

    public InvoiceItem (String id, String desc, int quantity, int unitPrice){
       this.id = id;
       this.desc = desc;
       this.quantity = quantity;
       this.unitPrice = unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setId(String newid){
        this.id = newid;
    }
    public void setDesc(String newdesc){
        this.desc = newdesc;
    }
    public void setQuantity(int newquantity){
        this.quantity = newquantity;
    }
    public void setUnitPrice(int newUnitPrice){
        this.unitPrice = newUnitPrice;
    }

    public double findTotal(){
        return quantity*unitPrice;
    }
    @Override
    public String toString(){
        return "The id =" + id +  "\n" +
        "The desc = " + desc + "\n" +
        "The quantity = " + quantity +"\n" +
        "The unitPrice = " + unitPrice + "\n" + 
        "The TotalPrice = " + findTotal() +"\n";
    }
    }


