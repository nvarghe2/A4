import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementTestStudent {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	
	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
		p2 = new Property ("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
		p3 = new Property ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
		
		m= new ManagementCompany("Railey", "555555555",6);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception {
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}
			
	@Test
	public void testGetMAX_PROPERTY() {
		assertEquals(m.getMAX_PROPERTY(),5);
	}

	@Test
	public void testAddProperty() {
		p4 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		p5 = new Property ("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2);
		p6 = new Property ("Too Many Properties", "Lakepointe", 1000, "Joey BagODonuts",6,5,2,2);	
	}

	
	

}
