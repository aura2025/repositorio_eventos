public class App {

    public static void main(String[] args) {
        
        PersonajeJugable heroe = new PersonajeJugable(1000, 500, 100,
         60, Estado.NORMAL, Arma.ESPADA, 700, PoderEspecial.PARALIZAR);
        
         PersonajeJugable yessica = new PersonajeJugable(1000, 500, 100,
         60, Estado.ENVENENADO, Arma.ESPADA, 700, PoderEspecial.PARALIZAR);

         System.out.print("El personaje tiene personaje " );
         System.out.print(heroe.getAtaque());

         if(yessica.getEstado() != Estado.NORMAL ){
            System.out.println();
            System.out.print("Este persona esta: ");
            System.out.print(yessica.getEstado());

         }
    }
    
}
