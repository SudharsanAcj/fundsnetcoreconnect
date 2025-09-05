1. Get Presigned URL

Endpoint: POST /documents/preSignedUrl
CURL Command:
bash

curl -X POST "http://localhost:8080/documents/preSignedUrl" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{
"feeds": [
{
"fileName": "sample.pdf",
"fileType": "pdf",
"fileSize": 2048
}
],
"clientName": "HDFC",
"feedType": "aof",
"feedChecksum": "abc123"
}'

Expected Mock Response:
json{
"status": "success",
"data": {
"data": {
"url": "https://storage.googleapis.com/uploaded-file-123",
"expiry": "2025-09-06T04:52:19.130Z",
"fileMeta": {
"fileName": "sample.pdf",
"fileType": "pdf",
"fileSize": 2048
}
}
}
}

Note: The expiry will reflect the current time plus 1 hour (e.g., around 04:52 AM IST on September 06, 2025, adjusted to UTC).




