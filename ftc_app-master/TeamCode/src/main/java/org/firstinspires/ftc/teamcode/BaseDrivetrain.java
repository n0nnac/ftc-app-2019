package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Cannon Johns on 9/11/2018.
 */

public class BaseDrivetrain {
    BaseBot robot = new BaseBot();
    private DcMotor left = robot.leftDrive;
    private DcMotor right = robot.rightDrive;
    public BaseDrivetrain(){

    }
    public void drive(double x, double y)
    {
        double drive = x;
        double turn  = y;
        left.setPower(Range.clip(drive + turn, -1.0, 1.0));
        left.setPower(Range.clip(drive - turn, -1.0, 1.0));
    }
    public void forward(double power)
    {
        left.setPower(power);
        right.setPower(power);
    }
    public void turn(double power)
    {
        left.setPower(power);
        right.setPower(-power);
    }
}
