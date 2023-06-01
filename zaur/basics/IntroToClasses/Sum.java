public class Sum {
  void sum() {
    System.out.println("No params: 0");
  }

  void sum(int a) {
    System.out.println("Sum of one param: " + a);
  }

  void sum(int a, int b) {
    System.out.println("Two params " + (a + b));
  }

  void sum(int a, int b, int c) {
    System.out.println("Three params " + (a + b + c));
  }

  void sum(int a, int b, int c, int d) {
    System.out.println("Four params " + (a + b + c + d));
  }

  public static void main(String[] args) {
    Sum sum1 = new Sum();
    sum1.sum();
    sum1.sum(1);
    sum1.sum(1, 2);
    sum1.sum(1, 2, 3);
    sum1.sum(1, 2, 3, 4);
  }
}
