package E1;

public class Airport {

    public class AirPlane {

        public void fly() {
            System.out.println("Fly");
        }

    }

    public AirPlane getAirPlane() {
        return new AirPlane();
    }

}
