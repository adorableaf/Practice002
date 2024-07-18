package af;

public class Truck extends Transport {

    public Truck(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void AutoDrift(float angle) {}
        //if (angle > 90)
        //    autodrift = true;
        //else
        //    autodrift = false;

}