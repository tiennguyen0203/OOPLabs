
public class Payment {
	private int transactionID;
	private float amount;
	private String status;
	private String date;
	
	public Payment(int _transactionID, float _amount, String _status, String _date) {
		this.transactionID = _transactionID;
		this.amount = _amount;
		this.status = _status;
		this.date = _date;
	}
	
	public boolean processPayment() {
		return true;
	}
	
	public int getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	
}
