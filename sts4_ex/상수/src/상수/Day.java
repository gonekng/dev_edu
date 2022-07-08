package 상수;

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// enum : 열거형 타입(enumeration), 상수의 그룹을 나타냄
//    생성 : enum 열거체이름 { 상수1이름, 상수2이름, ... }
//        ex) enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
//    호출 : 열거체이름.상수이름
//        ex) Rainbow.RED
//    메소드
//        values() : 모든 상수 배열로 반환   예) Rainbow[] arr = Rainbow.values();
//        ordinal() : 상수 인덱스 반환.   예)  int idx = Rainbow.YELLOW.ordinal();
//        valueOf()	 : 상수 문자 값 반환   예) Rainbow rb = Rainbow.valueOf("GREEN");