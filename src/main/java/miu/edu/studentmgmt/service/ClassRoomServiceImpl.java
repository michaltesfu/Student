package miu.edu.studentmgmt.service;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.ClassRoom;
import miu.edu.studentmgmt.repository.ClassRoomRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassRoomServiceImpl implements ClassRoomService{
    private final ClassRoomRepository classRoomRepository;

    @Override
    public ClassRoom saveClassRoom(ClassRoom classRoom) {
        return classRoomRepository.save(classRoom);
    }
}
