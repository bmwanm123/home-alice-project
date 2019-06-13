package lesson1.lifegameself;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import com.sun.tools.classfile.StackMapTable_attribute.same_locals_1_stack_item_frame;

import junit.framework.TestCase;
import lesson1.lifegameself.Worldmap;;


@SuppressWarnings("unused")
public class WorldmapTest extends TestCase
{
	@SuppressWarnings("unused")
	private  static Worldmap worldmap;	
	private  CellStatus[][]  CellTest1;
	private  CellStatus[][] CellTest2;
	
	static enum CellStatus
	{
		Active,
		Dead;
	}
	
	@Before 
	public void setUp() throws Exception {            //此方法在执行每一个测试用例前使用
		super.setUp();
		worldmap=new Worldmap(40,50);
	
	}

	//此方法在执行每一个测试方法之后调用
    @Override
    protected void tearDown() throws Exception
    {
        // TODO Auto-generated method stub
        super.tearDown();
        System.out.println("tearDown()");
    }
	
	@Test
	public void testWorldmap() {                    
		
		
		CellTest1=new CellStatus[40][50];
		CellTest2=new CellStatus[40][50];
		
		for(int i=0;i<40;i++)
			for(int j=0;j<50;j++)
			{
				CellTest1[i][j]=CellStatus.Dead;
				CellTest2[i][j]=CellStatus.Dead;
				
			}
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testRun() {
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testPaintComponentGraphics() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPantacle() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHelp() {
		int z=worldmap.setHelp();
		assertEquals(0, z);
		assertEquals(CellStatus.Dead, worldmap.nextGeneration[5][6]);
		fail("Not yet implemented");
	}

}
