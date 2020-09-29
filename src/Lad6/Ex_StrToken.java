package Lad6;

import java.util.StringTokenizer;

public class Ex_StrToken {
    public static void  main (String[] args){

       String msg = "My mom is 45 years old. She is very nice and kind." +
               " She has short brown hair. She works as a nurse in the local hospital. " +
               "She loves to cook delicious food. She does all the housework. She tells me bed time stories." +
               " My mom is best. I love her very much.";
       System.out.println(msg.length());


        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); //return word count as integer



        while (myToken.hasMoreElements()){
            System.out.println(myToken.nextElement());
        }


    }
}
