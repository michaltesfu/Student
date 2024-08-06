package miu.edu.studentmgmt.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.ClassRoom;
import miu.edu.studentmgmt.service.ClassRoomService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/classrooms")
@RequiredArgsConstructor
public class ClassRoomController {
    private final ClassRoomService classRoomService;

    @PostMapping
    public ClassRoom saveClassRoom(@RequestBody ClassRoom classRoom){
        return classRoomService.saveClassRoom(classRoom);

    }

}
