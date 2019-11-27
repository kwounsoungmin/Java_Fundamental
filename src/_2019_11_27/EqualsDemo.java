package _2019_11_27;
class Car{
	String modelNumber;
	String color;
	
	Car(){
		
	}
	
	Car(String modelNumber,String color){
		this.modelNumber=modelNumber;
		this.color=color;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
	
}


public class EqualsDemo {
	@Override
	public String toString() {
		return "EqualsDemo [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		
	
	Car c1 =new Car("000001","black"); // 모델넘버가같고 색갈이같은 객체 내용이같은 것이니 이퀄즈 메소드 오버라이딩후 참조고 나발이고 값비교해서 같다 반환.
	Car c2 =new Car("000001","black");
	// "=="을 바꿀순없어 primitive엔 값의 크기 벨류비교 ref 타임이면 같은 객체 참조하나 비교 그건 절대안변해
	//Car c2 =c1; //이런경우는 같다.
	System.out.println(c1.hashCode());// 오브젝트 클래스의 해쉬코드 매소드 사용가능 최상위 오브젝트 클래스로 안보여도 상속되이어
	System.out.println(c2.hashCode());
	System.out.println(c1==c2);
	System.out.println(c1.equals(c2)); //오버라이딩하면  같은객체를참조하는지 따지지않고 값만비교함.
	}
}
