package org.example.seventh.four;

public class ShirtException extends Throwable {
  public ShirtException(String s, String inputShirt) {
    super(s + inputShirt);
  }
}
