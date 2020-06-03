package codewithdeepunderstandingandplayaround;

class Error11 {
	 final String message(){
     return "Hello!";
  }
 }

 class errornew extends Error11 {
 public static void main(String[] args) {
   //   System.out.println(message());  // compilation error
  }

// String message(){
  //   return "World!";
 // }
 }