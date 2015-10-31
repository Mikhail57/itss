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
        return new Fraction((n/GCD), (d/GCD));
    }

    public String toString()
    {
        return n + "/" + d;
    }

    public Fraction Multiply(Fraction x)
    {
        return new Fraction(n*x.n, d*x.d);
    }

    public Fraction Divide(Fraction x)
    {
        return new Fraction(n*x.d, d*x.n);
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
        int GCD = gcd(a, b);
        return Math.abs(a*b)/(GCD);
    }
}
