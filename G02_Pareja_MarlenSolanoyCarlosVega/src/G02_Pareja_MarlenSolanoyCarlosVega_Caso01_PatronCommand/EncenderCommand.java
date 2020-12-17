package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class EncenderCommand implements Command{
  private Receiver receiver;
  
  public EncenderCommand(Receiver pReceiver){
    receiver= pReceiver;
  }

  public void execute(){
    receiver.encender();
    System.out.println("Se ha encendido el dispositivo");
  }
}
