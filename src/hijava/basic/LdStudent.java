package hijava.basic;

//@FunctionalInterface
//-> Lambda interface에 1개의 함수만 선언 가능하도록 함!

@FunctionalInterface
public interface LdStudent {
	Student makeStudent(int id, String name);
}
