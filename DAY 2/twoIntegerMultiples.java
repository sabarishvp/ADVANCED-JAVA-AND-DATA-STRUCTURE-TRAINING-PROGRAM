
public class twoIntegerMultiples {
    public static void main(String[] args) {

        int num1=4, num2=6;
       

        System.out.print("first number: "+num1);
    
        System.out.printf("%nsecond number: "+num2);
        

        boolean multiple = isMultiple(num1,num2);

        if(multiple = true){
            System.out.printf("%n%d and %d are multiples of each other", num1, num2);
        }
        else{
            System.out.printf("%n%d and %d are not multiples of each other", num1, num2);
        }


    }

    public static boolean isMultiple(int num1, int num2){

        int remainder = num1 % num2;
        boolean multiple;

        if (remainder != 0){
            multiple = false;
        }
        else{
            multiple = true;
        }

        return multiple;
    }

}