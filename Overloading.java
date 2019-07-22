public class Overloading {
    public static void main(String[] args) {
     hirepurchase(3000,4,500);
             compoundinterest(5600,10,6);
                     areaofrectangle(45,31);
                             cubeofnumber(6,6,6);

    }
    public static void hirepurchase(float deposit,float time_in_months,float instalments){
        float amount=(deposit+instalments*time_in_months);
        System.out.println("your hirepurchase is "+amount);
    }
    public static void compoundinterest(double p,double r,double t){
        double interest=(p*t*r/100);
        System.out.println("your compound interest is "+interest);
    }
    public  static void areaofrectangle(int l,int w){
        int area=(l*w);
        System.out.println("your area is "+area);
    }
    public static void cubeofnumber(int p,int q,int z){
        int result=(p*q*z);
        System.out.println("the cube is " +result);
    }
}
