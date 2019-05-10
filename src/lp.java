public class lp {
    private double a;
    private double b;
    private double c;
    
    public void setA(double a) {
        if (a > 0) this.a = a;
    }
    public void setB(double b) {
        if (b > 0) this.b = b;
    }
    public void setC(double c) {
        if (c > 0) this.c = c;
    }
    
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    
    boolean check() {
        boolean flag = true;
        if (a > (b + c)) flag = false;
        if (b > (a + c)) flag = false;
        if (c > (b + c)) flag = false;
        return flag;
    }
    
    public double perimeter() {
        return a + b + c;
    }
    
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public double ma() {
        return Math.sqrt(2 * c * c + 2 * b * b - 2 * a * a);
    }
    public double mb() {
        return Math.sqrt(2 * c * c + 2 * a * a - 2 * b * b);
    }
    public double mc() {
        return Math.sqrt(2 * a * a + 2 * b * b - 2 * c * c);
    }
    
    
    public double ha() {
        return (2 * area()) / a;
    }
    public double hb() {
        return (2 * area()) / b;
    }
    public double hc() {
        return (2 * area()) / c;
    }
}
