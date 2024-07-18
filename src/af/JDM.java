package af;

public class JDM extends Transport {

    private boolean isCool;
    public Tires tires = new Tires();

    public JDM(String name, float speed, float angle) {
        super(name, speed, angle);
        setCool(true);
    }

    @Override
    public void AutoDrift(float angle) {
        if (angle > 90)
            System.out.println("Автодрифт включен");
        else
            System.out.println("Автодрифт выключен");
    }



    public JDM(String name, float speed, float angle, boolean isCool) {
        super(name, speed, angle);
        this.isCool = isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    @Override
    public String getValues() {
        return "\n\tНазвание автомобиля: " + name + "\n\tСкорость автомобиля: " + speed + "\n\tУгол дрифта: " + angle + "\n\t";
    }

    public void getCool() {
        if (isCool) {
            System.out.print("\tCool car");
        } else {
            System.out.print("\tCringe car");
        }
    }
}
