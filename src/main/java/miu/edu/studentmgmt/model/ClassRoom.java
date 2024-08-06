package miu.edu.studentmgmt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classrooms")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classRoomId;
    private String buildingName;
    private String roomNumber;

    @OneToMany(mappedBy = "classRoom")
    @JsonManagedReference
    private List<Student> students;
}
