package DemoDependency;

public class LogMessage {
	
	private String message="Hi hello i'm using springboot";

	public String getMessage() {
		System.out.println("i'm in getMessage");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LogMessage [message=" + message + "]";
	}

	public LogMessage(String message) {
		super();
		this.message = message;
	}

	public LogMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
