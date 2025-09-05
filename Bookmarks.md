**1. Create Bookmark

Endpoint: POST /bookmarks/create
CURL Command:
bash
curl -X POST "http://localhost:8080/bookmarks/create" \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-d '{"referenceId": "RPT123456", "type": "Report"}'

Expected Mock Response:
json{
"status": "success",
"message": "Bookmark created",
"bookmarkId": "BM1441524098965" // Example, will vary based on timestamp
}


2. Delete Bookmark

Endpoint: DELETE /bookmarks/{bookmarkId}
CURL Command:
bash
curl -X DELETE "http://localhost:8080/bookmarks/BM123" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"message": "Bookmark deleted"
}


3. List All Bookmarks

Endpoint: GET /bookmarks
CURL Command:
bash
curl -X GET "http://localhost:8080/bookmarks?page=1&limit=10" \
-H "Accept: application/json"

Expected Mock Response:
json{
"status": "success",
"data": [
{
"bookmarkId": "BM123",
"referenceId": "RPT123456",
"type": "Report",
"createdBy": "User1",
"createdOn": "2025-01-17T14:24:00Z"
}
],
"pagination": {
"page": 1,
"limit": 10,
"totalRecords": 1
}
}**