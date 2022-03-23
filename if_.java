public class  if_ {

  public static void main(String []args) {
    // and = && , or = // , not = !
     int score = 95;
    // if (score > 80 ){
    //   System.out.println("Great!");    
    // }else if ( score > 60) {  
    //  System.out.println("good!"); 
    // }else{
    //  System.out.println("so..so..");    
    // }

    String msg = score > 80 ? "Great!" : "so..so..";
    System.out.println(msg);   

  }
}