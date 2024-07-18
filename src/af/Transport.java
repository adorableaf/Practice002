package af;

public abstract class Transport {

    protected String name;
    protected float speed;
    public float angle;
    protected float weight;

    public Transport(String name, float speed, float angle) {
        setValues(name, speed, angle, weight);
    }

    public Transport(String name, int weight) {
        this.name = name;
        this.weight = weight;
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

    public abstract void AutoDrift(float angle);

    class Tires {

        private boolean isWornOut;
        private int km;

        public void setWornOut(boolean isWornOut, int km) {

            this.isWornOut = isWornOut;
            this.km = km;
        }

        public void isWornOut(boolean isWornOut) {
            this.isWornOut = isWornOut;
        }

        public void info() {
            if (!isWornOut)
                System.out.println("\n\tШины в пригодном состоянии");
            else
                System.out.println("\n\tШины изношены. Износ: " + km + " км");
        }

    }
}
