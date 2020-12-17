package G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator;

public interface Mediator {
  public void registrar(IUsuario usuario);
  public void enviar(String sender,String a, String evento);
}
