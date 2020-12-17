package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class AumentarCommand implements Command{
  private Receiver receiver;
  
  public AumentarCommand(Receiver pReceiver){
    receiver=pReceiver;
  }

  public void execute(){
    receiver.aumentar();
    System.out.println("Se ha aumentado la intensidad");
  }
}