package sincronica;

public class Main {

    public static void main(String[] args) {
	UsuarioJuego agus= new UsuarioJuego("agus", "agus1510");

    System.out.println(agus.getClave());
    System.out.println(agus.getNombre());
    agus.bonus(15);
    System.out.println(agus.getPuntaje());
    agus.subirNivel();
    System.out.println(agus.getNivel());
    }

}
