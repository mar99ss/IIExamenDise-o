package G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator;


import java.util.HashMap;

public class TorreControl implements Mediator{
  private HashMap<String,IUsuario> participantes = new HashMap<>();

  @Override
  public void registrar(IUsuario usuario) {
    participantes.put(usuario.getCodigo() ,usuario);
  }

  @Override
  public void enviar(String sender,String destinatario,String evento) {
    if(participantes.containsKey(sender)&&participantes.containsKey(sender)){
      IUsuario usuario= participantes.get(destinatario);  
      usuario.recibir(sender, evento);
    }
  }  

  public IUsuario getUsuario(String usuario){
    return participantes.get(usuario);
  }
}
