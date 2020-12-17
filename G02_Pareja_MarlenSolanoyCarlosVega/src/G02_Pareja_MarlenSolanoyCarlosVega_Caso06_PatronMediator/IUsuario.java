package G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator;

public interface IUsuario {
  public void enviar(String de,String msg);
  public void recibir(String a, String msg);
  public String getCodigo();
} 
