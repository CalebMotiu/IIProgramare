import java.util.ArrayList;

public class MailTransmitter implements Transmitter {

	private final static String TYPE = "Mail";
	private ArrayList<Message> buffer;
	private int dim;
	
	public MailTransmitter( int dim) {
		this.buffer = new ArrayList<Message>(dim);
		this.dim = dim;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public void store(Message message) {
		message.setMessage(message.getSender().getNume()+" said to " + message.getReciver().getNume()
				+"("+message.getSender().getTransmitter().getType()+") : \""+message.getMessage()+"\"");
		buffer.add(message);
		if (buffer.size()==dim) {
			for (Message m : buffer) {
				this.retrive(m.getReciver(), m);
			}
			buffer.clear();
		}
		
	}

	@Override
	public Message retrive(Person person, Message message) {
		System.out.println(message.getMessage());
		return message;
	}

}
