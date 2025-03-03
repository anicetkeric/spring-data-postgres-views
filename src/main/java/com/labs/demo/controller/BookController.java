package com.labs.demo.controller;

import com.labs.demo.entity.BooksRank;
import com.labs.demo.service.BooksRankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * REST controller for managing {@link BooksRank}.
 *
 * @author @bootteam
 */
@RestController
@RequestMapping("/api/books-rank")
public class BookController {

    private final Logger log = LoggerFactory.getLogger(BookController.class);

    private final BooksRankService entityService;

    public BookController(BooksRankService entityService) {
        this.entityService = entityService;
    }

    /**
     * {@code GET  /books-rank} : get all the books.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of book in body.
     */

    @GetMapping
    public ResponseEntity<List<BooksRank>> getAllBook() {
        log.debug("REST request to get all books rank");
        List<BooksRank> lst = entityService.getAll();

        return new ResponseEntity<>(lst, HttpStatus.OK);
    }

    /**
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the book, or with status {@code 404 (Not Found)}.
     */
    @GetMapping(value = "/page")
    public ResponseEntity<Page<BooksRank>> getOneBook(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "20") int size) {
        log.debug("REST request to get Books rank pagination");

        Pageable paging = PageRequest.of(page, size);
        var response = entityService.getPagination(paging);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
