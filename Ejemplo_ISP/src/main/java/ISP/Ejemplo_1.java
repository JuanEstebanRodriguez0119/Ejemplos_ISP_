
package ISP;

import java.util.Scanner;

public class Ejemplo_1 {
    
    
        public static void Enseñar(){
            
            System.out.println("El usuario explica y comparte sus conocimientos dentro del limite de "
                                + "\nlos mismos \n____________________________________________________");
        }

        public static void Entregar_trabajos(){
            System.out.println("El usuario cumple y hace entrega de sus trabajos asignados dentro del "
                                + "\nlimite de tiempo \n____________________________________________________");
        }
        
        public static void Dejar_trabajos(){
            System.out.println("El usuario explica y asigna una serie de actividades que se entregan "
                                + "\nen un limite de tiempo / fecha \n____________________________________________________");
        }
        
        public static void Calificar(){
            System.out.println("El usuario revisa el trabajo entregado y asigna una nota, reconocimiento o"
                                + "\npuntaje a l persona que realizo dicha actividad teniendo en cuenta los"
                                + "\ncriterios de calificacion \n____________________________________________________");
        }
        
        public static void Aprender(){
            System.out.println("El usuario adquiere cualquier tipo de conocimiento que se le comparta, se "
                                + "\nle corrija o aprenda por si mismo \n____________________________________________________");
        }

         public static void Asistir_clase(){
            System.out.println("El usuario cumple con un horario de clase estricto \n____________________________________________________");
        }

         public static  void Dictar_clase(){
            System.out.println("El usuario comparte y explica sus conocimientos a una cierta "
                                + "\ncantidad de personas en un tiempo definido \n____________________________________________________");
        }

        public static  void Vigilar(){
            System.out.println("El usuario esta pendiente del ingreso y salida de las personas que estan "
                                + "\nen la universidad \n____________________________________________________");
        }
        
        public static void Gestionar_registros(){
            System.out.println("El usuario controla todo tipo de registros publicos o privados de las "
                                + "\npersonas que se encuentran asociadas a la universidad \n____________________________________________________");
        }
        
        public static void Gestionar_administrativos(){
            System.out.println("El usuario dirige que procesos son necesarios para mantener el buen orden "
                                + "\ny mantenimiento administrativo de la universidad \n____________________________________________________");
        }
        
        public static void Gestionar_personal_academico(){
            System.out.println("El usuario toma las mejores decisiones para que el orden y tareas a realizar "
                                + "\npor los docentes sea de la mejor manera posible \n____________________________________________________");
        }

    public static void main(String[] args) {

        int opc = 0;
        Scanner txt = new Scanner (System.in);
        System.out.println("Bienvenid@! A que rol de la universidad deseas entrar? : ");
        System.out.println(" (1) Profesor \n (2) Estudiante \n (3) Celador \n (4) Administrativo/a \n (5) Rector");
        opc = txt.nextInt();
        switch (opc){
            case 1 : 
                System.out.println("Hola Profesor/a! Aqui se encuentran sus metodos: \n____________________________________________________");  
                Asistir_clase();
                Dictar_clase();
                Enseñar();
                Aprender();
                Dejar_trabajos();
                Calificar();
            break;
            
            case 2 : 
                System.out.println("Hola Estudiante! Aqui se encuentran sus metodos: \n____________________________________________________"); 
                Asistir_clase();
                Aprender();
                Entregar_trabajos();
                Enseñar();
            break;
            
            case 3 : 
                System.out.println("Hola Celador/a! Aqui se encuentran sus metodos: \n____________________________________________________"); 
                Vigilar();
            break;
            
            case 4 : 
                System.out.println("Hola Administrativo/a! Aqui se encuentran sus metodos: \n____________________________________________________");
                Aprender();
                Gestionar_registros();
                Entregar_trabajos();
                Enseñar();
            break;
            
            case 5 : 
                System.out.println("Hola Rector/a! Aqui se encuentran sus metodos: \n____________________________________________________");
                Gestionar_personal_academico();
                Gestionar_administrativos();
                Gestionar_registros();
                Enseñar();
                Aprender();
                
            break;
        }
           
    }
    
}
