package day0923;
/*
//캡슐화 (encapsulation)
// 캡슐화란 우리가 만드는 객체의 세부적인 내용을
// 다른 곳에서는 알지 못하게 만드는 방법을 캡슐화라고한다.


// 모든 필드는 private 접근제한자를,
// 메소드의 경우 외부가 쓸 메소드를 제외하고는 나머지 모두 private 접근 제한자를 적용시켜서
// 외부에서 우리 클래스 객체를 만들어서 쓸 때
// 굳이 세부적인 내용을 알 필요없이 객체 그자체를 사용하라는 의미가 된다.

// 단 private 필드의 경유, 외부에서의 접근이 불가능하기 때문에
// 메소드를 사용하여 값을 저장하거나 저장된 값을 호출해야한다.
// 이렇게 private 필드의 값을 저장/호출 하는 메소드를
// 우리는 getter/ setter라고 부른다.

 setter 는 다음과 같은 양식을 따른다.
   public void set필드명(필드타입 필드명){
  		this.필드명 = 필드명;
   }

  getter는 다음과 같은 양식을 따른다.
   public 필드 타입 get필드명(){
 	return 필드명;
	}
	
	만약 해당 필드에 외부의 값을 저장할 필요가 없다면?
	당연히 해당 필드의 getter 메소드는 만들어주지 않는다.
	

*/
public class Ex01Encapsulation {

}
