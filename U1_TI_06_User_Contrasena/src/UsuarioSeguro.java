public class UsuarioSeguro {
    private String nombreUsuario;
    private String contrasena;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null && nombreUsuario.length() == 0) {
            System.out.println("El nombre del usuario no puede ser vacio");
        }
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        boolean validaMayus=false;
        boolean validaMinus=false;
        boolean validaDigitos=false;

        if (contrasena != null && contrasena.length() >7) {
            for (int i = 0; i < contrasena.length(); i++) {
                Character c = contrasena.charAt(i);
                if (Character.isUpperCase(c)) {

                    validaMayus = true;
                }
                if (Character.isLowerCase(c)) {

                    validaMinus = true;
                }
                if (Character.isDigit(c)) {

                    validaDigitos = true;
                }

            }
            if(validaDigitos && validaMayus && validaMinus){
                System.out.println("Contraseña correcta");
                this.contrasena = contrasena;
            }else {
                System.out.println("La contraseña debe de cumplir con todos los criterios");
                System.out.println("Acceso Denegado");
            }
        }else {
            System.out.println("La contraseña debe tener 8 caracteres");
        }
        //this.contrasena = contrasena;
    }
}
