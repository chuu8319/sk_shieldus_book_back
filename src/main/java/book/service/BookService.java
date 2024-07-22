package book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import book.dto.BookDto;

@Service
public interface BookService {
	List<BookDto> selectBookList();

	void insertBook(BookDto bookDto);

	void updateBook(BookDto bookDto);

	BookDto selectBookDetail(int bookId);

	void deleteBook(int bookId);

}
