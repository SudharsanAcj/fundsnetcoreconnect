package com.cams.fundsnetcoreconnect.contoller;

import com.cams.fundsnetcoreconnect.api.ReportsApi;
import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.service.ReportsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ReportsController implements ReportsApi {

    private final ReportsService service;

    public ReportsController(ReportsService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<ReportsCreateAdhocReportResponse> createAdhocReport(ReportsCreateAdhocReportRequest reportsCreateAdhocReportRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createAdhocReport(reportsCreateAdhocReportRequest));
    }

    @Override
    public ResponseEntity<ReportsCreateScheduledReportResponse> createScheduledReport(ReportsCreateScheduledReportRequest reportsCreateScheduledReportRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createScheduledReport(reportsCreateScheduledReportRequest));
    }

    @Override
    public ResponseEntity<ReportsDeleteScheduledReportResponse> deleteScheduledReport(String reportId) {
        return ResponseEntity.ok(service.deleteScheduledReport(reportId));
    }

    @Override
    public ResponseEntity<ReportsDisableScheduledReportResponse> disableScheduledReport(String reportId, ReportsDisableScheduledReportRequest reportsDisableScheduledReportRequest) {
        return ResponseEntity.ok(service.disableScheduledReport(reportId, reportsDisableScheduledReportRequest));
    }

    @Override
    public ResponseEntity<ReportsDownloadReportResponse> downloadReport(String reportId) {
        return ResponseEntity.ok(service.downloadReport(reportId));
    }

    @Override
    public ResponseEntity<ReportsGetAllReportTypesResponse> getAllReportTypes() {
        return ResponseEntity.ok(service.getAllReportTypes());
    }

    @Override
    public ResponseEntity<ReportsGetAllSchedulesResponse> getAllSchedules() {
        return ResponseEntity.ok(service.getAllSchedules());
    }

    @Override
    public ResponseEntity<ReportsGetGeneratedReportsResponse> getGeneratedReports(LocalDate startDate, LocalDate endDate, Integer page, Integer limit) {
        return ResponseEntity.ok(service.getGeneratedReports(startDate, endDate, page, limit));
    }

    @Override
    public ResponseEntity<ReportsGetReportTransactionTypesResponse> getReportTransactionTypes() {
        return ResponseEntity.ok(service.getReportTransactionTypes());
    }

    @Override
    public ResponseEntity<ReportsModifyReportResponse> modifyReport(String reportId, ReportsModifyReportRequest reportsModifyReportRequest) {
        return ResponseEntity.ok(service.modifyReport(reportId, reportsModifyReportRequest));
    }

    @Override
    public ResponseEntity<ReportsShareReportResponse> shareReport(String reportId, ReportsShareReportRequest reportsShareReportRequest) {
        return ResponseEntity.ok(service.shareReport(reportId, reportsShareReportRequest));
    }
}