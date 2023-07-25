import java.util.*;
import java.io.*;
class Passwordstableorunstable{public static int findPassword(int input1,int input2,int input3,int input4,int input5){
        int sum=0;
        sum=cal(input1,sum);
        sum=cal(input2,sum);
        sum=cal(input3,sum);
        sum=cal(input4,sum);
        sum=cal(input5,sum);
        return sum;
        
    }
    static int cal(int input,int sum){
        int rem;
        int num=input,num1=input;
        int i=0;
        String s="";
        while(num!=0){
            num=num/10;
            i++;
        }
        int j=0;
        int arr[]=new int[i];
        while(input!=0){
            rem=input%10;
            arr[j]=rem;
            input=input/10;
            j++;
        }
        int temp=0;
        int ctr=0;
        for(int k=0;k<arr.length;k++){
            ctr=0;
            for(int l=0;l<arr.length;l++){
                if(k==l){
                    continue;
                }
                if(arr[k] == arr[l]){
                    ctr++;
                }

            }
            if(k==0){
                temp=ctr;
            }
            else{
                  if(temp != ctr){
                    s="unstable";
                     break;
            }
            }
          
        }
        if(!s.equals("unstable")){
            sum =sum + num1;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(findPassword(12,1313,122,678,898));
    }
}
