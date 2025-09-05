package com.cams.fundsnetcoreconnect.serviceimpl;

import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.repository.DummyDataRepository;
import com.cams.fundsnetcoreconnect.service.DownloadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownloadsServiceImpl implements DownloadsService {

    @Autowired
    private DummyDataRepository repository;

    @Override
    public DownloadsDownloadFileAgainResponse downloadFileAgain(String fileReferenceId) {
        return repository.downloadFileAgain(fileReferenceId);
    }

    @Override
    public DownloadsListDownloadsResponse listDownloads(Integer page, Integer limit) {
        return repository.listDownloads(page, limit);
    }

    @Override
    public DownloadsViewDownloadDetailsResponse viewDownloadDetails(String fileReferenceId) {
        return repository.viewDownloadDetails(fileReferenceId);
    }
}