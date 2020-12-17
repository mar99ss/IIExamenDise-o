package G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator;

public class Avion implements IUsuario {
  private String codigoAvion;
  private TorreControl torre;
  public Avion(String pCodigoAvion, TorreControl pTorre){
    this.codigoAvion =pCodigoAvion;
    this.torre= pTorre;
  }

  @Override
  public void enviar(String destinatario, String mensaje) {
    torre.enviar(this.codigoAvion, destinatario,mensaje);

  }

  @Override
  public void recibir(String remitente, String mensaje) {
    String mensajeRecibido = "El remitente "+ remitente +" envia el mensaje:"+ mensaje;
    System.out.println(mensajeRecibido);
  }


  @Override
  public String getCodigo() {
    return this.codigoAvion;
  } 
  
}
