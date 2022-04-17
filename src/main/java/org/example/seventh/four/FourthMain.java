package org.example.seventh.four;

import java.util.ArrayList;
import java.util.List;

public class FourthMain {
  public static void main(String[] args) {
    final List<Shirt> shirts = new ArrayList<Shirt>() {{
      add(new Shirt("111", "some1", "red", "1000"));
      add(new Shirt("222", "some2", "blue", "999"));
      add(new Shirt("333", "some3", "white", "333"));
      add(new Shirt("444", "some4", "black", "20020"));
    }};

    System.out.println(shirts.toString());

  }
}
