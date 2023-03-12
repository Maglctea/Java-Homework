public class ChildenGoods extends BaseProduct {
    int minAge;
    boolean hypoallergenic;

    public ChildenGoods(String valueName, int valuePrice, int valueCount, String valueUnit, int minAgeValue,boolean hypoallergenicValue) {        
        super(valueName, valuePrice, valueCount, valueUnit);
        minAge = minAgeValue;
        hypoallergenic = hypoallergenicValue;
    }

    public ChildenGoods() {
        this(null, 0, 0, null, 0, false);
    }

    @Override
    public String toString() {
        return String.format("%s, для детей от %d лет. (Гипоаллергенно=%b)", super.toString(), this.minAge, this.hypoallergenic);
    }
}
