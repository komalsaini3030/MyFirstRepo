class Calculator{
 public static void add(int a,int b){
 System.out.println("sum= "+(a+b));
 }
 
  public static void diff(int a,int b){
 System.out.println("Difference= "+(a-b));
 }
 

  public static void prod(int a,int b){
 System.out.println("Product= "+(a*b));
  }
  public static  void division(int a,int b){
 System.out.println(" Quotient = "+(a/b));

 }
 public static void main(String args[]){
  add(10,20);
  diff(50,2);
  prod(23,3);
  division(25,3); 
 System.out.println(" All methods run successfully");
   System.out.println(" checking functioning of All methods");
  
}
}
