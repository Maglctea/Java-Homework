public class Nipple extends ChildenGoods {


    public Nipple(String valueName, int valuePrice, int valueCount, String valueUnit, int minAgeValue, boolean hypoallergenicValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, minAgeValue, hypoallergenicValue);
    }

    public Nipple() {
        this(null, 0, 0, null, 0, true);
    }

    @Override
    public String toString() {
        return String.format("Соска %s", super.toString(), super.count);
    }
}
