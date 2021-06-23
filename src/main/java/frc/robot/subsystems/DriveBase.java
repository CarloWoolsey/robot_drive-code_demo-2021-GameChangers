// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;




public class DriveBase extends SubsystemBase {

  public final WPI_TalonSRX leftFrontMotor = new WPI_TalonSRX(Constants.leftFrontMotorPort);
  public final WPI_TalonSRX leftBackMotor = new WPI_TalonSRX(Constants.leftBackMotorPort);
  public final WPI_TalonSRX rightFrontMotor = new WPI_TalonSRX(Constants.rightFrontMotorPort);
  public final WPI_TalonSRX rightBackMotor = new WPI_TalonSRX(Constants.rightFrontMotorPort);

  public final SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
  public final SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);

  public final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotors, rightMotors);




  /** Creates a new DriveBase. */
  public DriveBase() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double speed, double rotation){
    differentialDrive.arcadeDrive(speed,rotation);
  }






}
