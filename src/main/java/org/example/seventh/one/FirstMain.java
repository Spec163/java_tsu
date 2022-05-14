package org.example.seventh.one;

public class FirstMain {

  private static final String[] queries = {
      "1, Артём, Горбатюк, ПМИб, 0",
      "1, Кто-то, Кто-тов, ПМИб, 17",
      "1, Никто, Никтотов, ПМИб, 2",
  };

  private static String createQuery(final TStudent student) {
    return String.format(
        "insert into T_GroupSelected values ('%s', '%s', '%s', '%s');",
        student.getStudentId(),
        student.getFirstName(),
        student.getLastName(),
        student.getGroupId()
        );
  }
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
    for (int i = 0; i < students.length; i++) {
      if (students[i].getNumberOfDebt() > allowedDebts) {
        System.out.println(createQuery(students[i]));
      }
    }
  }
}
