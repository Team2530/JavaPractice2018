/*package src.org.usfirst.frc.team2530.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;

//**

//*
public class Solenoid extends Subsystem {
	private Solenoid Solenoid1;
    private Solenoid Solenoid2;
	
	public Solenoid(int port1, int port2) {
		Solenoid1 = new Solenoid(8, port1);
		Solenoid2 = new Solenoid(8, port2);
    }
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void extend() {
		Solenoid1.set(true);
		Solenoid2.set(false);
    }

    public void retract() {
    	Solenoid1.set(false);
    	Solenoid2.set(true);
    }
    
    public boolean getSol1() {
    	return Solenoid1.get(); //extended this returns true
    }
    
    public boolean getSol2() {
    	return Solenoid2.get();
    }
}

*/