public class test{
    public static void main(String[] args) {
        int result = sum(3);
        System.out.println(result);
        int result1 = sum(4);
        System.out.println(result1);
        int result2 = sum(5);
        System.out.println(result2);
      }
      public static int sum(int k) {
        if (k > 0) {  //This is called Halting Condition.
          return k + sum(k - 1 );
        } else {
          return 0;
        }
      }
}