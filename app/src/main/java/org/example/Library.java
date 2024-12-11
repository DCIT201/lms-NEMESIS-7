package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {
    //map to store patronDB
    private final Map<String, Patron> patronDB = new HashMap<>();
    private final Map<String, Book> booksDb = new HashMap<>();

    public Library(Map<Integer, Patron> patronDB, Map<Integer, Book> booksDb) {
    }

    public void addPatron(Patron patron) {
        patronDB.put(patron.getPatronID(),patron);
    }
    public void addBook(Book book) {
        booksDb.put(book.getBookISBN(),book);
    }
    public Optional<?> findObjectByNameOrTitle(Object object) {
        if(object instanceof Patron patron) {
            patronDB.values()
                    .stream()
                    .filter(p -> p.getPatronName().equals(((Patron) object).getPatronName()))
                    .toList()
                    .forEach(System.out::println);

        }else if(object instanceof Book book) {
            booksDb.values()
                    .stream()
                    .filter(b -> b.getTitle().equals(((Book) object).getTitle()))
                    .toList()
                    .forEach(System.out::println);
        }
        return Optional.empty();
    }
    public Optional<Book> findBookByISBN(String isbn) {
        return Optional.ofNullable(booksDb.get(isbn));
    }
    /*public Optional<Patron> findPatronByName(String name) {
        return Optional.ofNullable(patronDB.get(name));
    }*/
    public List<Book> findBookByTitle(String title) {
        return booksDb.values()
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .toList();
    }
    public List<Patron> findPatronByName(String patronName) {
        return patronDB
                .values()
                .stream()
                .filter(patron -> patron.getPatronName().equals(patronName))
                .toList();
    }
}
