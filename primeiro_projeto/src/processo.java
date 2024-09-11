public class processo {
    public double a;
    public double b;
    public double c;
    public double delta;
    public double x;
    public double y;
    public void calcula(){
        delta = Math.pow(b, 2) -(4 * a * c);
        if(delta > 0){
            x = (-b + Math.sqrt(delta)) / (2 * a);
            y = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Resultado: " + x + y);
        } else if(delta == 0){
            System.out.println("Raízes iguais: " + x + y);
        } else{
            System.out.println("Não Há Raiz!");
        }
    }
}