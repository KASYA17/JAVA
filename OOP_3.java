public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,3);
        rec.s();
        rec.p();
    }
}

class Rectangle{
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void s(){
        System.out.println("Площадь прямоугольника = " + (a*b));
    }
    public void p(){
        System.out.println("Периметр прямоугольника = " + (2*a+2*b));
    }
}