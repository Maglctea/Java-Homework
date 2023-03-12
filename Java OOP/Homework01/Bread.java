public class Bread extends Food {
    String flourType;

    public Bread(String valueName, int valuePrice, int valueCount, String valueUnit, String expirationDateValue, String flourTypeValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, expirationDateValue);
        flourType = flourTypeValue;
        expirationDate = expirationDateValue;
    }

    public Bread() {
        this(null, 0, 0, null, null, null);
    }

    @Override
    public String toString() {
        return String.format("Хлеб %s (%s мука)", super.toString(), this.flourType);
    }
}
