package af;

public class JDM extends Transport {

    private boolean isCool;

    public JDM(String name, float speed, float angle) {
        super(name, speed, angle);
    }

    public JDM(String name, float speed, float angle, boolean isCool) {
        super(name, speed, angle);
        this.isCool = isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    public void getCool() {
        if (isCool) {
            System.out.println("\tCool car");
        } else {
            System.out.println("\tCringe car");
        }
    }
}
