import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar car;

  @Before
  public void before() {
    car = new DodgemCar(10, 5);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, car.driveTime(10) );
  }

  @Test
  public void hasSeats() {
    assertEquals(5, car.noOfSeats() );
  }

}