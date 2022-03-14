package org.example.third.three;

import java.util.Date;

public class Human {

  private String name;
  private Address address;
  private Date dateOfBirth;

  public Human(final String name, final Address address, final Date dateOfBirth) {
    this.name = name;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
  }

  public Human(final String name, final String addressName, final Date dateOfBirth) {
    this.name = name;
    this.address = new Address(addressName);
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getFullAddress() {
    return this.address.getFullAddress();
  }

  @Override
  public String toString() {
    return "Human {" +
        "name='" + name + '\'' +
        ", address=" + address.getFullAddress() +
        ", dateOfBirth=" + dateOfBirth +
        '}';
  }
}
