package metodos;

public class Insertion {
    public static int[] sort(int[] arreglo, boolean asc){
        int[] arr = new int[arreglo.length];
        for(int i=0; i<arreglo.length; i++){
            arr[i] = arreglo[i];
        }

        int comparaciones = 0;
        int cambios =0;
        int iteraciones=0;

        System.out.println("\nMETODO INSERCION");
        System.out.println("\nArreglo originial:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "   ");
        }
        System.out.println();

        for(int i=1; i<arr.length; i++){
            iteraciones++;
            System.out.print("\nI"+i+"  ");
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j] + " ");
            }

            int k=i;
            while(k>0){
                comparaciones++;
                int a = k-1;
                int b= k;
                boolean intercambio;

                if(asc){
                    intercambio = arr[a] > arr[b];
                }else{
                    intercambio = arr[a] < arr[b];
                }

                System.out.println("     a = " + a + " b = " + b + " [a] = " + arr[a] + " arr[b] = " + arr[b]+ " cambio = " + (intercambio ? "si" : "no"));
                if(intercambio){
                    int aux = arr[a];
                    arr[a] = arr[b];
                    arr[b] = aux;
                    cambios++;

                    System.out.print("   ");
                    for(int l=0; l<a; l++){
                        System.out.print("   ");
                    }
                
                    System.out.print(arr[a] + "  " + arr[b] + "  ");
                    k--;
                }else{
                    break;
                }
            }
        }

        System.out.print("\nend   ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("\nComparaciones: " + comparaciones);
        System.out.println("\nCambios: " + cambios);
        System.out.println("\nIteraciones: " + iteraciones);
        System.out.println();
        int[] resultado = {comparaciones, cambios, iteraciones};
        return resultado;
    }    
}

 