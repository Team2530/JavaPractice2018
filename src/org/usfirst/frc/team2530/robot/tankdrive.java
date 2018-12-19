package adoptedChild;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.GenericHID;


public class tankdrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			VictorSP m_frontLeft = new VictorSP(1);
			VictorSP m_rearLeft = new VictorSP(2);
			SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

			VictorSP m_frontRight = new VictorSP(3);
			VictorSP m_rearRight = new VictorSP(4);
			SpeedControllerGroup m_Right = new SpeedControllerGroup(m_frontRight, m_rearRight);
			DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
	
	
				//Object construction
			public void teleopInit() {}
								
				public void teleopPeriodic() {
					GenericHID rightStick;
					GenericHID leftStick;
					drive myDrive; 
					//dont know if I should put this here. if deleted then the next line has error (myDrive.tankDrive)
					//same thing with m_right above (line24) except I didn't add the library pointer thingamagig.
					myDrive.tankDrive(leftStick.getY(), rightStick.getY());    

			}

	}


