public class Egg extends Food {
    int countEgg;

    public Egg(String valueName, int valuePrice, int valueCount, String valueUnit, String expirationDateValue, int countEggValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, expirationDateValue);
        countEgg = countEggValue;
    }

    public Egg() {
        this(null, 0, 0, null, null, 10);
    }

    @Override
    public String toString() {
        return String.format("Яйца %s (%d шт в упаковке)", super.toString(), this.countEgg);
    }
}
