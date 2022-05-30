package org.example.seventh.seven;

public class StringBuilderCustomization {
  public static String getStringWith2Int (int a, int b, Operations operation) {
    return new StringBuilder()
        .append(a)
        .append(" ")
        .append(operation.getOperation())
        .append(" ")
        .append(b)
        .append(" = ")
        .append(operation.getOperationOf2Int(a, b))
        .toString();
  }

  public static String replaceEqualsCharByInsert(String str) {
    int index = str.indexOf("=");
    return new StringBuilder(str)
        .deleteCharAt(index)
        .insert(index, "равно")
        .toString();
  }

  public static String replaceEqualsCharByReplace (String str) {
    int index = str.indexOf("=");
    return new StringBuilder(str)
        .replace(index, index + 1, "равно")
        .toString();
  }
}
