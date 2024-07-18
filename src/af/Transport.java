package af;

public class Transport {

    private String name;
    private float speed;
    private float angle;
    private float weight;

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
        return "\n\tНазвание автомобиля: " + name + "\n\tСкорость автомобиля: " + speed + "\n\tУгол дрифта: " + angle + "\n\tВес автомобиля: " + weight + "\n\t";

    }
}
