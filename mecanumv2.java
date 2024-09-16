package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// adds to list of teleop programs
@TeleOp(name = "Mecanum", group = "driving")

    public class mecanumv2 extends LinearOpMode {
        Library library = new Library();
        @Override
        public void runOpMode() throws InterruptedException {
            //waits for start
            waitForStart();
            while(opModeIsActive()) {


            }
        }
    }
