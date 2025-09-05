package com.cams.fundsnetcoreconnect.contoller;

import com.cams.fundsnetcoreconnect.api.UploadsApi;
import com.cams.fundsnetcoreconnect.api.model.Feed;
import com.cams.fundsnetcoreconnect.api.model.UploadsGetPreSignedUrlResponse;
import com.cams.fundsnetcoreconnect.service.UploadsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadsController implements UploadsApi {

    private final UploadsService service;

    public UploadsController(UploadsService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<UploadsGetPreSignedUrlResponse> getPreSignedUrl(Feed feed) {
        return ResponseEntity.ok(service.getPreSignedUrl(feed));
    }
}