package test;

public class BeanClass {

	private Boolean isActive;
	
	public BeanClass(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return "BeanClass [isActive=" + isActive + "]";
	}
	

}
