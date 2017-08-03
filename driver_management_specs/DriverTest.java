import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;

public class DriverTest {

  Driver driver;
  Driveable quadbike;

  @Before
  public void before() {
    driver = new Driver("Sam", quadbike);
  }

  @Test
  public void hasName() {
    assertEquals("Sam", driver.name() );
  }

  @Test
  public void hasRide() {
    assertEquals(quadbike, driver.ride() );
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, driver.driveTime(10) );
  }
}