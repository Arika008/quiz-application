
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int nums[]={1,0,1,0,1};
		int goal=2;
		int i=0,j=0,c=0,sum=0;
        int n=nums.length;
        while(j<n){
            sum+=nums[j];
            if(sum==goal){
                c++;
            }
           
            else if(sum>goal){
               while(sum>goal){
                    sum-=nums[i];
                    if(sum==goal){
                        c++;
                    }
                    i++;
               }
            //    j++;
            }
            j++;
            
        }
        System.out.println(c);
	}
}

