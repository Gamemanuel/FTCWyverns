package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Library {

    double left1;
    double left2;
    double right1;
    double right2;

    public void end () {
        DcMotor frountleft = hardwareMap.get(DcMotor.class, "left1");
        DcMotor backleft = hardwareMap.get(DcMotor.class, "left2");
        DcMotor frountright = hardwareMap.get(DcMotor.class, "right1");
        DcMotor backright = hardwareMap.get(DcMotor.class, "right2");
        frountleft.setPower(left1);
        frountright.setPower(left2);
        backleft.setPower(right1);
        backright.setPower(right2);

    }
    //sets motor controllers
    public void spinleft ( double leftpower) {
        // turns the 2 individual motors into a motor group
        left1 = left1 + frountleft;
        left2 = left2 + backleft;
    }
    public void spinright ( double rightpower) {
        // turns the 2 individual motors into a motor group ( right side )
        right1 = right1 + frountright;
        right2 = right2 + backright;
    }    
    public void regulardrive ( double forward, double turn ) {
        spinleft(forward + turn);
        spinright(forward - turn);
    }





}