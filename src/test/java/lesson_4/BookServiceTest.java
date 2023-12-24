// Задание 2.
//
//У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
// Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

package lesson_4;

import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class BookServiceTest {
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        BookService bookServiceTesting = new BookService(bookRepositoryMock);
        String bookId = "1";
        String expectedTitle = "Lady with a dog";
        String expectedAuthor = "Chekhov";
        Book expectedBook = new Book(bookId, expectedTitle, expectedAuthor);

    @Test
    public void testBookServiceFindBookById() {
        when(bookRepositoryMock.findById(bookId)).thenReturn(new Book(bookId, expectedTitle, expectedAuthor));
        Book factBook = bookServiceTesting.findBookById(bookId);

        assertEquals(expectedBook.getId(), factBook.getId());

        verify(bookRepositoryMock, times(1)).findById(bookId);
    }

    @Test
    void testBookServiceFindAllBooks() {
        when(bookRepositoryMock.findAll()).thenReturn(new ArrayList<Book>(Arrays.asList(new Book(bookId, expectedTitle, expectedAuthor))));
        assertEquals(1, (bookServiceTesting.findAllBooks()).size());

        verify(bookRepositoryMock , times(1)).findAll();
    }
}