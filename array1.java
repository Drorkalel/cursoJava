public class array1 {
    public static void main(String[] args) {
        
        String[] semana = new String[7];

        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miercoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sabado";
        semana[6] = "Domingo";

        System.out.println(semana[0]);
        System.out.println(semana[6]);
        System.out.println();

        //Otra forma de imprimir Array

        String[] semanaTotal = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.println(semanaTotal[4]);
        System.out.println(semanaTotal[3]);
        System.out.println();
    }
    
}
