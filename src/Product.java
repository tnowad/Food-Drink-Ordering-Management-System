import java.util.Date;

public class Product {
    private int id;
    private String name;
    private int price;
    private String manufacturer;
    private Date MFG;
    private Date EXP;
    public Product() {
    }
    public Product(int id, String name, int price, String manufacturer, Date mFG, Date eXP) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        MFG = mFG;
        EXP = eXP;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Date getMFG() {
        return MFG;
    }
    public void setMFG(Date mFG) {
        MFG = mFG;
    }
    public Date getEXP() {
        return EXP;
    }
    public void setEXP(Date eXP) {
        EXP = eXP;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + ", MFG="
                + MFG + ", EXP=" + EXP + "]";
    }
    
}
