package com.cams.fundsnetcoreconnect.serviceimpl;

import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkRequest;
import com.cams.fundsnetcoreconnect.api.model.BookmarksCreateBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksDeleteBookmarkResponse;
import com.cams.fundsnetcoreconnect.api.model.BookmarksListBookmarksResponse;
import com.cams.fundsnetcoreconnect.repository.DummyDataRepository;
import com.cams.fundsnetcoreconnect.service.BookmarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookmarksServiceImpl implements BookmarksService {

    @Autowired
    private DummyDataRepository repository;

    @Override
    public BookmarksCreateBookmarkResponse createBookmark(BookmarksCreateBookmarkRequest request) {
        return repository.createBookmark(request);
    }

    @Override
    public BookmarksDeleteBookmarkResponse deleteBookmark(String bookmarkId) {
        return repository.deleteBookmark(bookmarkId);
    }

    @Override
    public BookmarksListBookmarksResponse listBookmarks(Integer page, Integer limit) {
        return repository.listBookmarks(page, limit);
    }
}