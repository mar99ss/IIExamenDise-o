package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class MusicaReceiver implements Receiver{
  private int volumen;
  private Boolean encendido;
  
  @Override
  public Boolean encender() {
    setEncendido(true);
    setVolumen(5);
    return isEncendido();
  }
  @Override
  public Boolean apagar() {
    setEncendido(false);
    return isEncendido();
  }

  @Override
  public int aumentar() {
    int volumenActual = getVolumen();
    setVolumen(volumenActual+1); 
    return getVolumen();
  }

  @Override
  public int disminuir() {
    int volumenActual = getVolumen();
    setVolumen(volumenActual-1); 
    return getVolumen();
  }


  public int getVolumen() {
    return this.volumen;
  }

  public void setVolumen(int volumen) {
    this.volumen = volumen;
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

