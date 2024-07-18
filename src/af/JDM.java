package af;

public class JDM {

    public String vehicle_name;
    public float vehicle_speed;
    public float drift_angle;
    public int vehicle_age;
    public float vehicle_weight;

    public void setValues(String name, float speed, float angle, int age, float weight){
        vehicle_name = name;
        vehicle_speed = speed;
        drift_angle = angle;
        vehicle_age = age;
        vehicle_weight = weight;
    }
    public String getValues() {
        System.out.println("\n Название автомобиля: " + vehicle_name + "\n Скорость автомобиля: " + vehicle_speed + "\n Угол дрифта: " + drift_angle + "\n Год выпуска: " + vehicle_age + "\n Вес автомобиля: " + vehicle_weight + "\n");
        return null;
    }
}
