package af;

public class JDM extends Transport {

    private boolean isCool;

    public JDM(String name, float speed, float angle) {
        super(name, speed, angle);
        setCool(true);
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
