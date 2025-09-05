package com.cams.fundsnetcoreconnect.service;

import com.cams.fundsnetcoreconnect.api.model.DownloadsDownloadFileAgainResponse;
import com.cams.fundsnetcoreconnect.api.model.DownloadsListDownloadsResponse;
import com.cams.fundsnetcoreconnect.api.model.DownloadsViewDownloadDetailsResponse;

public interface DownloadsService {
    DownloadsDownloadFileAgainResponse downloadFileAgain(String fileReferenceId);
    DownloadsListDownloadsResponse listDownloads(Integer page, Integer limit);
    DownloadsViewDownloadDetailsResponse viewDownloadDetails(String fileReferenceId);
}