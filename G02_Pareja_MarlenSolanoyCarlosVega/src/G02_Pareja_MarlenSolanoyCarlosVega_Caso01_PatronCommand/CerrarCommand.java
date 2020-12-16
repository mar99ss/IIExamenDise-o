package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;


public class CerrarCommand implements Command{
  private PuertaReceiver receiver;
	 
  public CerrarCommand(PuertaReceiver receiver) {
    this.receiver = receiver;
  }
 
  @Override 
	public void execute() {
		receiver.cerrar(); 
	}
}
