package org.usfirst.frc.team4627.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	

		
			//Robot Axis'
			public static final int AXIS_RIGHT_TRIGGER = 3;
			public static final int AXIS_LEFT_TRIGGER = 2;
			public static final int AXIS_LEFT_STICK_X = 0;
			public static final int AXIS_LEFT_STICK_Y = 1;
			public static final int AXIS_RIGHT_STICK_X = 4;
			public static final int AXIS_RIGHT_STICK_Y = 5;
			
			//Robot Buttons
			public static final int BUTTON_A = 1;
			public static final int BUTTON_B = 2;
			public static final int BUTTON_X = 3;
			public static final int BUTTON_Y = 4;
			public static final int BUTTON_LEFT_BUMPER = 5;
			public static final int BUTTON_RIGHT_BUMPER = 6;
			public static final int BUTTON_BACK = 7;
			public static final int BUTTON_START = 8;
			public static final int BUTTON_LEFT_CLICK = 9;
			public static final int BUTTON_RIGHT_CLICK = 10;
			
			//Robot Controllers
			public static final int CONTROLLER_DRIVER = 0;
			public static final int CONTROLLER_OPERATOR = 1;
			public static final int CONTROLLER_OPERATOR_2 = 2;
			
			//Motor Controllers
		
			public static final int MOTOR_CLIMBING = 4;
			public static final int MOTOR_INTAKE = 7;
			public static final int MOTOR_SHOOTER = 6;
			public static final int MOTOR_OUT_TAKE = 1;
					
			public static final double ROBOT_MAX_SPEED = 0.98;
			public static final double ROBOT_MIN_SPEED = -0.98;
			public static final double ROBOT_MAX_CLIMB_SPEED = 0.98;
			public static final double ROBOT_MIN_CLIMB_SPEED = -0.98;
			public static final double AUTO_TARGET_SPIN_SPEED = 0.5;
			
			public static final int CAMERA_1 = 0;
			public static final int CAMERA_2 = 1;
	

	
	public static final int RIGHT_TOP = 1;
	public static final int RIGHT_BOTTOM = 2;
	public static final int LEFT_TOP = 3;
	public static final int LEFT_BOTTOM = 4;
	public static final double RUN_SPEED = 0;
}
