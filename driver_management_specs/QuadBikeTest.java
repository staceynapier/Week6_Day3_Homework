import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before() {
    quadbike = new QuadBike(20, 25);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, quadbike.driveTime(20) );
  }

  @Test
  public void hasEngineCapacity() {
    assertEquals(25, quadbike.engineCapacity());
  }

}