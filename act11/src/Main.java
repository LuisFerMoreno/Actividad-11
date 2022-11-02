import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circle cir = new Circle();
        Triangle tri = new Triangle();
        Square sqr = new Square();

        int operador;
        Double r,lado,b,h ;
        int figura;

        System.out.println("Por favor ingrese que propiedad desea calcular ");
        System.out.println("1.-Area");
        System.out.println("2.-Perimetro");

        operador = scan.nextInt();

        if (operador == 1){
            System.out.println("Por favor ingrese que figura desea calcular ");
            System.out.println("1.- Circulo ");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Triangulo ");
            figura=scan.nextInt();


            if (figura==1){
              System.out.println("Por favor ingrese el atributo");
               r=scan.nextDouble();
                cir.getAreaCir(r);
            }
            if (figura==2){
                System.out.println("Por favor ingrese el atributo");
                lado=scan.nextDouble();
                sqr.getAreaSqr(lado);
            }
            if (figura==3){
                System.out.println("Por favor ingrese la base");
                b=scan.nextDouble();
                System.out.println("Por favor ingrese la altura");
                h=scan.nextDouble();
                tri.getAreaTri(b,h);
            }
        }
        if (operador == 2){
            System.out.println("Por favor ingrese que figura desea calcular ");
            System.out.println("1.- Circulo ");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Triangulo ");
            figura=scan.nextInt();


            if (figura==1){
                System.out.println("Por favor ingrese el atributo");
                r=scan.nextDouble();
                cir.getPerimeterCir(r);
            }
            if (figura==2){
                System.out.println("Por favor ingrese el atributo");
                lado=scan.nextDouble();
                sqr.getPerimeterSqr(lado);
            }
            if (figura==3){
                System.out.println("Por favor ingrese la base");
                b=scan.nextDouble();
                System.out.println("Por favor ingrese el lado");
                lado=scan.nextDouble();
                tri.getPerimeterTri(b,lado);
            }
        }




}


}
 class Circle implements Shape{
    double P;
    double pe = 3.1415;
    double A;

    public void getPerimeterCir(Double r) {

        P = 2*pe*r;
        System.out.println("Su perimetro es "+P);
    }

    public void getAreaCir(Double r) {
        A = pe*Math.pow(r,2);
        System.out.println("Su area es "+A);
    }

     @Override
     public void getAreaTri(Double b, Double h) {

     }

     @Override
     public void getPerimeterTri(Double b, Double h) {

     }

     public void getAreaSqr(Double l) {
         A = l*l*l*l;
         System.out.println("Su area es "+A);
     }

     @Override
     public void getPerimeterSqr(Double l) {

     }
 }
class Triangle implements Shape{
    double A,P;
    @Override
    public void getAreaCir(Double r) {

    }

    @Override
    public void getPerimeterCir(Double r) {

    }

    public void getPerimeterTri(Double b,Double l) {
        P = b+l+l;
        System.out.println("Su perimetro es "+ P);
    }
    @Override
    public void getAreaTri(Double b, Double h) {
        A = (b*h)/2;
        System.out.println("Su area es "+ A);
    }


    public void getAreaSqr(Double l) {
        A = l*l*l*l;
        System.out.println("Su area es "+A);
    }

    @Override
    public void getPerimeterSqr(Double l) {

    }
}

class Square implements Shape{
    double A,P;
    @Override
    public void getAreaCir(Double r) {
    }

    @Override
    public void getPerimeterCir(Double r) {
    }
    @Override
    public void getAreaTri(Double b, Double h) {
    }
    @Override
    public void getPerimeterTri(Double b, Double l) {
    }
    public void getAreaSqr(Double l) {
        A = l*l;
        System.out.println("Su area es "+A);
    }
    public void getPerimeterSqr(Double l) {
        P = l+l+l+l;
        System.out.println("Su perimetro es "+P);
    }
}