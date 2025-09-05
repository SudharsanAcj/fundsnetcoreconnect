1. List All Downloads

Endpoint: GET /downloads
CURL Command:
bash
curl -X GET "http://localhost:8080/downloads?page=1&limit=10" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
{
"fileReferenceId": "FR123456",
"fileName": "report.pdf",
"downloadTime": "2025-01-17T14:24:00Z",
"downloadedBy": "User1"
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}


2. View Download Details

Endpoint: GET /downloads/{fileReferenceId}
CURL Command:
bash
curl -X GET "http://localhost:8080/downloads/FR123456" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": {
"fileReferenceId": "FR123456",
"fileName": "report.pdf",
"downloadTime": "2025-01-17T14:24:00Z",
"downloadedBy": "User1"
}
}


3. Download File Again

Endpoint: GET /downloads/{fileReferenceId}/download
CURL Command:
bash
curl -X GET "http://localhost:8080/downloads/FR123456/download" \
-H "Accept: application/octet-stream" \
-o downloaded_file.bin