package com.FSProject.BookStore.controller;

import com.FSProject.BookStore.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @GetMapping(path = "/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto bookDto = BookDto.builder()
                                    .title("My First Book Title")
                                    .build();

        List<BookDto> bookDtoList = new ArrayList<>();
        bookDtoList.add(bookDto);
        return new ResponseEntity<>(bookDtoList, HttpStatus.OK);
    }

}
