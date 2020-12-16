package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class ApagarCommand implements Command{
  private Receiver receiver;
  
  public ApagarCommand(Receiver pReceiver){
    receiver=pReceiver;
  }

  public void execute(){
    receiver.apagar();
  }
}
