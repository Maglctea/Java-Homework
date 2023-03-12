public class Hygiene extends BaseProduct {
    int itemCount;

    public Hygiene(String valueName, int valuePrice, int valueCount, String valueUnit, int itemCountValue) {
        super(valueName, valuePrice, valueCount, valueUnit);
        itemCount = itemCountValue;
    }

    public Hygiene() {
        this(null, 0, 0, null, 1);
    }

    @Override
    public String toString() {
        return String.format("%s, с %d шт. внутри", super.toString(), this.itemCount);
    }

}
