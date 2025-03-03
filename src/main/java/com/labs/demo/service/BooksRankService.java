package com.labs.demo.service;

import com.labs.demo.entity.BooksRank;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing {@link BooksRank}.
*  @author @bootteam
 */
public interface BooksRankService {

    /**
     * Get all entities
     *
     * @return list of List<BooksRank>
     */
    List<BooksRank> getAll();

    /**
     * Count item in entity
     *
     * @return Page of Books rank
     */
    Page<BooksRank> getPagination(Pageable pageable);
}
