package Lad6;

public class Ex_StrBuff {
    public static void  main (String [] args){
        StringBuffer strbuf  = new StringBuffer(); // null
        strbuf.append("I studying at RUTS");
        System.out.println(strbuf.length());

        strbuf.append("2020");
        System.out.println(strbuf);

        strbuf.insert(0,"My name is OIL. ");
        System.out.println(strbuf);

        strbuf.delete(5,10);
        System.out.println(strbuf);




    }//main



}
