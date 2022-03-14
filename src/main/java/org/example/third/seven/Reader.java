package org.example.third.seven;

import java.util.Date;
import java.util.UUID;

public class Reader {

  private String fullName;
  private Long libraryCardId;
  private String specialization;
  private Date dateOfBirth;
  private String phoneNumber;

  public Reader(
      final String fullName,
      final String specialization,
      final Date dateOfBirth,
      final String phoneNumber
  ) {
    this.fullName = fullName;
    this.libraryCardId = UUID.randomUUID().getLeastSignificantBits();
    this.specialization = specialization;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
  }

  public Reader() {
    this.libraryCardId = UUID.randomUUID().getLeastSignificantBits();
  }

  public Long getLibraryCardId() {
    return libraryCardId;
  }

  public void setLibraryCardId(Long libraryCardId) {
    this.libraryCardId = libraryCardId;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void takeBook(final int numberOfBooks) {
    if (numberOfBooks > 0) {
      System.out.printf("\n %s взял %d книг \n", this.fullName, numberOfBooks);
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }

  public void takeBook(final String[] bookNames) {
    if (bookNames.length > 0) {
      System.out.printf("\n %s взял книги: %s", this.fullName, String.join(", ", bookNames));
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }

  public void takeBook(final Book[] books) {
    if (books.length > 0) {
      final String[] booksTitles = new String[books.length];
      for (int i = 0; i < books.length; i++) {
        booksTitles[i] = books[i].getTitle();
      }
      System.out.printf("\n %s вернул книги: %s", this.fullName, String.join(", ", booksTitles));
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }

  public void returnBook(final int numberOfBooks) {
    if (numberOfBooks > 0) {
      System.out.printf("\n %s вернул %d книг \n", this.fullName, numberOfBooks);
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }

  public void returnBook(final String[] bookNames) {
    if (bookNames.length > 0) {
      System.out.printf("\n %s вернул книги: %s", this.fullName, String.join(", ", bookNames));
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }


  public void returnBook(final Book[] books) {
    if (books.length > 0) {
      final String[] booksTitles = new String[books.length];
      for (int i = 0; i < books.length; i++) {
        booksTitles[i] = books[i].getTitle();
      }
      System.out.printf("\n %s вернул книги: %s", this.fullName, String.join(", ", booksTitles));
    } else {
      System.out.printf("\n %s не взил книги! \n", this.fullName);
    }
  }
}
