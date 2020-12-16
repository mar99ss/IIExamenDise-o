package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class ACReceiver implements Receiver{

  private int temperatura;
  private Boolean encendido;
 
  public int getTemperatura() {
    return this.temperatura;
  }

  public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
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
    setTemperatura(temperatura+1);
    return temperatura;
  }

  @Override
  public int disminuir() {
    setTemperatura(temperatura-1);
    return temperatura;
  }

  @Override
  public Boolean encender() { 
    setEncendido(true);
    setTemperatura(5);
    return this.encendido;
  }

  @Override
  public Boolean apagar() {
    setEncendido(false);
    return this.encendido;
  }
}
