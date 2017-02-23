package org.usfirst.frc.team4627.robot.subsystems;

import org.usfirst.frc.team4627.robot.Robot;
import org.usfirst.frc.team4627.robot.RobotMap;
import org.usfirst.frc.team4627.robot.commands.GTADrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class PIDDriveTrain extends PIDSubsystem {

	Spark topRight = new Spark(RobotMap.RIGHT_TOP);
	Spark botRight = new Spark(RobotMap.RIGHT_BOTTOM);
	
	VictorSP topLeft = new VictorSP(RobotMap.LEFT_TOP);
	VictorSP botLeft = new VictorSP(RobotMap.LEFT_BOTTOM);
	
	public double PIDOutput;
	
    // Initialize your subsystem here
    public PIDDriveTrain(double p, double i, double d) {
    	super(p,i,d);
    	this.getPIDController().setInputRange(0, 360);
    	this.getPIDController().setContinuous(true);
    	this.getPIDController().setOutputRange(-1, 1);
    	this.getPIDController().setAbsoluteTolerance(5);
    	this.getPIDController().setToleranceBuffer(10);
    	
    	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GTADrive());
    }
    
    public void setLeftMotors(double speed) {
    	
		topLeft.set(speed);
		botLeft.set(speed);
	}

public void setRightMotors(double speed) {

		topRight.set(speed);
		botRight.set(-speed);
	}

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return Robot.sensors.getFused();
    }

    protected void usePIDOutput(double output) {
    	PIDOutput=output;
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	
    	
    }
}
