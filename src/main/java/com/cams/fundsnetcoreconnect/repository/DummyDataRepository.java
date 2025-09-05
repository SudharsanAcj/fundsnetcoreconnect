package com.cams.fundsnetcoreconnect.repository;

import com.cams.fundsnetcoreconnect.api.model.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DummyDataRepository {

    private final List<InvestorOnboardingGetInvestorOnboardingFileStatusResponseDataInner> investorFileStatuses = new ArrayList<>();
    private final List<InvestorOnboardingGetInvestorOnboardingImageStatusResponseDataInner> investorImageStatuses = new ArrayList<>();
    private final List<InvestorOnboardingGetInvestorStatusResponseDataInner> investorStatuses = new ArrayList<>();
    private final List<InvestorOnboardingGetInvestorRemediationResponse> remediationResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizeAOFResponse> aofResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizeInvestorDetailsResponse> investorDetailsResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizeInvestorSignatureResponse> signatureResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizePANResponse> panResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizeRequiredDocumentsResponse> requiredDocsResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetAuthorizeSectionViewResponse> sectionViewResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetInvestorOnboardingAuthorizeResponse> authorizeResponses = new ArrayList<>();
    private final List<InvestorOnboardingGetInvestorOnboardingSummaryResponse> summaryResponses = new ArrayList<>();
    private final List<InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse> rejectResponses = new ArrayList<>();
    private final List<InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse> remediateResponses = new ArrayList<>();
    private final List<InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse> submitResponses = new ArrayList<>();
    private final List<InvestorOnboardingUpdateInvestorRemediationResponse> updateResponses = new ArrayList<>();
    private final List<InvestorOnboardingUploadInvestorRemediationResponse> uploadResponses = new ArrayList<>();

    {
        // Initialize dummy data
        InvestorOnboardingGetInvestorOnboardingFileStatusResponseDataInner fileStatus = new InvestorOnboardingGetInvestorOnboardingFileStatusResponseDataInner();
        fileStatus.setFileReference("FR123456");
        fileStatus.setFileName("transactions.csv");
        fileStatus.setClientName(JsonNullable.of("HDFC"));
        fileStatus.setOnboardingType(JsonNullable.of("KYC"));
        fileStatus.setUploadTime(OffsetDateTime.parse("2025-01-17T14:24:00Z"));
        fileStatus.setUploadedBy("User1");
        fileStatus.setFileUploadStatus(InvestorOnboardingGetInvestorOnboardingFileStatusResponseDataInner.FileUploadStatusEnum.COMPLETED);
        fileStatus.setTotalTransactions(JsonNullable.of(100));
        InvestorOnboardingStatusCount statusCount = new InvestorOnboardingStatusCount();
        statusCount.setPending(231);
        statusCount.setToBeRemediated(0);
        statusCount.setFailure(0);
        fileStatus.setStatusCount(statusCount);
        investorFileStatuses.add(fileStatus);

        InvestorOnboardingGetInvestorOnboardingImageStatusResponseDataInner imageStatus = new InvestorOnboardingGetInvestorOnboardingImageStatusResponseDataInner();
        imageStatus.setReference("45678965432");
        imageStatus.setClientName(JsonNullable.of("HDFC"));
        imageStatus.setFileName("Image_name_1.zip");
        imageStatus.setParentReference(JsonNullable.of("76544523"));
        imageStatus.setUploadedBy("User1");
        imageStatus.setUploadTime(OffsetDateTime.parse("2025-01-17T14:24:00Z"));
        imageStatus.setImageUploadStatus(InvestorOnboardingGetInvestorOnboardingImageStatusResponseDataInner.ImageUploadStatusEnum.IN_PROGRESS);
        investorImageStatuses.add(imageStatus);

        InvestorOnboardingGetInvestorStatusResponseDataInner investorStatus = new InvestorOnboardingGetInvestorStatusResponseDataInner();
        investorStatus.setReference("TRX123456");
        investorStatus.setClientName(JsonNullable.of("HDFC"));
        investorStatus.setFileReference("FR123456");
        investorStatus.setInvestorPan("DBXPG25374M");
        investorStatus.setInvestorName("John Doe");
        investorStatus.setArn("ARN12345");
        investorStatus.setUploadedBy("User1");
        investorStatus.setUploadTime(OffsetDateTime.parse("2025-01-17T14:24:00Z"));
        investorStatus.setStatus(InvestorOnboardingGetInvestorStatusResponseDataInner.StatusEnum.PENDING);
        investorStatus.setRemarks(JsonNullable.of("Awaiting approval"));
        investorStatuses.add(investorStatus);

        InvestorOnboardingGetInvestorRemediationResponseData remediationData = new InvestorOnboardingGetInvestorRemediationResponseData();
        remediationData.setReference("TRX123456");
        remediationData.setInvestorPan("DBXPG25374M");
        remediationData.setInvestorName("John Doe");
        remediationData.setArn("ARN12345");
        remediationData.setStatus(InvestorOnboardingGetInvestorRemediationResponseData.StatusEnum.PENDING);
        remediationData.setRemarks(JsonNullable.of("Awaiting approval"));
        InvestorOnboardingGetInvestorRemediationResponse remediationResponse = new InvestorOnboardingGetInvestorRemediationResponse();
        remediationResponse.setStatus("success");
        remediationResponse.setData(remediationData);
        remediationResponses.add(remediationResponse);

        InvestorOnboardingGetAuthorizeAOFResponseData aofData = new InvestorOnboardingGetAuthorizeAOFResponseData();
        aofData.setDocumentType("AOF");
        aofData.setUrl("https://storage.googleapis.com/doc123");
        aofData.putMetadataItem("key", "value");
        InvestorOnboardingGetAuthorizeAOFResponse aofResponse = new InvestorOnboardingGetAuthorizeAOFResponse();
        aofResponse.setStatus("success");
        aofResponse.setData(aofData);
        aofResponses.add(aofResponse);

        InvestorOnboardingGetInvestorRemediationResponseData investorDetailsData = new InvestorOnboardingGetInvestorRemediationResponseData();
        investorDetailsData.setReference("TRX123456");
        investorDetailsData.setInvestorPan("DBXPG25374M");
        investorDetailsData.setInvestorName("John Doe");
        investorDetailsData.setArn("ARN12345");
        investorDetailsData.setStatus(InvestorOnboardingGetInvestorRemediationResponseData.StatusEnum.PENDING);
        investorDetailsData.setRemarks(JsonNullable.of("Awaiting approval"));
        InvestorOnboardingGetAuthorizeInvestorDetailsResponse investorDetailsResponse = new InvestorOnboardingGetAuthorizeInvestorDetailsResponse();
        investorDetailsResponse.setStatus("success");
        investorDetailsResponse.setData(investorDetailsData);
        investorDetailsResponses.add(investorDetailsResponse);

        InvestorOnboardingGetAuthorizeInvestorSignatureResponseData signatureData = new InvestorOnboardingGetAuthorizeInvestorSignatureResponseData();
        signatureData.setDocumentType("Signature");
        signatureData.setUrl("https://storage.googleapis.com/doc123");
        signatureData.putMetadataItem("key", "value");
        InvestorOnboardingGetAuthorizeInvestorSignatureResponse signatureResponse = new InvestorOnboardingGetAuthorizeInvestorSignatureResponse();
        signatureResponse.setStatus("success");
        signatureResponse.setData(signatureData);
        signatureResponses.add(signatureResponse);

        InvestorOnboardingGetAuthorizePANResponseData panData = new InvestorOnboardingGetAuthorizePANResponseData();
        panData.setDocumentType("PAN");
        panData.setUrl("https://storage.googleapis.com/doc123");
        panData.putMetadataItem("key", "value");
        InvestorOnboardingGetAuthorizePANResponse panResponse = new InvestorOnboardingGetAuthorizePANResponse();
        panResponse.setStatus("success");
        panResponse.setData(panData);
        panResponses.add(panResponse);

        InvestorOnboardingGetAuthorizeRequiredDocumentsResponse requiredDocsResponse = new InvestorOnboardingGetAuthorizeRequiredDocumentsResponse();
        requiredDocsResponse.setStatus("success");
        requiredDocsResponse.addDataItem("Aadhaar card");
        requiredDocsResponses.add(requiredDocsResponse);

        InvestorOnboardingGetAuthorizeSectionViewResponse sectionViewResponse = new InvestorOnboardingGetAuthorizeSectionViewResponse();
        sectionViewResponse.setStatus("success");
        sectionViewResponse.putDataItem("key", "value");
        sectionViewResponses.add(sectionViewResponse);

        InvestorOnboardingGetInvestorOnboardingAuthorizeResponse authorizeResponse = new InvestorOnboardingGetInvestorOnboardingAuthorizeResponse();
        authorizeResponse.setStatus("success");
        authorizeResponse.setData(investorDetailsData);
        authorizeResponses.add(authorizeResponse);

        InvestorOnboardingGetInvestorOnboardingSummaryResponseData summaryData = new InvestorOnboardingGetInvestorOnboardingSummaryResponseData();
        summaryData.setOverall(1000);
        summaryData.setSuccess(800);
        summaryData.setPending(100);
        summaryData.setToBeRemediated(50);
        summaryData.setFailure(50);
        InvestorOnboardingGetInvestorOnboardingSummaryResponse summaryResponse = new InvestorOnboardingGetInvestorOnboardingSummaryResponse();
        summaryResponse.setStatus("success");
        summaryResponse.setData(summaryData);
        summaryResponses.add(summaryResponse);

        InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse rejectResponse = new InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse();
        rejectResponse.setStatus("success");
        rejectResponse.setMessage("Action performed");
        rejectResponses.add(rejectResponse);

        InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse remediateResponse = new InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse();
        remediateResponse.setStatus("success");
        remediateResponse.setMessage("Action performed");
        remediateResponses.add(remediateResponse);

        InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse submitResponse = new InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse();
        submitResponse.setStatus("success");
        submitResponse.setData(investorDetailsData);
        submitResponses.add(submitResponse);

        InvestorOnboardingUpdateInvestorRemediationResponse updateResponse = new InvestorOnboardingUpdateInvestorRemediationResponse();
        updateResponse.setStatus("success");
        updateResponse.setMessage("Updates applied successfully");
        updateResponses.add(updateResponse);

        InvestorOnboardingUploadInvestorRemediationResponse uploadResponse = new InvestorOnboardingUploadInvestorRemediationResponse();
        uploadResponse.setStatus("success");
        uploadResponse.setMessage("Updates applied successfully");
        uploadResponses.add(uploadResponse);
    }

    public InvestorOnboardingDownloadInvestorOnboardingFileStatusResponse downloadInvestorOnboardingFileStatus(String fileReferenceId) {
        InvestorOnboardingDownloadInvestorOnboardingFileStatusResponse response = new InvestorOnboardingDownloadInvestorOnboardingFileStatusResponse();
        response.setFile(new ByteArrayResource(new byte[0])); // Use ByteArrayResource for Resource type
        return response;
    }

    public InvestorOnboardingDownloadInvestorStatusResponse downloadInvestorStatus(String transactionReferenceId) {
        InvestorOnboardingDownloadInvestorStatusResponse response = new InvestorOnboardingDownloadInvestorStatusResponse();
        response.setFile(new ByteArrayResource(new byte[0])); // Use ByteArrayResource for Resource type
        return response;
    }

    public InvestorOnboardingGetAuthorizeAOFResponse getAuthorizeAOF(String transactionReference) {
        return aofResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetAuthorizeInvestorDetailsResponse getAuthorizeInvestorDetails(String transactionReference) {
        return investorDetailsResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetAuthorizeInvestorSignatureResponse getAuthorizeInvestorSignature(String transactionReference) {
        return signatureResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetAuthorizePANResponse getAuthorizePAN(String transactionReference) {
        return panResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetAuthorizeRequiredDocumentsResponse getAuthorizeRequiredDocuments(String transactionReference) {
        return requiredDocsResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetAuthorizeSectionViewResponse getAuthorizeSectionView(String transactionReference) {
        return sectionViewResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetInvestorOnboardingAuthorizeResponse getInvestorOnboardingAuthorize(String transactionReference) {
        return authorizeResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetInvestorOnboardingFileStatusResponse getInvestorOnboardingFileStatus(Integer page, Integer limit) {
        InvestorOnboardingGetInvestorOnboardingFileStatusResponse response = new InvestorOnboardingGetInvestorOnboardingFileStatusResponse();
        response.setStatus("success");
        response.setData(investorFileStatuses.subList(0, Math.min(limit, investorFileStatuses.size())));
        InvestorOnboardingPagination pagination = new InvestorOnboardingPagination();
        pagination.setPage(page);
        pagination.setLimit(limit);
        pagination.setTotalRecords(investorFileStatuses.size());
        response.setPagination(pagination);
        return response;
    }

    public InvestorOnboardingGetInvestorOnboardingImageStatusResponse getInvestorOnboardingImageStatus(Integer page, Integer limit) {
        InvestorOnboardingGetInvestorOnboardingImageStatusResponse response = new InvestorOnboardingGetInvestorOnboardingImageStatusResponse();
        response.setStatus("success");
        response.setData(investorImageStatuses.subList(0, Math.min(limit, investorImageStatuses.size())));
        InvestorOnboardingPagination pagination = new InvestorOnboardingPagination();
        pagination.setPage(page);
        pagination.setLimit(limit);
        pagination.setTotalRecords(investorImageStatuses.size());
        response.setPagination(pagination);
        return response;
    }

    public InvestorOnboardingGetInvestorOnboardingSummaryResponse getInvestorOnboardingSummary() {
        return summaryResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetInvestorRemediationResponse getInvestorRemediation(String transactionReferenceId) {
        return remediationResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingGetInvestorStatusResponse getInvestorStatus(Integer page, Integer limit) {
        InvestorOnboardingGetInvestorStatusResponse response = new InvestorOnboardingGetInvestorStatusResponse();
        response.setStatus("success");
        response.setData(investorStatuses.subList(0, Math.min(limit, investorStatuses.size())));
        InvestorOnboardingPagination pagination = new InvestorOnboardingPagination();
        pagination.setPage(page);
        pagination.setLimit(limit);
        pagination.setTotalRecords(investorStatuses.size());
        response.setPagination(pagination);
        return response;
    }

    public InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse rejectInvestorOnboardingAuthorize(String transactionReference) {
        return rejectResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse sendToRemediateInvestorOnboardingAuthorize(String transactionReference) {
        return remediateResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse submitInvestorOnboardingAuthorize(String transactionReference, InvestorOnboardingSubmitInvestorOnboardingAuthorizeRequest request) {
        return submitResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingUpdateInvestorRemediationResponse updateInvestorRemediation(String transactionReferenceId, InvestorOnboardingUpdateInvestorRemediationRequest request) {
        return updateResponses.get(0); // Return first mock response
    }

    public InvestorOnboardingUploadInvestorRemediationResponse uploadInvestorRemediation(String transactionReferenceId, String documentType, MultipartFile file) {
        return uploadResponses.get(0); // Return first mock response
    }
    //for Downloads
    private final List<DownloadsListDownloadsResponseDataInner> downloadRecords = new ArrayList<>();

        {
            // Initialize dummy data
            DownloadsListDownloadsResponseDataInner record = new DownloadsListDownloadsResponseDataInner();
            record.setFileReferenceId("FR123456");
            record.setFileName("report.pdf");
            record.setDownloadTime(OffsetDateTime.parse("2025-01-17T14:24:00Z"));
            record.setDownloadedBy("User1");
            downloadRecords.add(record);
        }

        public DownloadsDownloadFileAgainResponse downloadFileAgain (String fileReferenceId){
        DownloadsDownloadFileAgainResponse response = new DownloadsDownloadFileAgainResponse();
        response.setFile(new ByteArrayResource(new byte[0])); // Placeholder for binary data
        return response;
    }

        public DownloadsListDownloadsResponse listDownloads (Integer page, Integer limit){
        DownloadsListDownloadsResponse response = new DownloadsListDownloadsResponse();
        response.setStatus("success");
        response.setData(downloadRecords.subList(0, Math.min(limit, downloadRecords.size())));
        DownloadsPagination pagination = new DownloadsPagination();
        pagination.setPage(page);
        pagination.setLimit(limit);
        pagination.setTotalRecords(downloadRecords.size());
        response.setPagination(pagination);
        return response;
    }

        public DownloadsViewDownloadDetailsResponse viewDownloadDetails (String fileReferenceId){
        DownloadsViewDownloadDetailsResponse response = new DownloadsViewDownloadDetailsResponse();
        response.setStatus("success");
        for (DownloadsListDownloadsResponseDataInner record : downloadRecords) {
            if (record.getFileReferenceId().equals(fileReferenceId)) {
                response.setData(record);
                break;
            }
        }
        if (response.getData() == null) {
            response.setData(new DownloadsListDownloadsResponseDataInner()); // Default if not found
        }
        return response;
    }

    //for reports
    private final List<ReportsGetGeneratedReportsResponseDataInner> generatedReports = new ArrayList<>();
    private final List<ReportsGetAllReportTypesResponseDataInner> reportTypes = new ArrayList<>();

    {
        // Initialize dummy data for generated reports
        ReportsGetGeneratedReportsResponseDataInner report = new ReportsGetGeneratedReportsResponseDataInner();
        report.setReportId("RPT123456");
        report.setReportName("All Transactions Report");
        report.setReportType("Financial transaction");
        report.setReportConfig("Daily - 15:00");
        report.setFrequency("01 Jan 2025 - 30 Jan 2025");
        report.setGeneratedOn(OffsetDateTime.parse("2025-01-17T14:24:00Z"));
        report.setGeneratedBy("Preethi");
        report.setReportStatus(ReportsGetGeneratedReportsResponseDataInner.ReportStatusEnum.COMPLETED);
        generatedReports.add(report);

        // Initialize dummy data for report types
        ReportsGetAllReportTypesResponseDataInner reportType = new ReportsGetAllReportTypesResponseDataInner();
        reportType.setCode("H");
        reportType.setName("HDFC AMC");
        reportTypes.add(reportType);
    }

    public ReportsCreateAdhocReportResponse createAdhocReport(ReportsCreateAdhocReportRequest request) {
        ReportsCreateAdhocReportResponse response = new ReportsCreateAdhocReportResponse();
        response.setStatus("success");
        response.setMessage("Adhoc report generated");
        response.setReportId("RPT20250901");
        response.setDownloadLink(URI.create("https://reports.hdfc.com/download/RPT20250901"));
        return response;
    }

    public ReportsCreateScheduledReportResponse createScheduledReport(ReportsCreateScheduledReportRequest request) {
        ReportsCreateScheduledReportResponse response = new ReportsCreateScheduledReportResponse();
        response.setStatus("success");
        response.setMessage("Scheduled report has been saved");
        response.setReportId("SCHED20250901");
        return response;
    }

    public ReportsDeleteScheduledReportResponse deleteScheduledReport(String reportId) {
        ReportsDeleteScheduledReportResponse response = new ReportsDeleteScheduledReportResponse();
        response.setStatus("success");
        response.setMessage("Report deleted");
        return response;
    }

    public ReportsDisableScheduledReportResponse disableScheduledReport(String reportId, ReportsDisableScheduledReportRequest request) {
        ReportsDisableScheduledReportResponse response = new ReportsDisableScheduledReportResponse();
        response.setStatus("success");
        response.setMessage("Report status updated successfully");
        return response;
    }

    public ReportsDownloadReportResponse downloadReport(String reportId) {
        ReportsDownloadReportResponse response = new ReportsDownloadReportResponse();
        response.setFile(new ByteArrayResource(new byte[0])); // Placeholder for binary data
        return response;
    }

    public ReportsGetAllReportTypesResponse getAllReportTypes() {
        ReportsGetAllReportTypesResponse response = new ReportsGetAllReportTypesResponse();
        response.setStatus("success");
        response.setData(reportTypes);
        return response;
    }

    public ReportsGetAllSchedulesResponse getAllSchedules() {
        ReportsGetAllSchedulesResponse response = new ReportsGetAllSchedulesResponse();
        response.setStatus("success");
        response.addDataItem(ReportsGetAllSchedulesResponse.DataEnum.DAILY);
        response.addDataItem(ReportsGetAllSchedulesResponse.DataEnum.WEEKLY);
        response.addDataItem(ReportsGetAllSchedulesResponse.DataEnum.MONTHLY);
        return response;
    }

    public ReportsGetGeneratedReportsResponse getGeneratedReports(Integer page, Integer limit) {
        ReportsGetGeneratedReportsResponse response = new ReportsGetGeneratedReportsResponse();
        response.setStatus("success");
        response.setData(generatedReports.subList(0, Math.min(limit, generatedReports.size())));
        ReportsPagination pagination = new ReportsPagination();
        pagination.setPage(page);
        pagination.setLimit(limit);
        pagination.setTotalRecords(generatedReports.size());
        response.setPagination(pagination);
        return response;
    }

    public ReportsGetReportTransactionTypesResponse getReportTransactionTypes() {
        ReportsGetReportTransactionTypesResponse response = new ReportsGetReportTransactionTypesResponse();
        response.setStatus("success");
        response.setData(reportTypes);
        return response;
    }

    public ReportsModifyReportResponse modifyReport(String reportId, ReportsModifyReportRequest request) {
        ReportsModifyReportResponse response = new ReportsModifyReportResponse();
        response.setStatus("success");
        response.setMessage("Changes have been applied successfully");
        response.setUpdatedReportId("RPT123456");
        return response;
    }

    public ReportsShareReportResponse shareReport(String reportId, ReportsShareReportRequest request) {
        ReportsShareReportResponse response = new ReportsShareReportResponse();
        response.setStatus("success");
        response.setMessage("Report sent successfully to " + request.getEmail());
        response.setReportLink(URI.create("https://reports.hdfc.com/download/" + reportId));
        return response;
    }

}