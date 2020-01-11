package E3;

public class TrainStation {

    public void driveTrain(){

        new Object(){

            public void drive(){
                System.out.println("Drive");
            }

        }.drive();

    }

}
