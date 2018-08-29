
public class Boots extends Product {

    private Integer size;
    private Boolean isNaturalSkin;

    public void boots(Integer size, Boolean isNaturalSkin, Integer id, String productName, String price, String weight, String colour, Integer productCount){
        super(id, productName, price, weight, colour, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public Integer getSize() {
        return size;
    }
    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }

}
