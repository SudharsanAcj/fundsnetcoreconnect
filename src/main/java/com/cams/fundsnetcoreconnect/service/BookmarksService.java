package com.cams.fundsnetcoreconnect.service;

import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkRequest;
import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksDeleteBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksListBookmarksResponse;

public interface BookmarksService {
    BookmarksCreateBookmarkResponse createBookmark(BookmarksCreateBookmarkRequest request);
    BookmarksDeleteBookmarkResponse deleteBookmark(String bookmarkId);
    BookmarksListBookmarksResponse listBookmarks(Integer page, Integer limit);
}