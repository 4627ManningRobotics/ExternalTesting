package org.usfirst.frc.team4627.robot.subsystems;

import org.usfirst.frc.team4627.robot.RobotMap;
import org.usfirst.frc.team4627.robot.commands.GTADrive;
import org.usfirst.frc.team4627.robot.commands.MotorRun;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Spark topRight = new Spark(RobotMap.RIGHT_TOP);
	Spark botRight = new Spark(RobotMap.RIGHT_BOTTOM);
	
	VictorSP topLeft = new VictorSP(RobotMap.LEFT_TOP);
	VictorSP botLeft = new VictorSP(RobotMap.LEFT_BOTTOM);

	


public void setLeftMotors(double speed) {
	
		topLeft.set(speed);
		botLeft.set(speed);
	
	
	
}

public void setRightMotors(double speed) {

		topRight.set(speed);
		botRight.set(-speed);
	
}


public void initDefaultCommand() {
    
	setDefaultCommand(new GTADrive());
	
	
}
}

