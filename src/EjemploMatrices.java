public class EjemploMatrices {
    public static void main(String[] args) {
        String [][] nombres = new String[2][3];
        nombres[0][0] = "pepe";
        nombres[0][1] = "papa";
        nombres[0][2] = "pipi";


        nombres[1][0] = "ajja";
        nombres[1][1] = "boooo";
        nombres[1][2] = "ciii";

        //usando un for normal
        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        //usando foreach
        for (String[] fila: nombres) {
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

        //-----------------------------------------------------------------------------------------------
        //matriz con columnas dinamicas

        int[][] matriz = new int[3][];
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("matriz.length = " + matriz.length);
        System.out.println("fila 0 = " + matriz[0].length);
        System.out.println("fila 1 = " + matriz[1].length);
        System.out.println("fila 2 = " + matriz[2].length);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i+j;
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        //-----------------------------------------------------------------------------------------------
        //buscar un elemento en una matriz

        int [][] matrizEnteros = {
                {35, 90, 3, 1978},
                {15,2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementooBuscar = 15;
        boolean encontrado = false;
        int i = 0;
        int j = 0;
        //usamos una etiqueta para que en el break se salga de los dos for
        etiqueta:
        for( i = 0; i < matrizEnteros.length; i++ ){
            for ( j = 0; j < matrizEnteros[i].length; j++){
                // si fuera matriz de strings se compara con equals o con Compareto
                if (matrizEnteros[i][j] == elementooBuscar){
                    encontrado = true;
                    break etiqueta;
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrado " + elementooBuscar + " en las coordenadas [" + i + "][" + j +"]");
        }else{
            System.out.println("no se encontro en la matriz");
        }

        //-----------------------------------------------------------------------------------------
        //matriz simetrica y transpuesta

        int[][] simetrica  = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean essimetrica = true;
        i=0;

        while(i < simetrica.length && essimetrica == true){
            j=0;
            while (j < i && essimetrica == true){
                if(simetrica[i][j] != simetrica[j][i]){
                    essimetrica = false;
                }
                j++;
            }
            i++;
        }

        //usando foreach para imprimir
        for (int[] fila: simetrica) {
            for (int nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

        if (essimetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }

        // ahora veamos la transpuesta de una matriz

        System.out.println();
        System.out.println("Ejemplo transpuesta");
        int[][] matrizNormal = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Matriz original: ");
        for(i = 0; i < matrizNormal.length; i++ ){
            for (j = 0; j < matrizNormal[i].length; j++){
                System.out.print(matrizNormal[i][j] + "\t");
            }
            System.out.println();
        }

        int aux = 0;
        for(i = 0; i < matrizNormal.length; i++){
            for (j = 0; j < i; j++ ){
                aux = matrizNormal[i][j];
                matrizNormal[i][j] = matrizNormal[j][i];
                matrizNormal[j][i] = aux;
            }
        }

        System.out.println("Matriz Tanspuesta: ");
        for(i = 0; i < matrizNormal.length; i++ ){
            for (j = 0; j < matrizNormal[i].length; j++){
                System.out.print(matrizNormal[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
