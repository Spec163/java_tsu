package org.example.seventh.one;

public class FirstMain {

  private static final String[] queries = {
      "1, Артём, Горбатюк, ПМИб, 0",
      "1, Кто-то, Кто-тов, ПМИб, 17",
      "1, Никто, Никтотов, ПМИб, 2",
  };
  public static void main(String[] args) {
    final int allowedDebts = 7;
    final TStudent[] students = new TStudent[queries.length];
    for (int i = 0; i < queries.length; i++) {
      try {
        students[i] = new TStudent(queries[i]);
      } catch (RuntimeException re) {
        re.printStackTrace();
      }
    }
    final TGroup[] groups = new TGroup[students.length];
    for (int i = 0; i < students.length; i++) {
      if (students[i].getNumberOfDebt() > allowedDebts) {
        groups[i] = new TGroup(
            students[i].getStudentId(),
            students[i].getFirstName(),
            students[i].getLastName(),
            students[i].getGroupId()
        );
      }
    }
    System.out.println("Должники:\n");
    for (int i = 0; i < students.length; i++) {
      System.out.println(groups[i]);
    }
  }
}
