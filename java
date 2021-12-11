
public class A5_1 {

	static class Car {
		String color;
		int speed;
		int gear;

		void print() {
			System.out.print("color : " + color + ", speed: " + speed);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();// Car 클래스에 static을 붙이지 않으면 오류가 뜸 
							//이유:static 함수에서 참조하려는 클래스가 닫혀 있어 
		                    //접근을 하지 못한다는 오류입니다. 
					        //보통 내부에 있는 클래스를 static 함수가 참조할 때 에러가 납니다.
		obj.color = "red";
		obj.speed = 150;
		int gear;
		obj.print();
	}

}
