package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class LucesReceiver implements Receiver{
  private int intensidadLuz;
  private Boolean encendido;
 
  public int getIntensidadLuz() {
    return this.intensidadLuz;
  }

  public void setIntensidadLuz(int intensidadLuz) {
    this.intensidadLuz = intensidadLuz;
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

  @Override
  public int aumentar() {
    setIntensidadLuz(intensidadLuz+1);
    return intensidadLuz;
  }

  @Override
  public int disminuir() {
    setIntensidadLuz(intensidadLuz-1);
    return intensidadLuz;
  }

  @Override
  public Boolean encender() { 
    setEncendido(true);
    setIntensidadLuz(5);
    return this.encendido;
  }

  @Override
  public Boolean apagar() {
    setEncendido(false);
    return this.encendido;
  }
  
}
