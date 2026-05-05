import java.util.Scanner;
import metodos.Insertion;
import metodos.Shell;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("PROGRAMA DE ORDENAMIENTO:");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                boolean insertionAsc = false;
                boolean shellAsc = false;
                boolean entradaValida = false;

                entradaValida = false;
                while(!entradaValida){
                    System.out.println("Insercion ascendente? (true/false)");
                    String valor = sc.next();
                    if(valor.equals("true")){
                        insertionAsc = true;
                        entradaValida = true;
                    }else if(valor.equals("false")){
                        insertionAsc = false;
                        entradaValida = true;
                    }else{
                        System.out.println("Valor inválido. Debe ingresar exactamente true o false tal cual.");
                    }

                }

                entradaValida = false;
                while(!entradaValida){
                    System.out.println("Shell ascendente? (true/false)");
                    String valor = sc.next();
                    if(valor.equals("true")){
                        shellAsc = true;
                        entradaValida = true;
                    }else if(valor.equals("false")){
                        shellAsc = false;
                        entradaValida = true;
                    }else{
                        System.out.println("Valor inválido. Debe ingresar exactamente true o false tal cual.");
                    }

                }

                Insertion.sort(arreglo, insertionAsc);
                Shell.sort(arreglo,shellAsc);
            
            }else if(opcion==2){
                System.out.println("Programa finalizado");
            }else{
                System.out.println("Opción incorrecta. Ingresar 1 o 2.");
            }
        }while(opcion!=2);
    }
}
