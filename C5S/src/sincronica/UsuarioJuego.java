package sincronica;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje =0.0;
    private int nivel =0;

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public void aumentarPuntaje(){
        this.puntaje += 1.0;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }

    public String getNombre(){
        return nombre;
    }

    public String getClave(){
        return clave;
    }

    public Double getPuntaje(){
        return puntaje;
    }

    public int getNivel(){
        return nivel;
    }

}

