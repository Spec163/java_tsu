package org.example.seventh.nine;

public class Ninth {
  public static void main(String[] args) {
    System.out.println(get2CharFromString("string"));
    System.out.println(get2CharFromString("code"));
    System.out.println(get2CharFromString("Practice"));
  }

  public static String get2CharFromString (String str) {
    if (str == null || str.length() % 2 != 0) {
      System.out.println("Invalid string!");
      return null;
    }
    return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
  }
}
