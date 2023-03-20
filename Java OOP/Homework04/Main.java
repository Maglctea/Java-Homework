import models.CustomArray;
import models.CustomArrayException;

public class Main {
    public static void main(String[] args) throws CustomArrayException {
        CustomArray<Integer> array = new CustomArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);
        array.add(5);

        System.out.println(array.getMin());
        System.out.println(array.size());
        array.selectSort();
        array.print();

    }

}
