public class Calculator {

    public int add(int a,int b){

        return a+b;
    }
    public int multiply(int a,int b){

        return a*b;
    }
    public int Square(int a){

        return a*a;
    }

    public static void main(String[]args){

        Calculator calc=new Calculator();

        // calculate the expression (3 ∗4+5∗7)^2

        int ex1=calc.multiply(3,4);
        int ex2=calc.multiply(5,7);
        int sum1=calc.add(ex1, ex2);
        int squ=calc.Square(sum1);

        System.out.println("Answer for expression (3 *4+5*7)^2 :"+squ);

        //calculate the expression  (4 +7)^2 +(8+3)^2

        int ex3=calc.add(4,7 );
        int squ1=calc.Square(ex3);
        
        int ex4=calc.add(8,3);
        int squ2=calc.Square(ex4);
        
        int express2=calc.add(squ1,squ2);

        System.out.println("Answer for expression (4 +7)^2 +(8+3)^2 :"+express2);

    }
    
}
