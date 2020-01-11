import E1.Airport;
import E2.BusStand;
import E3.TrainStation;

public class App {

    public static void main(String[] args) {

        Airport airport = new Airport();
        Airport.AirPlane airPlane = airport.getAirPlane();
        airPlane.fly();

        BusStand busStand = new BusStand();
        busStand.drivrBus();

        TrainStation trainStation = new TrainStation();
        trainStation.driveTrain();

    }

}
