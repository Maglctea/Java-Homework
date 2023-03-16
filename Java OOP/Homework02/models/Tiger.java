package models;
public class Tiger extends WildAnimal {

    public Tiger(int height, int weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
    }

    public Tiger() {        
    }

    public Tiger CreateView() {
        super.CreateView();
        return this;
    }

    @Override
    void Say() {
        System.out.println("Рррррррррр");
    }        
}
