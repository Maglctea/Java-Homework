public class Lemonade extends Drink {

    public Lemonade(String valueName, int valuePrice, int valueCount, String valueUnit, int volumeValue) {        
        super(valueName, valuePrice, valueCount, valueUnit, volumeValue);
    }

    public Lemonade() {
        this(null, 0, 0, null, 0);
    }

    @Override
    public String toString() {
        return String.format("Лимонад %s", super.toString());
    }
}
