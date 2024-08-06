package miu.edu.studentmgmt.service;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Transcript;
import miu.edu.studentmgmt.repository.TranscriptRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TranscriptServiceImpl implements TranscriptService{

    private final TranscriptRepository transcriptRepository;

    @Override
    public Transcript saveTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}
