package com.cams.fundsnetcoreconnect.contoller;

import com.cams.fundsnetcoreconnect.api.InvestorOnboardingApi;
import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.service.InvestorOnboardingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@RestController
public class InvestorOnboardingController implements InvestorOnboardingApi {

    private final InvestorOnboardingService service;

    public InvestorOnboardingController(InvestorOnboardingService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<InvestorOnboardingDownloadInvestorOnboardingFileStatusResponse> downloadInvestorOnboardingFileStatus(String fileReferenceId) {
        return ResponseEntity.ok(service.downloadInvestorOnboardingFileStatus(fileReferenceId));
    }

    @Override
    public ResponseEntity<InvestorOnboardingDownloadInvestorStatusResponse> downloadInvestorStatus(String transactionReferenceId) {
        return ResponseEntity.ok(service.downloadInvestorStatus(transactionReferenceId));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizeAOFResponse> getAuthorizeAOF(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizeAOF(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizeInvestorDetailsResponse> getAuthorizeInvestorDetails(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizeInvestorDetails(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizeInvestorSignatureResponse> getAuthorizeInvestorSignature(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizeInvestorSignature(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizePANResponse> getAuthorizePAN(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizePAN(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizeRequiredDocumentsResponse> getAuthorizeRequiredDocuments(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizeRequiredDocuments(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetAuthorizeSectionViewResponse> getAuthorizeSectionView(String transactionReference) {
        return ResponseEntity.ok(service.getAuthorizeSectionView(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorOnboardingAuthorizeResponse> getInvestorOnboardingAuthorize(String transactionReference) {
        return ResponseEntity.ok(service.getInvestorOnboardingAuthorize(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorOnboardingFileStatusResponse> getInvestorOnboardingFileStatus(
            Integer page, Integer limit, LocalDate startDate, LocalDate endDate) {
        return ResponseEntity.ok(service.getInvestorOnboardingFileStatus(page, limit, startDate, endDate));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorOnboardingImageStatusResponse> getInvestorOnboardingImageStatus(Integer page, Integer limit) {
        return ResponseEntity.ok(service.getInvestorOnboardingImageStatus(page, limit));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorOnboardingSummaryResponse> getInvestorOnboardingSummary(LocalDate startDate, LocalDate endDate) {
        return ResponseEntity.ok(service.getInvestorOnboardingSummary(startDate, endDate));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorRemediationResponse> getInvestorRemediation(String transactionReferenceId) {
        return ResponseEntity.ok(service.getInvestorRemediation(transactionReferenceId));
    }

    @Override
    public ResponseEntity<InvestorOnboardingGetInvestorStatusResponse> getInvestorStatus(
            Integer page, Integer limit, LocalDate startDate, LocalDate endDate) {
        return ResponseEntity.ok(service.getInvestorStatus(page, limit, startDate, endDate));
    }

    @Override
    public ResponseEntity<InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse> rejectInvestorOnboardingAuthorize(
            String transactionReference, Object body) {
        return ResponseEntity.ok(service.rejectInvestorOnboardingAuthorize(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse> sendToRemediateInvestorOnboardingAuthorize(
            String transactionReference, Object body) {
        return ResponseEntity.ok(service.sendToRemediateInvestorOnboardingAuthorize(transactionReference));
    }

    @Override
    public ResponseEntity<InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse> submitInvestorOnboardingAuthorize(
            String transactionReference, InvestorOnboardingSubmitInvestorOnboardingAuthorizeRequest request) {
        return ResponseEntity.ok(service.submitInvestorOnboardingAuthorize(transactionReference, request));
    }

    @Override
    public ResponseEntity<InvestorOnboardingUpdateInvestorRemediationResponse> updateInvestorRemediation(
            String transactionReferenceId, InvestorOnboardingUpdateInvestorRemediationRequest request) {
        return ResponseEntity.ok(service.updateInvestorRemediation(transactionReferenceId, request));
    }

    @Override
    public ResponseEntity<InvestorOnboardingUploadInvestorRemediationResponse> uploadInvestorRemediation(
            String transactionReferenceId, String documentType, MultipartFile file) {
        return ResponseEntity.ok(service.uploadInvestorRemediation(transactionReferenceId, documentType, file));
    }
}