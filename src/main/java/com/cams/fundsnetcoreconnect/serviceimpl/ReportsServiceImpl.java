package com.cams.fundsnetcoreconnect.serviceimpl;

import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.repository.DummyDataRepository;
import com.cams.fundsnetcoreconnect.service.ReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Service
public class ReportsServiceImpl implements ReportsService {

    @Autowired
    private DummyDataRepository repository;

    @Override
    public ReportsCreateAdhocReportResponse createAdhocReport(ReportsCreateAdhocReportRequest request) {
        return repository.createAdhocReport(request);
    }

    @Override
    public ReportsCreateScheduledReportResponse createScheduledReport(ReportsCreateScheduledReportRequest request) {
        return repository.createScheduledReport(request);
    }

    @Override
    public ReportsDeleteScheduledReportResponse deleteScheduledReport(String reportId) {
        return repository.deleteScheduledReport(reportId);
    }

    @Override
    public ReportsDisableScheduledReportResponse disableScheduledReport(String reportId, ReportsDisableScheduledReportRequest request) {
        return repository.disableScheduledReport(reportId, request);
    }

    @Override
    public ReportsDownloadReportResponse downloadReport(String reportId) {
        return repository.downloadReport(reportId);
    }

    @Override
    public ReportsGetAllReportTypesResponse getAllReportTypes() {
        return repository.getAllReportTypes();
    }

    @Override
    public ReportsGetAllSchedulesResponse getAllSchedules() {
        return repository.getAllSchedules();
    }

    @Override
    public ReportsGetGeneratedReportsResponse getGeneratedReports(LocalDate startDate, LocalDate endDate, Integer page, Integer limit) {
        return repository.getGeneratedReports(page, limit); // Ignoring dates for now in dummy impl
    }

    @Override
    public ReportsGetReportTransactionTypesResponse getReportTransactionTypes() {
        return repository.getReportTransactionTypes();
    }

    @Override
    public ReportsModifyReportResponse modifyReport(String reportId, ReportsModifyReportRequest request) {
        return repository.modifyReport(reportId, request);
    }

    @Override
    public ReportsShareReportResponse shareReport(String reportId, ReportsShareReportRequest request) {
        return repository.shareReport(reportId, request);
    }
}