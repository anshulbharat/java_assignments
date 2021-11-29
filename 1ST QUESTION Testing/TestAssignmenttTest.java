import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MiniMaxFinderTest {

	@Test
	void testMinMaxFind() {
		MiniMaxFinder m = new MiniMaxFinder();
		
		int expedted[] = new int[] {0,69};
		
		assertArrayEquals(expedted, m.arr(new int[] {56,34,7,0,54,3,34,34,69}));
	}

	@Test
	void testMinMaxFind1() {
		MiniMaxFinder m1 = new MiniMaxFinder();
		
		int expedted1[] = new int[] {1,991};
		
		assertArrayEquals(expedted1, m1.arr(new int[] {30,1,10,25,56,991,87,45,10}));
	}
	
	@Test
	void testMinMaxFind2() {
		MiniMaxFinder m2 = new MiniMaxFinder();
		
		int expedted2[] = new int[] {101,999};
		
		assertArrayEquals(expedted2, m2.arr(new int[] {999,101,205,665,777,854,465}));
	}
	
}