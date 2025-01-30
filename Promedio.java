package camila.estructuradedatos;

/**
 *
 * @author milae
 */
public class Promedio {
    
    public  void calcularPromedio() {
        
        int[] calificaciones = 
        {100, 86, 94};

        int suma = 0; 

        for (int i = 0; i < calificaciones.length; i++){
            System.out.println(calificaciones[i]);
            suma += calificaciones[i]; 
        }
        
        int promedio = suma/calificaciones.length;

        System.out.println("La suma de las calificaciones es: " + suma);
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
    
}
