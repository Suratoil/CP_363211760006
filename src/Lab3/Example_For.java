package Lab3;
//ให้พิมข้อความ "Hello"10 ครั้งแสดงทางจอภาพ
public class Example_For {

    public static void main(String[] args){
        for (int i = 0; i <10;i++){
            System.out.println(i+"Hello");
        }
        //พิมพ์เฉพาะเลขคู่
        for (int i =1; i <=10; i++){
            if (i%2 == 0)
            System.out.println(i);

        }
        //1-100 /3/5/7/9  21/3
        for (int i =1; i <=100; i++){
            if (i%3==0 && i%5==0 ){
                System.out.println(i);
            }
        }
        for (int i = 1; i <=100; i++){
            if(i%3 == 0){
                if(i%5 == 0)
                    System.out.println(i);
            }
        }
    }//main
}//class
