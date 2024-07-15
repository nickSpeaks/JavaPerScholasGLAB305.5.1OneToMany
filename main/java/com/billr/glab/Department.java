package com.billr.glab;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table
public class Department implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
		private int did;
		private String dname;

		@OneToMany(targetEntity = Teacher.class, cascade = {CascadeType.ALL})
		private List teacherList;
		public Department(int did, String dname) {
			super();
			this.did = did;
			this.dname = dname;
		}
		public Department()
				{
			
				}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		public void setTeacherList(List teacherList) {
			this.teacherList = teacherList;
		}
		
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
}
