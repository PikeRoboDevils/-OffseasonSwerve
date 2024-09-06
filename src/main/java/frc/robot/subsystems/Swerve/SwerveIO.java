package frc.robot.subsystems.Swerve;

import java.io.File;

import org.littletonrobotics.junction.AutoLog;

import frc.robot.Constants;
import swervelib.SwerveController;
import swervelib.SwerveDrive;
import swervelib.parser.SwerveParser;
import swervelib.telemetry.SwerveDriveTelemetry;
import swervelib.telemetry.SwerveDriveTelemetry.TelemetryVerbosity;



/*
 * I cant really implement YAGSL and Advantagekit
 * YAGSL already logs things but replay dealing with swerve will be hard
 * there is a team that did it but it isnt really what i wanted
 * Team 2106 YAGSL Advantage kit
 * but this is the closest ill get by just adding autologs
 * much more useful for other simulations for when we design something. 
 */


public class SwerveIO {
        SwerveDrive swerveDrive;
        SwerveController controller;
        SWERVEVision vision;
    public SwerveIO(File directory) {
    // Configure the Telemetry before creating the SwerveDrive to avoid unnecessary objects being created.
    SwerveDriveTelemetry.verbosity = TelemetryVerbosity.HIGH;
    try
    {
      swerveDrive = new SwerveParser(directory).createSwerveDrive(Constants.MAX_SPEED);
      // Alternative method if you don't want to supply the conversion factor via JSON files.
      // swerveDrive = new SwerveParser(directory).createSwerveDrive(maximumSpeed, angleConversionFactor, driveConversionFactor);
    } catch (Exception e)
    {
      throw new RuntimeException(e);
    }

    controller = swerveDrive.getSwerveController();
  }
  
    }
    

