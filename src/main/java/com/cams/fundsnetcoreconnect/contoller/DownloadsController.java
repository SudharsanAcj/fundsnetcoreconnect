package com.cams.fundsnetcoreconnect.contoller;

import com.cams.fundsnetcoreconnect.api.DownloadsApi;
import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.service.DownloadsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadsController implements DownloadsApi {

    private final DownloadsService service;

    public DownloadsController(DownloadsService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<DownloadsDownloadFileAgainResponse> downloadFileAgain(String fileReferenceId) {
        return ResponseEntity.ok(service.downloadFileAgain(fileReferenceId));
    }

    @Override
    public ResponseEntity<DownloadsListDownloadsResponse> listDownloads(Integer page, Integer limit) {
        return ResponseEntity.ok(service.listDownloads(page, limit));
    }

    @Override
    public ResponseEntity<DownloadsViewDownloadDetailsResponse> viewDownloadDetails(String fileReferenceId) {
        return ResponseEntity.ok(service.viewDownloadDetails(fileReferenceId));
    }
    @GetMapping("/v1/downloads/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Downloads API is running!");
    }
}