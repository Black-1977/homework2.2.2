package transport;

public class Bicycle extends Transport{

    public Bicycle(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    public Bicycle(String name) {
        super(name, 2);
    }

}
