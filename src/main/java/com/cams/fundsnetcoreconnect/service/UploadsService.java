package com.cams.fundsnetcoreconnect.service;

import com.cams.fundsnetcoreconnect.api.model.Feed;
import com.cams.fundsnetcoreconnect.api.model.UploadsGetPreSignedUrlResponse;

public interface UploadsService {
    UploadsGetPreSignedUrlResponse getPreSignedUrl(Feed feed);
}