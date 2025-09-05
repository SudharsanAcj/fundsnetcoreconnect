1. Create Adhoc Report

Endpoint: POST /financialTransactions/reports/create/adhoc
CURL Command:
bash
curl -X POST "http://localhost:8080/financialTransactions/reports/create/adhoc" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"reportType": "Financial transaction", "transactionType": "Purchase", "uploadDateFrom": "2025-01-01", "uploadDateTo": "2025-01-31"}'

Expected Mock Response:
json{
"status": "success",
"message": "Adhoc report generated",
"reportId": "RPT20250901",
"downloadLink": "https://reports.hdfc.com/download/RPT20250901"
}


2. Create Scheduled Report

Endpoint: POST /financialTransactions/reports/create/scheduled
CURL Command:
bash
curl -X POST "http://localhost:8080/financialTransactions/reports/create/scheduled" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"reportName": "Monthly Purchase Report", "reportType": "Financial transaction", "transactionType": "Purchase", "frequency": "Monthly"}'

Expected Mock Response:
json{
"status": "success",
"message": "Scheduled report has been saved",
"reportId": "SCHED20250901"
}


3. Delete Scheduled Report

Endpoint: DELETE /financialTransactions/reports/manage/{reportId}
CURL Command:
bash
curl -X DELETE "http://localhost:8080/financialTransactions/reports/manage/SCHED20250901" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"message": "Report deleted"
}


4. Disable Scheduled Report

Endpoint: PATCH /financialTransactions/reports/manage/disable/{reportId}
CURL Command:
bash
curl -X PATCH "http://localhost:8080/financialTransactions/reports/manage/disable/SCHED20250901" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"status": "Disabled"}'

Expected Mock Response:
json{
"status": "success",
"message": "Report status updated successfully"
}


5. Download Generated Report(error)

Endpoint: GET /financialTransactions/reports/{reportId}/download
CURL Command:
bash
curl -X GET "http://localhost:8080/financialTransactions/reports/RPT123456/download" \
-H "Accept: application/octet-stream" \
-o report_file.bin

Expected Mock Response: (Binary data, empty ByteArrayResource)

The response will be an empty file (report_file.bin) since the dummy data uses new byte[0].



6. Get All Report Types

Endpoint: GET /financialTransactions/reports/allReportTypes
CURL Command:
bash
curl -X GET "http://localhost:8080/financialTransactions/reports/allReportTypes" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
{
"code": "H",
"name": "HDFC AMC"
}
]
}


7. Get All Schedules

Endpoint: GET /financialTransactions/reports/allSchedules
CURL Command:
bash
curl -X GET "http://localhost:8080/financialTransactions/reports/allSchedules" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
"Daily",
"Weekly",
"Monthly"
]
}


8. Get Generated Reports

Endpoint: GET /financialTransactions/reports
CURL Command:
bash
curl -X GET "http://localhost:8080/financialTransactions/reports?page=1&limit=10&startDate=2025-01-01&endDate=2025-01-31" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
{
"reportId": "RPT123456",
"reportName": "All Transactions Report",
"reportType": "Financial transaction",
"reportConfig": "Daily - 15:00",
"frequency": "01 Jan 2025 - 30 Jan 2025",
"generatedOn": "2025-01-17T14:24:00Z",
"generatedBy": "Preethi",
"reportStatus": "Completed"
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}


9. Get Report Transaction Types

Endpoint: GET /financialTransactions/reports/allTransactionTypes
CURL Command:
bash
curl -X GET "http://localhost:8080/financialTransactions/reports/allTransactionTypes" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
{
"code": "H",
"name": "HDFC AMC"
}
]
}


10. Modify Report

Endpoint: PATCH /financialTransactions/reports/manage/modify/{reportId}
CURL Command:
bash
curl -X PATCH "http://localhost:8080/financialTransactions/reports/manage/modify/RPT123456" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"reportType": "Financial transaction", "transactionType": "Purchase"}'

Expected Mock Response:
json{
"status": "success",
"message": "Changes have been applied successfully",
"updatedReportId": "RPT123456"
}


11. Share Report

Endpoint: POST /financialTransactions/reports/{reportId}/share
CURL Command:
bash
curl -X POST "http://localhost:8080/financialTransactions/reports/RPT123456/share" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"email": "santhoshkrishnamoorthy@hdfc.com"}'

Expected Mock Response:
json{
"status": "success",
"message": "Report sent successfully to santhoshkrishnamoorthy@hdfc.com",
"reportLink": "https://reports.hdfc.com/download/RPT123456"
}