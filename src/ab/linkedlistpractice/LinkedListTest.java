package ab.linkedlistpractice;


import org.junit.Assert;
import org.junit.Test;


public class LinkedListTest {
	
	@Test
	public void testSize_initialList() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0,list.getSize());
	}

}
