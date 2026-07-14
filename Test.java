public class Test {

  static void add(){

    int a=50;
    int b=70;
    int result = a+b;
    System.out.println("The sum is " +result);
    
  }
  static void sub(){

    int c=20;
    int d=10;
    int result1 = c-d;
    System.out.println("The diff is " +result1);
    
  }

   static void multi(){

    int x=5;
    int y=8;
    int result2 = x*y;
    System.out.println("The multiplcation result is: " +result2);
    
  }

  static void div(){

    int s=10;
    int t=5;
    int result3 = s/t;
    System.out.println("The division result is: " +result3);
    
  }

  public static void main(String[] args)
  {
    add();
    sub();
    multi();
    div();
  }
}
