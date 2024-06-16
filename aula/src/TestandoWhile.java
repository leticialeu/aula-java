
    import java.util.Locale;
    import java.util.Scanner;
    
    public class TestandoWhile {
        
    public static void main(String[] args) {
            
            
            Locale.setDefault(Locale.US);
            
            Scanner leia = new Scanner(System.in);
            
            double n1, n2;
            String operador; 
            char decisao = 's';
            
            while (decisao == 's') {
                        
                System.out.println("---- Calculadora que calcula! ----");
                
                System.out.print("Digite um número: ");
                n1 = leia.nextDouble();
                
                System.out.print("Digite outro número: ");
                n2 = leia.nextDouble();
                
                leia.nextLine();
                
                System.out.println();
                System.out.print("Qual operadação deseja efetuar (+ - * / ^)? ");
                operador = leia.nextLine();
                System.out.println();
                
                switch (operador) {
                
                case "+":
                    System.out.print("Soma = " + (n1+n2));
                break;
                
                case "-":
                    System.out.print("Subtração = " + (n1-n2));
                break;
    
                case "*":
                    System.out.print("Multiplicação = " + (n1*n2));
                break;
                
                case "/":
                    if (n2 != 0) {
                        System.out.print("Divisão = " + (n1/n2));
                        
                    } 
                    


                    else {
                        System.out.print("Imporssível dividir por ZERO!");
                    }
            
                break;
                case "p":
                System.out.println("potencia=" + Math.pow(n1,n2) );
                break;
               
                default:
                    System.out.print("Deixe de ser burro e digite um operador correto! kct!!");
                break;
                    
                }
                
                System.out.println();
                System.out.print("Deseja continuar (s/n)");
                decisao = leia.next().charAt(0);
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
            }
            
                    
            leia.close();
    
        }
        
    
    }

