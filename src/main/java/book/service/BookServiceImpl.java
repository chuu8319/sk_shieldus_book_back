package book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.dto.BookDto;
import book.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<BookDto> selectBookList() {
		
		return bookMapper.selectBookList();
	}

	@Override
	public void insertBook(BookDto bookDto) {
		bookMapper.insertBook(bookDto);
		
	}

	@Override
	public void updateBook(BookDto bookDto) {
		bookMapper.updateBook(bookDto);
	}

	@Override
	public BookDto selectBookDetail(int bookId) {
		BookDto bookDto = bookMapper.selectBookDetail(bookId);
		
		return bookDto;
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookMapper.deleteBook(bookId);
		
	}

}
