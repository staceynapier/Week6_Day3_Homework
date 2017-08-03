package driver_management;
import behaviours.*;

public class Driver{

  private String name;
  private Driveable ride;

  public Driver(String name, Driveable ride) {
    this.name = name;
    this.ride = ride;
  }

  public String name() {
    return name;
  }

  public Driveable ride() {
    return ride;
  }

  public int driveTime(int distance) {
    return this.ride.driveTime(distance);
  }

}