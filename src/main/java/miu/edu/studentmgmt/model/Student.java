package miu.edu.studentmgmt.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false)
    @NotEmpty(message = " STUDENT NUMBER IS REQUIRED IT SHOULD NOT BE EMPTY OR NULL")
    @NotBlank(message = " STUDENT NUMBER IS REQUIRED IT SHOULD NOT BE EMPTY OR BLANK OR NULL")
    private String studentNumber;

    @Column(nullable = false)
    @NotEmpty(message = " STUDENT FIRSTNAME IS REQUIRED IT SHOULD NOT BE EMPTY OR NULL")
    @NotBlank(message = " STUDENT FIRSTNAME IS REQUIRED IT SHOULD NOT BE EMPTY OR BLANK OR NULL")
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @Column(nullable = false)
    @NotEmpty(message = " STUDENT LASTNAME IS REQUIRED IT SHOULD NOT BE EMPTY OR NULL")
    @NotBlank(message = " STUDENT LASTNAME IS REQUIRED IT SHOULD NOT BE EMPTY OR BLANK OR NULL")
    private String lastName;

    @Column(name = "cgpa")
    private Double cumulativeGpa;

    @Temporal(TemporalType.DATE)
    private LocalDate dateOfEnrollment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcript_Id")
    @JsonBackReference
    private Transcript transcript;

    @ManyToOne
    @JoinColumn(name = "classRoom_id")
    @JsonBackReference
    private ClassRoom classRoom;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "students_courses",
            joinColumns = @JoinColumn(name = "student_Id"),
            inverseJoinColumns = @JoinColumn(name = "course_Id",referencedColumnName = "courseId")
             )
    @JsonBackReference
    private List<Course> courses;

}
