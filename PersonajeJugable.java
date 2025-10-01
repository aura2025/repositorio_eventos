public class PersonajeJugable implements Personaje {
    private int hp;
    private int defensa;
    private int ataque;
    private int velocidad;
    private int mp;
    private Arma arma;
    private PoderEspecial poderEspecial;


    private Estado estado;

public PersonajeJugable(int hp, int defensa, int ataque, int velocidad, Estado estado,Arma arma, int mp, PoderEspecial poderEspecial){
        this.hp=hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad=velocidad;
        this.estado=estado;
        this.poderEspecial=poderEspecial;
        this.arma=arma;
        this.mp=mp;
        
    }
    
    @Override
    public int getHP() {
        return hp;
    }
    @Override
    public int getDefensa() {
        return defensa;
    }
    @Override
    public int getAtaque() {
       return ataque;
    }
    @Override
    public int getVelocidad() {
      return velocidad;
    }
    
    public int getMP() {
        return mp;
    }
    @Override
    public Estado getEstado() {
        return estado;
    }

    public Arma getArma(){
        return arma;
    }
    public void setArma(Arma arma){
        this.arma=arma;
    }
    @Override
    public void setHP(int hp) {
        this.hp=hp;
    }
    @Override
    public void setDefensa(int defensa) {
       this.defensa=defensa;
    }
    @Override
    public void setAtaque(int ataque) {
       this.ataque=ataque;
    }
    @Override
    public void setVelocidad(int velocidad) {
      this.velocidad=velocidad;
    }
    
    public void setMP(int mp) {
        this.mp=mp;
    }
    @Override
    public void setEstado(Estado estado) {
        this.estado=estado;
    }

    public void setPoderEspecial(PoderEspecial poderEspecial) {
        this.poderEspecial=poderEspecial;
    }
    public PoderEspecial getPoderEspecial(){
        return poderEspecial;
    }
   

        
}
