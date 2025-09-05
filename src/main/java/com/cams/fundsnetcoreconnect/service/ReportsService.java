package com.cams.fundsnetcoreconnect.service;

import com.cams.fundsnetcoreconnect.api.model.*;

import java.time.LocalDate;

public interface ReportsService {
    ReportsCreateAdhocReportResponse createAdhocReport(ReportsCreateAdhocReportRequest request);
    ReportsCreateScheduledReportResponse createScheduledReport(ReportsCreateScheduledReportRequest request);
    ReportsDeleteScheduledReportResponse deleteScheduledReport(String reportId);
    ReportsDisableScheduledReportResponse disableScheduledReport(String reportId, ReportsDisableScheduledReportRequest request);
    ReportsDownloadReportResponse downloadReport(String reportId);
    ReportsGetAllReportTypesResponse getAllReportTypes();
    ReportsGetAllSchedulesResponse getAllSchedules();
    ReportsGetGeneratedReportsResponse getGeneratedReports(LocalDate startDate, LocalDate endDate, Integer page, Integer limit);
    ReportsGetReportTransactionTypesResponse getReportTransactionTypes();
    ReportsModifyReportResponse modifyReport(String reportId, ReportsModifyReportRequest request);
    ReportsShareReportResponse shareReport(String reportId, ReportsShareReportRequest request);
}