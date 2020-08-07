class Calculator{
 public void add(int a,int b){
 System.out.println("sum= "+(a+b));
 }
 
  public void diff(int a,int b){
 System.out.println("Difference= "+(a-b));
 }
 

  public void prod(int a,int b){
 System.out.println("Product= "+(a*b));
  }
  public void division(int a,int b){
 System.out.println(" Quotient = "+(a/b));

 }
 public static void main(String args[]){
  add(10,20);
  diff(50,2);
  prod(23,3);
  divisions(25,3); 
}
}
