package OneToOneRelation;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="hiberstudent")
	public class Student {
		@Id
	@GeneratedValue	
	private int sid;
		@Column(name="stname",length = 50)
	private String sname;
		@Column(name="stcourse", length=50)
	private String scourse;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getScourse() {
			return scourse;
		}
		public void setScourse(String scourse) {
			this.scourse = scourse;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
		}
		
		
		//generate setter and getter method
		//generate toString
		

	}



