import java.io.*;
import java.util.*;

class UserMainCode
{
    public int secondLastDigit(int input1){
        if(input1<0)
            input1*=-1;
        return (input1/10)%10;
    }
}