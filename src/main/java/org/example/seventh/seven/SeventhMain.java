package org.example.seventh.seven;

public class SeventhMain {
  public static void main(String[] args) {
    System.out.println(StringBuilderCustomization.getStringWith2Int(3, 56, Operations.SUM));
    System.out.println(StringBuilderCustomization.getStringWith2Int(3, 56, Operations.SUBTRACTION));
    System.out.println(StringBuilderCustomization.getStringWith2Int(3, 56, Operations.MULTIPLICATION));

    System.out.println(StringBuilderCustomization.replaceEqualsCharByInsert(
        StringBuilderCustomization.getStringWith2Int(3, 56, Operations.SUM)));

    System.out.println(StringBuilderCustomization.replaceEqualsCharByReplace(
        StringBuilderCustomization.getStringWith2Int(3, 56, Operations.SUM)));
  }
}
