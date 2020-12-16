package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class PuertaReceiver{
  private Boolean abierta;
 
  public Boolean abrir() {
    setAbierta(true);
    return isAbierta();
  }

  public Boolean cerrar() {
    setAbierta(false);
    return isAbierta();
  }
 
  public Boolean isAbierta() {
    return this.abierta;
  }

  public Boolean getAbierta() {
    return this.abierta;
  }

  public void setAbierta(Boolean abierta) {
    this.abierta = abierta;
  }

}
