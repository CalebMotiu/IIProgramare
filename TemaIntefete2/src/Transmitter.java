
public interface Transmitter {

	public String getType();
	
	public void store(Message message);
	
	public Message retrive(Person person,Message message);
	
	
	
}
