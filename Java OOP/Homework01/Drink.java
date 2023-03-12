public class Drink extends BaseProduct {
    int volume;

    public Drink(String valueName, int valuePrice, int valueCount, String valueUnit, int volumeValue) {        
        super(valueName, valuePrice, valueCount, valueUnit);
        volume = volumeValue;
    }

    public Drink() {
        this(null, 0, 1, null, 100);
    }

    @Override
    public String toString() {
        return String.format("%s, с объемом %d %s", super.toString(), this.volume, super.unit);
    }
}

