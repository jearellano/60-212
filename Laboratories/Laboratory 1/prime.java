package lab1;

/* James Moore 
Student ID: 104417041
Date: May 9th 2016
*/
public class prime {// begin class 
 
 public static void main(String[] args) {// begin main 
 
     int number = 23; 
     int prime = 0; 
     int tester = number + 1;// check the next number  
     int flag; 
     
     while(prime <= number){ // while the prime is < than number 
         flag = 0; // flag gets set if its not a prime 
         
         for(int i = 2; i < tester; i++){
             if(tester % i == 0){
                 flag = 1; 
                 break; 
             }
         }
         
         if(flag == 1)
         {
             tester++; // check the next number
         }
         else
         {
             prime = tester; // if tester happens to be prime 
         }
     }// end of while 
     
		// print out the next largest prime number 
     System.out.println("The Prime Number Larger than " + number + " is: " + prime); 
     
	}// end main 


}// end class 

