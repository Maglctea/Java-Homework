package models;
public class Stork extends Bird{

    public Stork(int height, int weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    public Stork() {
    }

    public Stork CreateView() {
        super.CreateView();
        return this;
    }

    @Override
    void Say() {        
        System.out.println("Аоу, аоу");
    }
    
}
