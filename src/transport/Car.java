package transport;

public class Car extends Transport {

    public Car(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    public Car(String name) {
        super(name, 4);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
