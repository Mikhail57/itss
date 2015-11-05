/**
 * Created by Mikhail on 10/31/2015.
 */

public class Fraction {
    int n, d;

    Fraction (int num, int den)
    {
        n = num;
        d = den;
    }
    Fraction (Fraction x)
    {
        n = x.getNum();
        d = x.getDen();
    }
    public int getNum(){
        return n;
    }
    public int getDen(){
        return d;
    }
    public Fraction Simplify()
    {
        int tempN = n, tempD = d;
        if (n<0) tempN = -n;
        if (d<0) tempD = -d;
        int GCD = gcd(tempN, tempD);
        return new Fraction((n/GCD), (d/GCD)).RightFormat();
    }

    public String toString()
    {
        return n + "/" + d;
    }

    public Fraction Multiply(Fraction x)
    {
        return new Fraction(n*x.n, d*x.d).Simplify();
    }

    public Fraction Divide(Fraction x)
    {
        return new Fraction(n*x.d, d*x.n).Simplify();
    }
    public Fraction Abs(){
        return new Fraction(Math.abs(n), Math.abs(d)).Simplify();
    }


    public Fraction RightFormat(){
        int tempN = n;
        int tempD = d;
        if (tempD<0){
            tempN *= -1;
            tempD *= -1;
        }
        return new Fraction(tempN, tempD).Simplify();
    }

    public Fraction Add(Fraction x){
        int LCM = lcm(d, x.getDen());
        int tempN;
        tempN = (n*(LCM/d)) + (x.getNum()*(LCM/x.getDen()));

        Fraction temp = new Fraction(tempN, LCM);
        temp = temp.Simplify();

        return temp;
    }
    public Fraction Sub(Fraction x){
        int LCM = lcm(d, x.getDen());
        int tempN;
        tempN = (n*(LCM/d)) - (x.getNum()*(LCM/x.getDen()));

        Fraction temp = new Fraction(tempN, LCM);
        temp = temp.Simplify();

        return temp;
    }
    public boolean equals(Fraction frac) {
        Fraction temp1 = frac.Simplify().RightFormat();
        Fraction temp2 = new Fraction(n, d);
        temp2 = temp2.Simplify().RightFormat();
        return (temp1.getNum()==temp2.getNum() && temp1.getDen()==temp2.getDen());
    }
    public void fromString(String strFrac) {
        int separator = -1;
        if (!(strFrac.contains("/")||strFrac.contains("\\"))){
            strFrac.replace('\\', '/');
            separator = strFrac.indexOf("/");
            System.out
        }
    }


    private int gcd(int m, int n){
        if (m == 0){
            return n;
        }
        if (n == 0){
            return m;
        }
        if (m == n){
            return n;
        }

        if ((m == 1)||(n == 1)){
            return 1;
        }

        if (m%2 == 0){
            if (n%2 == 0){
                return 2*gcd(m/2, n/2);
            } else {
                return gcd(m/2, n);
            }
        } else {
            if (n%2 == 0){
                return gcd(m, n/2);
            } else {
                if (n>m){
                    return gcd((n-m)/2, m);
                } else {
                    return gcd((m-n)/2, n);
                }
            }
        }
    }

    private int lcm(int a, int b){
        int tempA=a, tempB=b;
        if (tempA<0) tempA *= -1;
        if (tempB<0) tempB *= -1;
        int GCD = gcd(tempA, tempB);
        return Math.abs(tempA*tempB)/(GCD);
    }
}
