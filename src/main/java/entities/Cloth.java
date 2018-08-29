

public class Cloth extends Product {

    private String size;
    private String material;

    public void boots (String size, String material, Integer id, String productName, String price, String weight, String colour, Integer productCount){
        super(id, productName, price, weight, colour, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
