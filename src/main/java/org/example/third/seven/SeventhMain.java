package org.example.third.seven;

import java.util.Arrays;
import java.util.Date;

public class SeventhMain {

  private static final Book[] books = new Book[]{
      new Book("1984", "Джордж Оруэлл"),
      new Book("451 градус по Фаренгейту", "Рэй Брэдбери"),
      new Book("Преступление и Наказание", "Фёдор Достоевский"),
      new Book("Преключения Шерлока Холмса", "Артур Конан Дойл")
  };

//  private static String[] booksTitles = Arrays.stream(books).map(Book::getTitle).toArray(String[]::new);

  private static String[] booksTitles = new String[] {
      "Книга1", "Книга 2", // и тд
  };

  public static void main(String[] args) {
    final Reader firstReader =
        new Reader("Горбатюк А.А.", "ПМИ", new Date(2001, 5, 28), "00000");

    firstReader.takeBook(books);
    firstReader.takeBook(booksTitles);
    firstReader.takeBook(5);

    firstReader.returnBook(books);
    firstReader.returnBook(booksTitles);
    firstReader.returnBook(11);
  }
}
