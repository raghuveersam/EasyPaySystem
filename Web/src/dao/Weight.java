package dao;

public class Weight {
	private int id;
	private String weight;
	private String status;
	private String userid;
	private String timeinserted;
	private String dateinserted;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTimeinserted() {
		return timeinserted;
	}
	public void setTimeinserted(String timeinserted) {
		this.timeinserted = timeinserted;
	}
	public String getDateinserted() {
		return dateinserted;
	}
	public void setDateinserted(String dateinserted) {
		this.dateinserted = dateinserted;
	}
	@Override
	public String toString() {
		return "Weight [weight=" + weight + ", status=" + status + ", userid="
				+ userid + ", timeinserted=" + timeinserted + ", dateinserted="
				+ dateinserted + "]";
	}
	
	

}