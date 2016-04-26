import org.junit.*;
import static org.junit.Assert.*;

public class LocationsTest {

  @Test
    public void Locations_instantiatesCorrectly_true() {
      Locations myLocations = new Locations("PDX");
      assertEquals(true, myLocations instanceof Locations);
    }

  
}
