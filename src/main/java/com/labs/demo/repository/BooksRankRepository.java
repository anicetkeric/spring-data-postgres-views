
package com.labs.demo.repository;

import com.labs.demo.entity.BooksRank;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * <h2>BooksRankRepository</h2> *
 * @author @bootteam
 */
@Repository
public interface BooksRankRepository extends PagingAndSortingRepository<BooksRank, String> {

}
