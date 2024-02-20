package Single_Responsibility.xodimlar.kalkulyator;

public class Hisoblash {
    public  int qushish(int a,int b){
        return a+b;
    }
    public  int ayrish(int a,int b){
        return a-b;
    }
    public  long kupaytirsh(int a,int b){
        return a*b;
    }
    public  int bulish(int a,int b){
        if(b==0){
            throw  new ArithmeticException(" bo`luvchi nol bulish mumkin emas.!!!!!!!!!!");
        }
        return a/b;
    }
}
