package transport;

public abstract class Auto extends Transport {

    public Auto(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    public Auto(String name) {
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
