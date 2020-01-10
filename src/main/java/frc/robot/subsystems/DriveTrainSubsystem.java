/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;

public class DriveTrainSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  public Talon LeftTalon = new Talon(Constants.LEFT_TALON_PIN);
  public Talon RightTalon = new Talon(Constants.RIGHT_TALON_PIN);

  public DifferentialDrive m_drive = new DifferentialDrive(LeftTalon, RightTalon);

  public DriveTrainSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void TankDrive(double l_speed, double r_speed)
  {
    m_drive.tankDrive(l_speed, r_speed);
  }
}
