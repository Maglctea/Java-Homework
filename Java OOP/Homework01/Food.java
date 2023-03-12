public class Food extends BaseProduct {
    String expirationDate;

    public Food(String valueName, int valuePrice, int valueCount, String valueUnit, String expirationDateValue) {        
        super(valueName, valuePrice, valueCount, valueUnit);
        expirationDate = expirationDateValue;
    }

    public Food() {
        this(null, 0, 0, null, null);
    }

    @Override
    public String toString() {
        return String.format("%s, со сроком годности до %s", super.toString(), this.expirationDate);
    }
}