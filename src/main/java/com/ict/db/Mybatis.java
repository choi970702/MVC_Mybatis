package com.ict.db;

public class Mybatis 
{
	/*
	개발자가 지정한 SQL, 저장프로시저 그리고 몇가지 고급 매핑을 지원하는 퍼시스턴스 프레임워크이다.
	즉, 자바 SQL 프레임 워크이다.
	MyBatis 다운로드 후 합출해제한 후에 WEB-INF-lib에 넣어준다.
	5개의 파일이 필요하다. : DAO, VO, DBService, config.xml, mapper.xml
	- VO : DB정보를 담은 객체(해당 변수가 DB컬럼명과 같아야 한다.)
	- DAO : DB에 접근해서 검색, 삽입, 삭제, 수정 할 수 있도록 지원하는 객체
	- DBService : config.xml을 읽어 MyBatis가 DB에 접근 하고 실행할 수 있도록 도와주는 클래스
	- config.xml : DB에 접근할 수 있는 환경설정, 
					실제 DB 처리해서 결과를 얻어내는 mapper.xml의 위치를 지정해주는 환경설정파일
	- mapper.xml : 실제 DB처리하고 결과를 얻어내는 역할을 하는 xml 파일
					DAO에서 mapper.xml을 호출해서 사용한다.
	
	- mapper.xml의 내용
	xml은 태그로 구성되어 있다. HTML태그를 사용하는것이 아니라 자기만의 고유의 태그를 만들어서 사용한다.
	자기만의 고유태그에게 의미를 부여하기 위해서는 DTD라는 문서를 만들어야 하는데
	MyBatis에서 만든 DTD문서를 활용해서 고유 태그를 사용한다.
	고유 태그에는 <select>, <update>, <delete>, <insert> 태그등이 있다.
	
	id : DAO에서 mapper를 호출할때 사용하는 이름
	parameterType : 파라미터 타입을 작성하면 된다.
	resultType : select문에 대한 결과 타입인데 90%이상 VO타입이다.
	
	<select id="" resultType="" parameterType="">
		실제 sql 구문 작성(PreparedStatement 에서 사용하는 ? 대신 #{} 사용하면 된다.)
	</select>
	
	insert, update, delete 태그는 id와 parameterType만 존재한다.(resultType은 없음, 결과가 항상 숫자이다.)
	<insert id="" parameterType="">
		실제 sql 구문 작성(? 대신 #{}사용)
	</insert>
	*/
	
	
	
}





