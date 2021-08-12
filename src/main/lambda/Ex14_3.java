package lambda;

import java.util.function.*;

public class Ex14_3 {
	public static void main(String[] args) {
		//1. Function 타입의 람다식 2개를 합성해서 새로운 람다식을 만든는 예제

		Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16);
		//람다식이 하나의 메서드만 호출하는 경우, 메서드 참조를 통해 람다식을 간략히 할 수 있다.
		//클래스명::메서드명 또는 참조변수::메서드명
		Function<Integer, String>	g  = Integer::toBinaryString;
		System.out.println(Integer.toBinaryString(10));  // "10"을 리턴

		Function<String, String>    h  = f.andThen(g);
		Function<Integer, Integer>  h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF" → 255 → "11111111"
		System.out.println(h2.apply(2));   // 2 → "10" → 16

		Function<String, String> f2 = x -> x; // 항등 함수(identity function)
		System.out.println(f2.apply("AAA"));  // AAA가 그대로 출력됨

		//2. Predicate 타입의 람다식 2개 이상 합성해서 새로운 람다식을 만든는 예제
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); //true (150>=100)&&(150<200 || (150%2==0))

		// str1과 str2가 같은지 비교한 결과를 반환
		String str1 = "abc";
		String str2 = "abc";
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);   
		System.out.println(result);
	}
}