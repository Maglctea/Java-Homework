public class ToiletPaper extends Hygiene {
    int countLayers;

    public ToiletPaper(String valueName, int valuePrice, int valueCount, String valueUnit, int itemCountValue, int countLayersValue) {
        super(valueName, valuePrice, valueCount, valueUnit, itemCountValue);
        countLayers = itemCountValue;
    }

    public ToiletPaper() {
        this(null, 0, 0, null, 1, 1);
    }

    @Override
    public String toString() {
        return String.format("Туалетная бумага %s (%d слоя)", super.toString(), this.countLayers);
    }
}
