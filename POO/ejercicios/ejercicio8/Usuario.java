package POO.ejercicios.ejercicio8;

public class Usuario {
    
    private String dni;
    private String nombre;
    private String apellidos;

    public Usuario(String dni, String nombre, String apellidos){
        if (dni.length() == 9) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
        } else {
            System.out.println("El dni tiene max 9 caracteres.");
        }     
    } 

    public String getDni(String dni){
        return this.dni = dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre(String nombre){
        return this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(String apellidos){
        return this.apellidos = apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void mostrarInfo(){
        System.out.println("DNI :" + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
    }

    //Copiar el codigo de
    public void solicitarPrestamo(Libro l){
        if(l.getDisponible();){
            l.setDisponible(false);
            System.out.println("El libro " + l.getTitulo() + " ha sido prestado a " );
        }
    }
}
