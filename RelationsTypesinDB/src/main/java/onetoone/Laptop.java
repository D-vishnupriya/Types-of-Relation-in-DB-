package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mylaptop")
public class Laptop 

{
		private int lid;
		private String lname;
		private float lprice;
	
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public float getlprice() {
			return lprice;
		}
		public void setLprice(float Lprice) {
			this.lprice = lprice;
		}
}


		




