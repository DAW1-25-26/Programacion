package collections.ejercicios.ejercicio9;

public abstract class Producto implements Comparable<Producto>{

    private Integer identificador;
    private String nombre;
    private Double precio;
    private static Integer id = 0;

    public Producto (String nombre, Double precio){
        id++;
        this.identificador = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Producto.id = id;
    }

    @Override
    public int compareTo(Producto otro) {
        int resultadoPrecio = this.precio.compareTo(otro.getPrecio());

        if (resultadoPrecio != 0) {
            return resultadoPrecio;
        }
        return this.nombre.compareTo(otro.getNombre());
    }

    public abstract void imprimirInformacion();

}
