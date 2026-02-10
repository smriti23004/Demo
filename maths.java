interface MathOperation{
    public int operate(int a,int b);
}

public class maths {
    public static void main(String[] args){
        MathOperation add = (a,b)->a+b;

        MathOperation max = (a,b)->Math.max(a,b);

        MathOperation Power =(a,b)->(int)Math.pow(a,b);

        System.out.println("addition:"+add.operate(5,3));
        System.out.println("maximum:"+max.operate(5,3));
        System.out.println("Power :"+Power.operate(5,3));
    }

}
