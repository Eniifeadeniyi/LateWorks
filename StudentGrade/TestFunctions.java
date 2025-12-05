import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctions {
	
	@Test
	public void testToFail() {
		int actual = Functions.sum(new double[] {5.0.6.0});
		assertEquals(actual,11.0);
	}
}