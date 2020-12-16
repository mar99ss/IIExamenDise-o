package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class AbrirCommand implements Command{
  private PuertaReceiver receiver;
	
	public AbrirCommand(PuertaReceiver receiver) {
		this.receiver = receiver;
	}
	 
	@Override 
	public void execute() { 
		receiver.abrir();
		
	}
    
}
