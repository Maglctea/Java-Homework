public class MedicalMask extends Hygiene {

    public MedicalMask(String valueName, int valuePrice, int valueCount, String valueUnit, int itemCountValue) {
        super(valueName, valuePrice, valueCount, valueUnit, itemCountValue);
    }

    public MedicalMask() {
        this(null, 0, 0, null, 1);
    }

    @Override
    public String toString() {
        return String.format("Медицинские маски %s", super.toString());
    }
}
