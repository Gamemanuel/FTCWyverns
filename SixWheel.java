package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// adds to list of teleop programs
@TeleOp(name = "SixWheel", group = "driving")

// this is just for six wheel
public class SixWheel extends LinearOpMode {
    // makes it so i can access the the motors from different children classes
    DcMotor left1;
    DcMotor left2;
    DcMotor right1;
    DcMotor right2;
    @Override
    public void runOpMode() throws InterruptedException {
        // sets the different motors
        left1 = hardwareMap.get(DcMotor.class, "left1");
        left2 = hardwareMap.get(DcMotor.class, "left2");
        right1 = hardwareMap.get(DcMotor.class, "right1");
        right2 = hardwareMap.get(DcMotor.class, "right2");
        //waits for start
        waitForStart();
        while(opModeIsActive()) {
        //put all of the code in here
        //tank drive setting
            //spinleft(gamepad1.left_stick_y);
            // the power has to be between -1 and 1
            // this spins the 2 left motors for the same power
            //spinright(gamepad1.right_stick_y);
            // one joystick controls turning and going straight
            //straight and backwards
        // not tank drive
        //turning
            turn(gamepad1.left_stick_x);
        //forward
            wholedrivetrain(gamepad1.left_stick_y);
        }
    }
    //sets motor controllers
    public void spinleft ( double leftpower) {
        // turns the 2 individual motors into a motor group
        left1.setPower(leftpower);
        left2.setPower(leftpower);
    }
    public void spinright ( double rightpower) {
        // turns the 2 individual motors into a motor group ( right side )
        right1.setPower(rightpower);
        right2.setPower(rightpower);
    }
    public void turn ( double power ) {
        // the right has to be negative
        // for turning
        spinright(-power);
        spinleft(power);
    }
    public void wholedrivetrain ( double power) {
        //for going forward
        spinright(power);
        spinleft(power);
    }
}