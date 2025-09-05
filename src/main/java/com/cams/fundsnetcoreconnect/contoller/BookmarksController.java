package com.cams.fundsnetcoreconnect.contoller;

import com.cams.fundsnetcoreconnect.api.BookmarksApi;
import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkRequest;
import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksDeleteBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksListBookmarksResponse;
import com.cams.fundsnetcoreconnect.service.BookmarksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookmarksController implements BookmarksApi {

    private final BookmarksService service;

    public BookmarksController(BookmarksService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<BookmarksCreateBookmarkResponse> createBookmark(BookmarksCreateBookmarkRequest bookmarksCreateBookmarkRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createBookmark(bookmarksCreateBookmarkRequest));
    }

    @Override
    public ResponseEntity<BookmarksDeleteBookmarkResponse> deleteBookmark(String bookmarkId) {
        return ResponseEntity.ok(service.deleteBookmark(bookmarkId));
    }

    @Override
    public ResponseEntity<BookmarksListBookmarksResponse> listBookmarks(Integer page, Integer limit) {
        return ResponseEntity.ok(service.listBookmarks(page, limit));
    }
}