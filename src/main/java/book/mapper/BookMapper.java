package book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import book.dto.BookDto;

@Mapper
public interface BookMapper {
	List<BookDto> selectBookList();

	void insertBook(BookDto bookDto);

	void deleteBook(int bookId);

	BookDto selectBookDetail(int bookId);

	void updateBook(BookDto bookDto);
}
 