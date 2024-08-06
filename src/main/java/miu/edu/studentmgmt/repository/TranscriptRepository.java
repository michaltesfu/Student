package miu.edu.studentmgmt.repository;

import miu.edu.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TranscriptRepository extends JpaRepository<Transcript,Long>{


}
