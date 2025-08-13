public class al02A {
    public static void main(String[] args) {
        int xS = 10;
        int yS = 3;

        //x = x + y; //10 + 3 = 13
        xS += yS; //10 + 3 = 13
        System.out.println(xS);

        int xSub = 10; 
        int ySub = 5;

        //x = x - y; //10 - 5 = 5
        xSub -= ySub;

        System.out.println(xSub);

        int xM = 10;
        int yM = 4;
        //x = x * y; //10 * 4 = 40
        xM *= yM;       
        System.out.println(xM);

        double xD = 10;
        double yD = 2;
        //x = x / y; //10 / 2 = 5
        xD /= yD;       
        System.out.println(xD);

        int xR = 10;
        int yR = 3;     
        //x = x % y; //10 % 3 = 1
        xR %= yR;
        System.out.println(xR);
    }
    
}
