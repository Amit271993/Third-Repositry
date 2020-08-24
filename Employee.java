package com.test;

import java.util.Date;

public class Employee
{
	private Long EMP_NO;
	private String FIRST_NAME;
	private String MID_INIT;
	private String LAST_NAME;
	private String DEPT;
	private Long PHONE_NO;
	private Date HIRE_DATE;
	private String JOB_TITLE;
	private Long EMP_LEVEL;
	
	
	
	public Long getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(Long eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getMID_INIT() {
		return MID_INIT;
	}
	public void setMID_INIT(String mID_INIT) {
		MID_INIT = mID_INIT;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getDEPT() {
		return DEPT;
	}
	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
	public Long getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(Long pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}
	public Date getHIRE_DATE() {
		return HIRE_DATE;
	}
	public void setHIRE_DATE(Date hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}
	public String getJOB_TITLE() {
		return JOB_TITLE;
	}
	public void setJOB_TITLE(String jOB_TITLE) {
		JOB_TITLE = jOB_TITLE;
	}
	public Long getEMP_LEVEL() {
		return EMP_LEVEL;
	}
	public void setEMP_LEVEL(Long eMP_LEVEL) {
		EMP_LEVEL = eMP_LEVEL;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DEPT == null) ? 0 : DEPT.hashCode());
		result = prime * result + ((EMP_LEVEL == null) ? 0 : EMP_LEVEL.hashCode());
		result = prime * result + ((EMP_NO == null) ? 0 : EMP_NO.hashCode());
		result = prime * result + ((FIRST_NAME == null) ? 0 : FIRST_NAME.hashCode());
		result = prime * result + ((HIRE_DATE == null) ? 0 : HIRE_DATE.hashCode());
		result = prime * result + ((JOB_TITLE == null) ? 0 : JOB_TITLE.hashCode());
		result = prime * result + ((LAST_NAME == null) ? 0 : LAST_NAME.hashCode());
		result = prime * result + ((MID_INIT == null) ? 0 : MID_INIT.hashCode());
		result = prime * result + ((PHONE_NO == null) ? 0 : PHONE_NO.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (DEPT == null) {
			if (other.DEPT != null)
				return false;
		} else if (!DEPT.equals(other.DEPT))
			return false;
		if (EMP_LEVEL == null) {
			if (other.EMP_LEVEL != null)
				return false;
		} else if (!EMP_LEVEL.equals(other.EMP_LEVEL))
			return false;
		if (EMP_NO == null) {
			if (other.EMP_NO != null)
				return false;
		} else if (!EMP_NO.equals(other.EMP_NO))
			return false;
		if (FIRST_NAME == null) {
			if (other.FIRST_NAME != null)
				return false;
		} else if (!FIRST_NAME.equals(other.FIRST_NAME))
			return false;
		if (HIRE_DATE == null) {
			if (other.HIRE_DATE != null)
				return false;
		} else if (!HIRE_DATE.equals(other.HIRE_DATE))
			return false;
		if (JOB_TITLE == null) {
			if (other.JOB_TITLE != null)
				return false;
		} else if (!JOB_TITLE.equals(other.JOB_TITLE))
			return false;
		if (LAST_NAME == null) {
			if (other.LAST_NAME != null)
				return false;
		} else if (!LAST_NAME.equals(other.LAST_NAME))
			return false;
		if (MID_INIT == null) {
			if (other.MID_INIT != null)
				return false;
		} else if (!MID_INIT.equals(other.MID_INIT))
			return false;
		if (PHONE_NO == null) {
			if (other.PHONE_NO != null)
				return false;
		} else if (!PHONE_NO.equals(other.PHONE_NO))
			return false;
		return true;
	}
	
	
	
}
