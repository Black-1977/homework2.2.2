package transport;

public class Track extends Auto {

    public Track(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    public Track(String name) {
        super(name, 6);

    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
