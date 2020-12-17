package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class DisminuirCommand implements Command{
  private Receiver receiver;
  
  public DisminuirCommand(Receiver pReceiver){
    receiver=pReceiver;
  }

  public void execute(){
    receiver.disminuir();
    System.out.println("Se ha Disminuido la intensidad");
  }
}