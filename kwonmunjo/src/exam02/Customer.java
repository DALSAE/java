package exam02;

public class Customer extends Person {
	String customerNum;
	int mileage;
	
	Customer(String customerNum, int mileage){
		this.customerNum = customerNum;
		this.mileage = mileage;
	}
	Customer(){
		this("1111", 50);
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "�̸�:"+ this.name + " ��ȭ��ȣ:" +this.phoneNum + " ����ȣ:"+ customerNum + " ���ϸ���:" + mileage;
	}
		
}
