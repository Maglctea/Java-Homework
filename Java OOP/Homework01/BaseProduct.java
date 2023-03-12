public class BaseProduct {
    String name;
    int price;
    int count;
    String unit;

    public BaseProduct(String valueName, int valuePrice, int valueCount, String valueUnit) {
        name = valueName;
        price = valuePrice;
        count = valueCount;
        unit = valueUnit;
    }

    public BaseProduct() {
        this(null, 0, 0, null);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" %d %s за %d у.е.", name, count, unit, price);
    }
}
