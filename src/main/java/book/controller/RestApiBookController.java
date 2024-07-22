package book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.dto.BookDto;
import book.service.BookService;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class RestApiBookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<BookDto> openBoardList(HttpServletRequest request) throws Exception {
		return bookService.selectBookList();
	}

	@PostMapping("/book/write")
	public void insertBook(@RequestBody BookDto bookDto) throws Exception {
		bookService.insertBook(bookDto);
	}
	
	@GetMapping("/book/{bookId}")
	public BookDto openBookDetail(@PathVariable("bookId") int bookId) throws Exception {
		return bookService.selectBookDetail(bookId);
	}
	
	@PutMapping("/book/{bookId}")
	public void updateBook(@PathVariable("bookId") int bookId, @RequestBody BookDto bookDto) throws Exception {
		bookDto.setBookId(bookId);
		bookService.updateBook(bookDto);
	}
	
	@DeleteMapping("/book/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) throws Exception {
		bookService.deleteBook(bookId);
	}
	
	
}
