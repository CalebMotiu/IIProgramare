
public class EmailTransmitter implements Transmitter {
	
	private final static String TYPE = "Email";
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public void store(Message message) {
		message.setMessage(message.getSender().getNume()+" said to " + message.getReciver().getNume()
				+"("+message.getSender().getTransmitter().getType()+") : \""+message.getMessage()+"\"");
		this.retrive(message.getReciver(), message);
	}

	@Override
	public Message retrive(Person person, Message message) {
		System.out.println(message.getMessage());
		return message;
	}

}
