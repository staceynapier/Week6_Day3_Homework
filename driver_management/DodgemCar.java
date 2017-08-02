package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  private int averageSpeed;
  private int noOfSeats;

  public DodgemCar(int averageSpeed, int noOfSeats) {
    this.averageSpeed = averageSpeed;
    this.noOfSeats = noOfSeats;
  }

  public int driveTime(int distance ) {
    return distance/this.averageSpeed;
  }

  public int noOfSeats() {
    return noOfSeats;
  }

}