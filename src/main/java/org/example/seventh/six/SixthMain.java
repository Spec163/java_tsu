package org.example.seventh.six;

import java.util.Locale;

public class SixthMain {

  public static void main(String[] args) {
    final String word = "Java";
    final String sentence = "I like Java!!!";
    System.out.println("Последний символ: " + sentence.charAt(sentence.length() - 1));

    if (sentence.endsWith("!!!")) {
      System.out.println("Предложение заканчивается на !!!");
    }

    if (sentence.startsWith("I like")) {
      System.out.println("Предложение начинается с 'I like'");
    }

    if (sentence.contains(word)) {
      System.out.println("Предложение содержит слово " + word);
    }

    System.out.println("Позиция слова Java в предложении " + sentence.indexOf(word));

    System.out.println("Заменяем буквы: " + sentence.replaceAll("a", "o"));

    System.out.println(sentence.toUpperCase(Locale.ROOT));
    System.out.println(sentence.toLowerCase(Locale.ROOT));

    System.out.println("Вырезанная строка: " + sentence.substring(sentence.indexOf(word), sentence.indexOf(word) + word.length()));

  }

  private static void getLastSymbol(final String sentence) {
    System.out.println("Наше предложение: " + sentence);
  }
}
