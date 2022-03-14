package org.example.second;

public class Main {

  public static void main(String[] args) {

    int hexA = 0x1a;//0х - префикс 16системы
    int hexB = 0xb;
    //toHexString - Возвращает строку шестнадцатеричное представление числа.
    System.out.println(Integer.toHexString(hexA) + " + "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA + hexB));
    System.out.println(Integer.toHexString(hexA) + " - "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA - hexB));
    System.out.println(Integer.toHexString(hexA) + " * "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA * hexB));
    System.out.println(Integer.toHexString(hexA) + " / "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA / hexB));
    //Декремент --
    System.out.println("--" + Integer.toHexString(hexA) + " = "
        + Integer.toHexString(--hexA));
    hexA++;
    //Инкремент ++
    System.out.println("++" + Integer.toHexString(hexA) + " = "
        + Integer.toHexString(++hexA));
    hexA--;
    //~ — побитовый оператор “НЕ”
    System.out.println("~" + Integer.toHexString(hexA) + " = "
        + Integer.toHexString(~hexA));
    //& — побитовый оператор “И”
    System.out.println(Integer.toHexString(hexA) + " & "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA & hexB));
    //ИЛИ
    System.out.println(Integer.toHexString(hexA) + " | "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA | hexB));
    //^ — побитовое исключающее “ИЛИ”
    System.out.println(Integer.toHexString(hexA) + " ^ "
        + Integer.toHexString(hexB) + " = "
        + Integer.toHexString(hexA ^ hexB));
    System.out.println(Integer.toHexString(hexA) + " << "
        + Integer.toHexString(2) + " = "
        + Integer.toHexString(hexA << 2));
    hexA = 0x1a;
    System.out.println(Integer.toHexString(hexA) + " >> "
        + Integer.toHexString(2) + " = "
        + Integer.toHexString(hexA >> 2));
    hexA = 0x1a;
    System.out.println(Integer.toHexString(hexA) + " >>> "
        + Integer.toHexString(2) + " = "
        + Integer.toHexString(hexA >>> 2));
    System.out.println("|_|_|_|_|_|_|_|ЗАДАНИЕ 3|_|_|_|_|_|_|_|");
    System.out.println("Введите три числа");
    ScannerNumber.average();
    ScannerNumber.max();
    System.out.println("|_|_|_|_|_|_|_|ЗАДАНИЕ 4|_|_|_|_|_|_|_|");
    GenerateTheArray.Generate();
    System.out.println("|_|_|_|_|_|_|_|ЗАДАНИЕ 5|_|_|_|_|_|_|_|");
    new Fibonacci(5).print();
    System.out.println("|_|_|_|_|_|_|_|ЗАДАНИЕ 6|_|_|_|_|_|_|_|");
    new Pascal(5).print();
  }
}

