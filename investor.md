CURL Commands and Mock Responses for All Investor Onboarding Endpoints
1. Download Investor Onboarding File Status

Endpoint: GET /investorOnboarding/fileStatus/{fileReferenceId}/download
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/fileStatus/FR123456/download" \
-H "Accept: application/octet-stream" \
-o downloaded_file.bin

Mock Response: (Binary data, represented as a placeholder)

The DummyDataRepository returns a ByteArrayResource with an empty byte[]. In a real scenario, this would be the file content.
Note: Since it’s a binary response, you’ll save it to a file (e.g., downloaded_file.bin) and can verify it’s empty or replace it with actual file logic later.



2. Download Investor Status Details

Endpoint: GET /investorOnboarding/investorStatus/{transactionReferenceId}/download
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/investorStatus/TRX123456/download" \
-H "Accept: application/octet-stream" \
-o investor_status.bin

Mock Response: (Binary data, placeholder)

Similar to the above, returns an empty ByteArrayResource. Save to investor_status.bin for verification.



3. Get AOF Image Details

Endpoint: GET /investorOnboarding/authorize/aof
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/aof?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"documentType": "AOF",
"url": "https://storage.googleapis.com/doc123",
"metadata": {
"key": "value"
}
}
}


4. Get Investor Details

Endpoint: GET /investorOnboarding/authorize/investorDetails
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/investorDetails?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"reference": "TRX123456",
"investorPan": "DBXPG25374M",
"investorName": "John Doe",
"arn": "ARN12345",
"status": "Pending",
"remarks": "Awaiting approval"
}
}


5. Get Investor Signature

Endpoint: GET /investorOnboarding/authorize/investorSignature
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/investorSignature?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"documentType": "Signature",
"url": "https://storage.googleapis.com/doc123",
"metadata": {
"key": "value"
}
}
}


6. Get PAN Image Details

Endpoint: GET /investorOnboarding/authorize/pan
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/pan?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"documentType": "PAN",
"url": "https://storage.googleapis.com/doc123",
"metadata": {
"key": "value"
}
}
}


7. Get Required Documents

Endpoint: GET /investorOnboarding/authorize/requiredDocuments
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/requiredDocuments?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": [
"Aadhaar card"
]
}


8. Get Section View Details

Endpoint: GET /investorOnboarding/authorize/sectionView
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize/sectionView?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"key": "value"
}
}


9. Get Authorization Details

Endpoint: GET /investorOnboarding/authorize
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/authorize?transactionReference=TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"reference": "TRX123456",
"investorPan": "DBXPG25374M",
"investorName": "John Doe",
"arn": "ARN12345",
"status": "Pending",
"remarks": "Awaiting approval"
}
}


10. Get Investor Onboarding File Status

Endpoint: GET /investorOnboarding/fileStatus
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/fileStatus?page=1&limit=10&startDate=2025-01-01&endDate=2025-01-31" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": [
{
"fileReference": "FR123456",
"fileName": "transactions.csv",
"clientName": "HDFC",
"onboardingType": "KYC",
"uploadTime": "2025-01-17T14:24:00Z",
"uploadedBy": "User1",
"fileUploadStatus": "Completed",
"totalTransactions": 100,
"statusCount": {
"pending": 231,
"toBeRemediated": 0,
"failure": 0
}
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}


11. Get Investor Onboarding Image Status

Endpoint: GET /investorOnboarding/imageStatus
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/imageStatus?page=1&limit=10" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": [
{
"reference": "45678965432",
"clientName": "HDFC",
"fileName": "Image_name_1.zip",
"parentReference": "76544523",
"uploadedBy": "User1",
"uploadTime": "2025-01-17T14:24:00Z",
"imageUploadStatus": "InProgress"
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}


12. Get Investor Onboarding Summary

Endpoint: GET /investorOnboarding/summary
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/summary?startDate=2025-01-01&endDate=2025-01-31" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"overall": 1000,
"success": 800,
"pending": 100,
"toBeRemediated": 50,
"failure": 50
}
}


13. Get Remediation Details

Endpoint: GET /investorOnboarding/investorStatus/remediate/{transactionReferenceId}
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/investorStatus/remediate/TRX123456" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": {
"reference": "TRX123456",
"investorPan": "DBXPG25374M",
"investorName": "John Doe",
"arn": "ARN12345",
"status": "Pending",
"remarks": "Awaiting approval"
}
}


14. Get Investor Status

Endpoint: GET /investorOnboarding/investorStatus
CURL Command:
bashcurl -X GET "http://localhost:8080/v1/investorOnboarding/investorStatus?page=1&limit=10&startDate=2025-01-01&endDate=2025-01-31" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"data": [
{
"reference": "TRX123456",
"clientName": "HDFC",
"fileReference": "FR123456",
"investorPan": "DBXPG25374M",
"investorName": "John Doe",
"arn": "ARN12345",
"uploadedBy": "User1",
"uploadTime": "2025-01-17T14:24:00Z",
"status": "Pending",
"remarks": "Awaiting approval"
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}


15. Reject Authorization

Endpoint: PATCH /investorOnboarding/authorize/hold/reject
CURL Command:
bashcurl -X PATCH "http://localhost:8080/v1/investorOnboarding/authorize/hold/reject?transactionReference=TRX123456" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{}'

Mock Response:
json{
"status": "success",
"message": "Action performed"
}


16. Send to Remediation

Endpoint: PATCH /investorOnboarding/authorize/hold/sendToRemediate
CURL Command:
bashcurl -X PATCH "http://localhost:8080/v1/investorOnboarding/authorize/hold/sendToRemediate?transactionReference=TRX123456" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{}'

Mock Response:
json{
"status": "success",
"message": "Action performed"
}


17. Submit Authorization

Endpoint: POST /investorOnboarding/authorize/submit
CURL Command:
bashcurl -X POST "http://localhost:8080/v1/investorOnboarding/authorize/submit?transactionReference=TRX123456" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"action": "Submit"}'

Mock Response:
json{
"status": "success",
"data": {
"reference": "TRX123456",
"investorPan": "DBXPG25374M",
"investorName": "John Doe",
"arn": "ARN12345",
"status": "Pending",
"remarks": "Awaiting approval"
}
}


18. Update Remediation Details

Endpoint: PATCH /investorOnboarding/investorStatus/remediate/{transactionReferenceId}
CURL Command:
bashcurl -X PATCH "http://localhost:8080/v1/investorOnboarding/investorStatus/remediate/TRX123456" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"updates": [{"field": "status", "newValue": "Completed"}]}'

Mock Response:
json{
"status": "success",
"message": "Updates applied successfully"
}


19. Upload Remediation Document

Endpoint: POST /investorOnboarding/investorStatus/remediate/{transactionReferenceId}
CURL Command:
bashcurl -X POST "http://localhost:8080/v1/investorOnboarding/investorStatus/remediate/TRX123456" \
-H "Content-Type: multipart/form-data" \
-F "documentType=Aadhaar card" \
-F "file=@/path/to/document.pdf" \
-H "Accept: application/json"

Mock Response:
json{
"status": "success",
"message": "Updates applied successfully"
}