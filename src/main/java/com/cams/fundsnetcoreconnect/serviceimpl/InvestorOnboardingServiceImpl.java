package com.cams.fundsnetcoreconnect.serviceimpl;

import com.cams.fundsnetcoreconnect.api.model.*;
import com.cams.fundsnetcoreconnect.repository.DummyDataRepository;
import com.cams.fundsnetcoreconnect.service.InvestorOnboardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Service
public class InvestorOnboardingServiceImpl implements InvestorOnboardingService {

    @Autowired
    private DummyDataRepository repository;

    @Override
    public InvestorOnboardingDownloadInvestorOnboardingFileStatusResponse downloadInvestorOnboardingFileStatus(String fileReferenceId) {
        return repository.downloadInvestorOnboardingFileStatus(fileReferenceId);
    }

    @Override
    public InvestorOnboardingDownloadInvestorStatusResponse downloadInvestorStatus(String transactionReferenceId) {
        return repository.downloadInvestorStatus(transactionReferenceId);
    }

    @Override
    public InvestorOnboardingGetAuthorizeAOFResponse getAuthorizeAOF(String transactionReference) {
        return repository.getAuthorizeAOF(transactionReference);
    }

    @Override
    public InvestorOnboardingGetAuthorizeInvestorDetailsResponse getAuthorizeInvestorDetails(String transactionReference) {
        return repository.getAuthorizeInvestorDetails(transactionReference);
    }

    @Override
    public InvestorOnboardingGetAuthorizeInvestorSignatureResponse getAuthorizeInvestorSignature(String transactionReference) {
        return repository.getAuthorizeInvestorSignature(transactionReference);
    }

    @Override
    public InvestorOnboardingGetAuthorizePANResponse getAuthorizePAN(String transactionReference) {
        return repository.getAuthorizePAN(transactionReference);
    }

    @Override
    public InvestorOnboardingGetAuthorizeRequiredDocumentsResponse getAuthorizeRequiredDocuments(String transactionReference) {
        return repository.getAuthorizeRequiredDocuments(transactionReference);
    }

    @Override
    public InvestorOnboardingGetAuthorizeSectionViewResponse getAuthorizeSectionView(String transactionReference) {
        return repository.getAuthorizeSectionView(transactionReference);
    }

    @Override
    public InvestorOnboardingGetInvestorOnboardingAuthorizeResponse getInvestorOnboardingAuthorize(String transactionReference) {
        return repository.getInvestorOnboardingAuthorize(transactionReference);
    }

    @Override
    public InvestorOnboardingGetInvestorOnboardingFileStatusResponse getInvestorOnboardingFileStatus(Integer page, Integer limit, LocalDate startDate, LocalDate endDate) {
        return repository.getInvestorOnboardingFileStatus(page, limit);
    }

    @Override
    public InvestorOnboardingGetInvestorOnboardingImageStatusResponse getInvestorOnboardingImageStatus(Integer page, Integer limit) {
        return repository.getInvestorOnboardingImageStatus(page, limit);
    }

    @Override
    public InvestorOnboardingGetInvestorOnboardingSummaryResponse getInvestorOnboardingSummary(LocalDate startDate, LocalDate endDate) {
        return repository.getInvestorOnboardingSummary();
    }

    @Override
    public InvestorOnboardingGetInvestorRemediationResponse getInvestorRemediation(String transactionReferenceId) {
        return repository.getInvestorRemediation(transactionReferenceId);
    }

    @Override
    public InvestorOnboardingGetInvestorStatusResponse getInvestorStatus(Integer page, Integer limit, LocalDate startDate, LocalDate endDate) {
        return repository.getInvestorStatus(page, limit);
    }

    @Override
    public InvestorOnboardingRejectInvestorOnboardingAuthorizeResponse rejectInvestorOnboardingAuthorize(String transactionReference) {
        return repository.rejectInvestorOnboardingAuthorize(transactionReference);
    }

    @Override
    public InvestorOnboardingSendToRemediateInvestorOnboardingAuthorizeResponse sendToRemediateInvestorOnboardingAuthorize(String transactionReference) {
        return repository.sendToRemediateInvestorOnboardingAuthorize(transactionReference);
    }

    @Override
    public InvestorOnboardingSubmitInvestorOnboardingAuthorizeResponse submitInvestorOnboardingAuthorize(String transactionReference, InvestorOnboardingSubmitInvestorOnboardingAuthorizeRequest request) {
        return repository.submitInvestorOnboardingAuthorize(transactionReference, request);
    }

    @Override
    public InvestorOnboardingUpdateInvestorRemediationResponse updateInvestorRemediation(String transactionReferenceId, InvestorOnboardingUpdateInvestorRemediationRequest request) {
        return repository.updateInvestorRemediation(transactionReferenceId, request);
    }

    @Override
    public InvestorOnboardingUploadInvestorRemediationResponse uploadInvestorRemediation(String transactionReferenceId, String documentType, MultipartFile file) {
        return repository.uploadInvestorRemediation(transactionReferenceId, documentType, file);
    }
}