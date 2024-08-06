package miu.edu.studentmgmt.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.studentmgmt.model.Transcript;
import miu.edu.studentmgmt.service.TranscriptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/transcripts")
public class TranscriptController {
     private final TranscriptService transcriptService;

     @PostMapping
    public Transcript saveTranscript (@RequestBody Transcript transcript){
         return transcriptService.saveTranscript(transcript);
     }

}
