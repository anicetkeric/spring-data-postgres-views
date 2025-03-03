package com.labs.demo.service;


import com.labs.demo.entity.BooksRank;
import com.labs.demo.repository.BooksRankRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.StreamSupport;

/**
 * Service Implementation for managing {@link BooksRank}.
 *
 * @author @bootteam
 */
@Service
@Transactional
public class BooksRankServiceImpl implements BooksRankService {

    private final BooksRankRepository repository;

    public BooksRankServiceImpl(BooksRankRepository repository) {
        this.repository = repository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<BooksRank> getAll() {
        var books = repository.findAll(Sort.by(Sort.Direction.ASC, "title"));
        return StreamSupport
                .stream(books.spliterator(), false)
                .toList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<BooksRank> getPagination(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
