public class Milk extends Drink {
    int fatContent;
    String expirationDate;

    public Milk(String valueName, int valuePrice, int valueCount, String valueUnit, int valueVolume, int fatContentValue, String expirationDateValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, valueVolume);
        fatContent = fatContentValue;
        expirationDate = expirationDateValue;
    }

    public Milk() {
        this(null, 0, 0, null, 0, 0, null);
    }

    @Override
    public String toString() {
        return String.format("Молоко %s, %d%% жирностью, до %s", super.toString(), this.fatContent, this.expirationDate);
    }
}
