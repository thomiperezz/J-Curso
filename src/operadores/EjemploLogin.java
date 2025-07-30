package operadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjemploLogin {
    private static ArrayList listaUsuarios = new ArrayList();
    private static ArrayList listaContrasenas= new ArrayList();

    public static void main(String[] args) {

        Scanner interfaz = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("------SISTEMA DE USUARIOS------");;
        System.out.println("------------------------------");
        System.out.println("Opcion 1: DAR DE ALTA UN USUARIO");
        System.out.println("Opcion 2: INICIAR SESIÓN CON USUARIO Y CONTRASEÑA");
        System.out.println("Ingrese la acción que quiere realizar: ");
        String ingreso = interfaz.nextLine();

        try {
            int numeroSeleccionado = Integer.parseInt(ingreso);

            if (numeroSeleccionado==1) {
                Scanner registrarse = new Scanner(System.in);
                System.out.println("------------------------------");
                System.out.println("------ALTA EN EL SISTEMA------");;
                System.out.println("------------------------------");
                System.out.println("Elija un usuario: ");
                String usuarioRegistro = registrarse.nextLine();
                System.out.println("Elija una contraseña: ");
                String contrasenaRegistro = registrarse.nextLine();

                boolean registrar = true;
                for(int i=0; i<listaUsuarios.size(); i++){
                    if (usuarioRegistro.equals(listaUsuarios.get(i)) && contrasenaRegistro.equals(listaContrasenas.get(i))) {
                        System.out.println("El usuario ya existe");
                        registrar = false;
                        break;
                    }
                }

                if (registrar) {
                    listaUsuarios.add(usuarioRegistro);
                    listaContrasenas.add(contrasenaRegistro);
                    System.out.println(Arrays.toString(listaUsuarios.toArray()));
                    System.out.println(Arrays.toString(listaContrasenas.toArray()));
                    main(args);
                }

            } else if (numeroSeleccionado==2) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("------------------------------");
                System.out.println("---------LOGIN SISTEMA--------");;
                System.out.println("------------------------------");

                System.out.println("Ingrese el nombre de usuario: ");
                String usuarioIngreso = entrada.nextLine();

                System.out.println("Ingrese la contraseña: ");;
                String contrasenaIngreso = entrada.nextLine();
                boolean iniciarSesion=false;

                for (int i = 0; i < listaUsuarios.size(); i++) {
                    if (contrasenaIngreso.equals(listaContrasenas.get(i)) && usuarioIngreso.equals(listaUsuarios.get(i))) {
                        iniciarSesion=true;
                        break;
                    }
                }
                if (iniciarSesion) {
                    System.out.println("Bienvenido al sistema " +usuarioIngreso);
                } else{
                    System.out.println("Usuario no válido o contraseña incorrecta..");
                    main(args);
                }
            }



        } catch (Exception e) {
            System.out.println("Ingresar un número valido");
            main(args);
        }








    }
}
