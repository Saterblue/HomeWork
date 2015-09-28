  /* suppose the MinNumber is X,the people Number is Y;
  I see the question like this:
                    2          times(2):1
                        +1         times(1):1
                    2          times(2):2
                        +1         times(1):2
                    2          times(2):3
                   ...        ......                 
                        ...        times(1):3
                    2          times(2):n
                        +1         times(1):n
                    
                    
It's means that:I break the X as n*2 (maybe is 2*n+1)
when I plus 1,it's will have a Chain reaction:every 2 become 3 and got 1 new bottle;
So,if X is 2*n, I will got (2*n+n)-1 =  3n-1 bottles(decrease 1,because I have borrow 1 bottle to hava the Chain reaction
and in the end,I should return it)
if X is 2*n+1,means 2*(n+1)-1 I will got 2*(n+1)+n+1-2  = 3n+1

So we get this:  
                if( (Y+1)%3==0 ){
                     X= (2*Y+2)/3;
                 }
                 else{
                     X = (2*Y+1)/3; 
                 }


*/
 public class Main{
       public static void main(String[] args){
         
              int man;
              int MinNumber=getMinNumber(man);  
          
        }
 }
  static int getMinNumber(int n){
		int num;
		if((n+1)%3==0){num=(2*n+2)/3;}else{num=(2*n+1)/3;}
		return num;
	}
