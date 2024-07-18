package af;

public class Transport {

    protected String name;
    protected float speed;
    protected float angle;
    protected float weight;

    public Transport(String name, float speed, float angle) {
        setValues(name, speed, angle, weight);
    }

    public Transport(String name, int weight) {
        setValues(name, speed, angle, weight);
    }

    public void setValues(String name, float speed, float angle, float weight){
        this.name = name;
        this.speed = speed;
        this.angle = angle;
        this.weight = weight;
    }
    public String getValues() {
        return "\n\tНазвание автомобиля: " + name + "\n\tВес автомобиля: " + weight + "\n\t";

    }
}
