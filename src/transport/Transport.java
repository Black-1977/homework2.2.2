package transport;

public abstract class Transport implements Serviceable {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String name, int wheelsCount) {
        this.modelName = name;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
