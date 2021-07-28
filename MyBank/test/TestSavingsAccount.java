import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.vcs.savings.SavingsAccount;

public class TestSavingsAccount 
{
	
	

	@Test
	public void testGetInfo()
	{
		assertFalse(SavingsAccount.getInfo().equals(""));
		
	}
	
	@Test
	public void testEmptyGetInfo()
	{
		assertTrue(SavingsAccount.getEmptyInfo().equals(""));
		
	}
	
}
