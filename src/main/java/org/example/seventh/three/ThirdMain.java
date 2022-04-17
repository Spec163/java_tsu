package org.example.seventh.three;

public class ThirdMain {
  public static void main(String[] args) {
    final String input = "Россия, Самарская область, Тольятти, Белорусская, 16в, УЛК, 313";
    final String regex = input.replaceAll("[А-Яа-яA-Za-z0-9-]", "");
    final Address address = new Address(input, String.valueOf(regex.charAt(0) + " "));

    System.out.println(address);
  }
}
