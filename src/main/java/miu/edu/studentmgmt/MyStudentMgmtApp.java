package miu.edu.studentmgmt;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.ClassRoom;
import miu.edu.studentmgmt.model.Student;
import miu.edu.studentmgmt.model.Transcript;
import miu.edu.studentmgmt.service.ClassRoomService;
import miu.edu.studentmgmt.service.StudentService;
import miu.edu.studentmgmt.service.TranscriptService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class MyStudentMgmtApp {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp.class, args);

    }

}
