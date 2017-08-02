package driver_management;
import behaviours.*;

public class QuadBike implements Driveable {

  private int averageSpeed;

  public QuadBike(int averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

}