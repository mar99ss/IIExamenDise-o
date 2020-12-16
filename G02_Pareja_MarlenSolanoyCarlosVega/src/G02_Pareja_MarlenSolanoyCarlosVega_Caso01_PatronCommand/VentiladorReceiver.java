package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class VentiladorReceiver implements Receiver{
  private int velocidad;
  private Boolean encendido;
  
  public Boolean encender() {
    setEncendido(true);
    setVelocidad(5);
    return isEncendido();
  }

  public Boolean apagar() {
    setEncendido(false);
    return isEncendido();
  }

  public int aumentar() {
    int velocidadActual = getVelocidad();
    setVelocidad(velocidadActual+1); 
    return getVelocidad();
  }

  public int disminuir() {
    int velocidadActual = getVelocidad();
    setVelocidad(velocidadActual-1); 
    return getVelocidad();
  }


  public int getVelocidad() {
    return this.velocidad;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public Boolean isEncendido() {
    return this.encendido;
  }

  public Boolean getEncendido() {
    return this.encendido;
  }

  public void setEncendido(Boolean encendido) {
    this.encendido = encendido;
  }
  
}
