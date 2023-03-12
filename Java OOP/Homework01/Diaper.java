public class Diaper extends ChildenGoods {
    int size;
    int minWeight;
    int maxWeight;
    String type;

    public Diaper(String valueName, int valuePrice, int valueCount, String valueUnit, int minAgeValue, boolean hypoallergenicValue, 
                int sizeValue, int minWeightValue, int maxWeightValue, String typeValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, minAgeValue, hypoallergenicValue);
        size = sizeValue;
        minWeight = minWeightValue;
        maxWeight = maxWeightValue;
        type = typeValue;
    }

    public Diaper() {
        this(null, 0, 0, null, 0, true, 100, 500, 600, "обычные");
    }

    @Override
    public String toString() {
        return String.format("Подгузники %s %s", this.type, super.toString());
    }
}
