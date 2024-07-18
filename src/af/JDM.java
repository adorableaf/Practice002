package af;

public class JDM {

    private String name;
    private float speed;
    private float angle;
    private int age;
    private float weight;
    private String desc;

    public JDM(String name, float speed, float angle, int age, float weight) {
        setValues(name, speed, angle, age, weight, desc);
    }

    public JDM(String name, float speed, float angle, int age, float weight, String desc) {
        setValues(name, speed, angle, age, weight, desc);
    }

    public void setValues(String name, float speed, float angle, int age, float weight, String desc){
        this.name = name;
        this.speed = speed;
        this.angle = angle;
        this.age = age;
        this.weight = weight;
        this.desc = desc;
    }
    public String getValues() {
        return "\n Название автомобиля: " + name + "\n Скорость автомобиля: " + speed + "\n Угол дрифта: " + angle + "\n Год выпуска: " + age + "\n Вес автомобиля: " + weight + "\n";

    }
}
