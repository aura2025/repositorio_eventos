public class Monstruo implements Personaje {
    private int hp;
    private int defensa;
    private int ataque;
    private int velocidad;
    private Estado estado;
    
    private TipoMostruo tipoMostruo;

    public Monstruo(int hp, int defensa, int ataque, int velocidad, Estado estado,TipoMostruo tipoMostruo){
        this.hp=hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad=velocidad;
        this.estado=estado;
        this.tipoMostruo=tipoMostruo;
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
   
    @Override
    public Estado getEstado() {
        return estado;
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
    
    @Override
    public void setEstado(Estado estado) {
        this.estado=estado;
    }
    public void setTipoMostruo(TipoMostruo tipoMostruo){
        this.tipoMostruo=tipoMostruo;
    }
    public TipoMostruo getTipoMostruo(){
        return tipoMostruo;
    }
    
}
