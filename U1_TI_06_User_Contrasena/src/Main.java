import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usSeg = new UsuarioSeguro();
        usSeg.setContrasena("naoalves2");
        usSeg.setNombreUsuario("Naoalves");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la contraseña");
        String intentPassword = sc.nextLine();
        usSeg.autenticar(intentPassword);


    }
}