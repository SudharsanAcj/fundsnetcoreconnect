package com.cams.fundsnetcoreconnect.serviceimpl;

import com.cams.fundsnetcoreconnect.api.model.Feed;
import com.cams.fundsnetcoreconnect.api.model.PreSignedUrl;
import com.cams.fundsnetcoreconnect.api.model.PreSignedUrlData;
import com.cams.fundsnetcoreconnect.api.model.UploadsGetPreSignedUrlResponse;
import com.cams.fundsnetcoreconnect.repository.DummyDataRepository;
import com.cams.fundsnetcoreconnect.service.UploadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadsServiceImpl implements UploadsService {

    @Autowired
    private DummyDataRepository repository;

    @Override
    public UploadsGetPreSignedUrlResponse getPreSignedUrl(Feed feed) {
        return repository.getPreSignedUrl(feed);
    }
}