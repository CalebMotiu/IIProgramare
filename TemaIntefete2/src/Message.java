
public class Message {

	private Person sender,reciver;
	private String message;
	
	
	public Message(Person sender, Person reciver, String message) {
		this.sender = sender;
		this.reciver = reciver;
		this.message = message;
	}


	public Person getSender() {
		return sender;
	}


	public Person getReciver() {
		return reciver;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
