package org.usfirst.frc4915.MecanumDrive.commands.elevator;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4915.MecanumDrive.Robot;

public class ElevatorIsBelowPositionNumberCommand extends Command {

    private double posNumber;

    public ElevatorIsBelowPositionNumberCommand(double posNumber) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.posNumber = posNumber;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("Elevator Position Inches = " + Robot.elevator.getPositionInches());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.elevator.getPositionInches() <= posNumber;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
