import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        /*PersonajeJugable heroe = new PersonajeJugable(1000, 500, 100,
         60, Estado.NORMAL, Arma.ESPADA, 700, PoderEspecial.PARALIZAR);
        
         PersonajeJugable yessica = new PersonajeJugable(1000, 500, 100,
         60, Estado.ENVENENADO, Arma.ESPADA, 700, PoderEspecial.PARALIZAR);

         System.out.print("El personaje tiene personaje " );
         System.out.print(heroe.getAtaque());
        
         PersonajeJugable personajes[4];
            for(PersonajeJugable personaje in personajes)
            
        {

            
            if(personaje.getEstado() != Estado.NORMAL ){
                System.out.println();
                System.out.print("Este persona esta: ");
                System.out.println(yessica.getEstado());
                System.out.println("No se puede usar este personaje por dos turnos");
                
            }
        }
    }

    public void cambiarVida(){

    } */
    
        PersonajeJugable heroe   = new PersonajeJugable("Héroe",   500, 50, 80, 90, Estado.NORMAL, Arma.ESPADA, 200, PoderEspecial.ENVENENAR);
        PersonajeJugable jessica = new PersonajeJugable("Jessica", 400, 40, 90, 70, Estado.NORMAL, Arma.BASTON, 250, PoderEspecial.CONGELAR);
        PersonajeJugable angelo  = new PersonajeJugable("Angelo",  450, 45, 85, 60, Estado.NORMAL, Arma.ARCO,   180, PoderEspecial.DEBILITAR);
        PersonajeJugable yangus  = new PersonajeJugable("Yangus",  600, 70, 70, 50, Estado.NORMAL, Arma.HACHA,  150, PoderEspecial.ATURDIR);

       
        Monstruo m1 = new Monstruo("Monstruo1", 300, 40, 60, 85, Estado.NORMAL, TipoMostruo.AGRESIVO);
        Monstruo m2 = new Monstruo("Monstruo2", 350, 60, 55, 65, Estado.NORMAL, TipoMostruo.DEFENSIVO);
        Monstruo m3 = new Monstruo("Monstruo3", 280, 45, 65, 55, Estado.NORMAL, TipoMostruo.BALANCEADO);
        Monstruo m4 = new Monstruo("Monstruo4", 400, 50, 75, 45, Estado.NORMAL, TipoMostruo.DEFENSIVO);

        
        Personaje[] ordenTurnos = {heroe, m1, jessica, m2, angelo, m3, yangus, m4};
}
