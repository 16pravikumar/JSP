// Find the word count frequency in the sentence
import java.util.*;
public class FinalCountWords{
    public static void main(String args[]){
       String str="I I love love you";
       String split[]=str.split(" ");
       int len=split.length;
       HashMap<String,Integer> list=new HashMap<String,Integer>();
       for(int i=0;i<len;i++)
       {
        int count=0;
            for(int j=0;j<len;j++)
            {
               
               
                if(split[i].equals(split[j]))
                {
                    count++;
                }
            }list.put(split[i],count);
       } System.out.println(list);
    }
}
//Outpt
//{love=2, I=2, you=1}
