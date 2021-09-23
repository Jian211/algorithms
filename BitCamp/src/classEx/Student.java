package classEx;

public class Student {

	public int id;
    public String name;
    public int korean;
    public int english;
    public int math;
    public final int SUBJECT_SIZE = 3;

    // 1. calculateSum()
    //	총 점수를 구하는 메소드
    public int calculateSum() {
        return korean + english + math;
    }

    // 2. 평균 구하는 메소드
    public double calculateAverage() {
        return (double) calculateSum() / SUBJECT_SIZE;
    }

    // 3. 정보를 출력 
    public void printInfo() {
        System.out.printf("ID: %d  이름: %s\n", id, name);
        System.out.printf("국어: %03d점  영어: %03d점  수학: %03d점\n", korean, english, math);
        System.out.printf("珥앹젏: %03d�젏 �룊洹�: %06.2f�젏\n", calculateSum(), calculateAverage());
    }

    // 4. 생성자 
    public Student(int id, String name, int korean, int english, int math) {
    	/* 
    	 * 	생성자는 클래스 명과 같은 메소드이다.
    	 *	생성자는 파라미터에 값을 넣을 수 도 있고 아예 없게 만들 수 있다.
    	 *	생성자는 객체만 초기화 시켜주는 메소드이다. 
    	 *	생성자는 중복이 될 수 있다.
    	 *	생성자를 정의하지 않으면 java가 알아서 default 생성자를 넣어준다.
    	 */
    	this.id = id;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    // 5. 처음 생성하면 만들어지는 생성자
    public Student() {
        id = -1;
        name = new String("아직없음");
        korean = -1;
        english = -1;
        math = -1;
    }

    // 6. equals()
    public boolean equals(Object o) {
    	// instanceof 연산자
    	// 참조변수의 형변환 가능여부 확인에 사용됨. 가능하면 true.
    	// 형변환 전에 반드시 instanceof로 확인해야함 
    	
    	// 파라미터 o객체가 Student로 형변환 가능해?
        if (o instanceof Student) {
            Student s = (Student) o;
            if (id == s.id) {
                return true;
            }
        }
        return false;
    }
}
