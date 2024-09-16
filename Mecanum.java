package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// adds to list of teleop programs
@TeleOp(name = "Mecanum", group = "driving")

    // just for mecanum
    public class Mecanum extends LinearOpMode {
        // makes it so i can access the the motors from different children classes
        DcMotor left1;
        DcMotor left2;
        DcMotor right1;
        DcMotor right2;
        public Webcamname;
        

        @Override
        public void runOpMode() throws InterruptedException {
            //Main main = new Main();
            //main.strafeleft
            // sets the different motors
            left1 = hardwareMap.get(DcMotor.class, "left1");
            left2 = hardwareMap.get(DcMotor.class, "left2");
            right1 = hardwareMap.get(DcMotor.class, "right1");
            right2 = hardwareMap.get(DcMotor.class, "right2");
            Webcamname = hardwareMap.get(Webcamname.class, "Webcam 1")
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
                //turn(gamepad1.right_stick_x);
                //forward
                wholedrivetrain(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
                //strafeing
                //strafe(gamepad1.left_stick_x);
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
        public void wholedrivetrain ( double x, double y, double turn) {
            //for going forward
            // spinright(power + turn);
            // spinleft(power - turn);

            
            left1.setPower(y + x + turn);
            left2.setPower(y - x + turn);
            right1.setPower(y - x - turn);
            right2.setPower(y + x - turn );
        }
        public void strafe ( double power ) {
            // for mecanum straifing
            left1.setPower(power);
            left2.setPower(-power);
            right1.setPower(-power);
            right2.setPower(power);
        }

    }

