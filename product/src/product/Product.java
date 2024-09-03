
package product;

public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;

    // Constructor
    public Product(int pid, String pname, float pprice, String paddDate, byte[] pimg) {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = paddDate;
        this.picture = pimg;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter and Setter for addDate
    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    // Getter and Setter for picture
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
