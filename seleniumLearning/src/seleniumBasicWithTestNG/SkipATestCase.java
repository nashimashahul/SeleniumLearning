package seleniumBasicWithTestNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	@Test (priority=1)
    public void startEngine(){
        System.out.println("Engine started");
    }
	
	@Test (priority=2,enabled=false)
	public void playMusic(){
		System.out.println("Turn on music player");
	}
	
	@Test (priority=3)
    public void putFirstGear(){
        System.out.println("Car is in first Gear");
    }
	
	@Test (priority=4)
    public void putSecondGear(){
        System.out.println("Car is in second Gear");
    }
	
	@Test (priority=5)
    public void putThirdGear(){
        System.out.println("Car is in third Gear");
    }
}
