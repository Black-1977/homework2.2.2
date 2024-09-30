import transport.*;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Desna");
        Car car = new Car("BMW");
        Track track = new Track("MAN", 8);

        ServiceStation station  = new ServiceStation();

        station.service(bicycle);
        station.service(car);
        station.service(track);
    }
}
