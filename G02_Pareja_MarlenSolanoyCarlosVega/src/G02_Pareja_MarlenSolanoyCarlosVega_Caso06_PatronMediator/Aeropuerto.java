package G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator;

public class Aeropuerto implements IUsuario{
  private String codigoAeropuerto;
  private TorreControl torre;

  public Aeropuerto(String pCodigoAeropuerto, TorreControl pTorre){
    this.codigoAeropuerto = pCodigoAeropuerto; 
    this.torre= pTorre;
  }

  @Override
  public void enviar(String destinatario, String mensaje) {
    torre.enviar(this.getCodigo(), destinatario, mensaje);
  }

  @Override
  public void recibir(String remitente, String mensaje) {
    String mensajeRecibido = "El remitente "+ remitente +" envia el mensaje:"+ mensaje;
    System.out.println(mensajeRecibido);
  }

  @Override
  public String getCodigo() {
    return codigoAeropuerto;
  }
  
}
