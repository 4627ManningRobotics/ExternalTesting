package org.usfirst.frc.team4627.robot.commands;

import org.usfirst.frc.team4627.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnToAngle extends Command {

	double initialAngle;
	double desiredAngle;
	double relativeAngle;
	
	public TurnToAngle(double angle) {
        // requires driveTrain
    	requires(Robot.driveTrain);
    	desiredAngle = angle;
    	
    	
    }
   
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Angle is turning");
        Robot.sensors.preAngle = (int)Robot.sensors.getAngle();
        relativeAngle = (desiredAngle + Robot.sensors.preAngle);
        initialAngle = Robot.sensors.getRawAngle();
    	System.out.println("Initial Angle: " + initialAngle);
       	System.out.println("Pre Angle: " + Robot.sensors.preAngle);
       	System.out.println("Relative Angle: " + relativeAngle);
        	// Sets the direction of the robot
       		
       		if(desiredAngle > 0){
        	 Robot.driveTrain.setLeftMotors(0.4);
        	 Robot.driveTrain.setRightMotors(-0.4);
       		} else if(desiredAngle < 0) {
       			Robot.driveTrain.setLeftMotors(-0.4);
       			Robot.driveTrain.setRightMotors(0.4);
            }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
   		
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//System.out.println(Robot.sensors.getRawAngle());
    	
    	if (Math.abs(Robot.sensors.getRawAngle() - initialAngle) >= Math.abs(desiredAngle)) {
    		System.out.println("Finished Ang: " + Robot.sensors.getRawAngle() + "\n\n\n");
    		return true;
    	} else {
    		
    		return false;
    		
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.setRightMotors(0);
    	Robot.driveTrain.setLeftMotors(0);
    
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}