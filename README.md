# 멋쟁이사자처럼 백엔드 부트캠프 25기 Spring Boot 프로그래밍 저장소

## 목차
- [1. 스프링 프레임워크 핵심 원리](docs/01.spring_core.md)
- [2. 스프링 부트 시작하기](docs/02.spring_boot.md)
- [3. Spring MVC 웹 개발 기초](docs/03.spring_web_mvc.md)
- [4. Spring 데이터 접근 기술과 데이터베이스 모델링](docs/04.spring_database.md)
- [5. MyBatis와 트랜잭션 관리](docs/05.mybatis.md)
- [6. Spring Data JPA]
- [7. Spring REST API](docs/07.spring_rest_api.md)
- [8. Spring Security](docs/08.spring_security.md)

# 수업 진도
<details>
<summary>펼치기</summary>
<details>
<summary><h2>8주차 - 2026.07.08(수) ~ 2026.07.14(화)</h2></summary>

<details>
<summary><h3>36일차(2026.07.08 수)</h3></summary>

#### 오전(3시간)
- [1. 스프링 입문](docs/01.spring_core.md#1-스프링-입문)
  + [1.1 프레임워크와 라이브러리](docs/01.spring_core.md#11-프레임워크와-라이브러리)
  + [1.2 스프링 프레임워크 개요](docs/01.spring_core.md#12-스프링-프레임워크-개요)
  + [1.3 스프링 핵심 용어 사전](docs/01.spring_core.md#13-스프링-핵심-용어-사전)
- [2. 빌드 도구 (Build Tool)](docs/01.spring_core.md#2-빌드-도구-build-tool)
  + [2.1 스프링 프로젝트의 빌드 및 배포 흐름](docs/01.spring_core.md#21-스프링-프로젝트의-빌드-및-배포-흐름)
  + [2.2 Maven과 Gradle](docs/01.spring_core.md#22-maven과-gradle)

#### 오후(3시간)
- [3. 스프링 프로젝트 구성](docs/01.spring_core.md#3-스프링-프로젝트-구성)
  + [3.1 프로젝트 생성](docs/01.spring_core.md#31-프로젝트-생성)
    - 💻 실습 (깃허브 레포지토리 생성): [스프링 부트 레포지토리](https://github.com/BEBC-25/springboot-yong)
    - 💻 실습 (첫번째 스프링 프로젝트): [SpringCore](SpringCore)
  + [3.2 자바 컴파일러 및 Gradle JVM 검토](docs/01.spring_core.md#32-자바-컴파일러-및-gradle-jvm-검토)
  + [3.3 build.gradle 기본 설정 및 구조 분석](docs/01.spring_core.md#33-buildgradle-기본-설정-및-구조-분석)
  + [3.4 스프링 프레임워크 의존성 추가](docs/01.spring_core.md#34-스프링-프레임워크-의존성-추가)
  + [3.5 프로젝트 구조](docs/01.spring_core.md#35-프로젝트-구조)
- [4. 제어의 역전 (IoC: Inversion of Control)](docs/01.spring_core.md#4-제어의-역전-ioc-inversion-of-control)
  - [4.1 의존 객체 직접 결합](docs/01.spring_core.md#41-의존-객체-직접-결합)
  - [4.2 다형성을 활용한 느슨한 결합](docs/01.spring_core.md#42-다형성을-활용한-느슨한-결합)
    - 💻 실습 (OOP를 적용하기 이전 Driver, GasolineCar): [oop/before](SpringCore/src/main/java/net/likelion/bebc25/oop/before)
    - 💻 실습 (OOP를 적용한 후 Driver, GasolineCar): [oop/after](SpringCore/src/main/java/net/likelion/bebc25/oop/after)
  - [4.3 제어의 역전(IoC)의 출현과 개념](docs/01.spring_core.md#43-제어의-역전ioc의-출현과-개념)
- [5. 의존성 주입 (DI: Dependency Injection)](docs/01.spring_core.md#5-의존성-주입-di-dependency-injection)
  - [5.1 설정 클래스 정의](docs/01.spring_core.md#51-설정-클래스-정의)
  - [5.2 메인 클래스 구성](docs/01.spring_core.md#52-메인-클래스-구성)
    - 💻 실습 (의존성 주입 - Constructor Injection): [spring/di/constructor](SpringCore/src/main/java/net/likelion/bebc25/spring/di/constructor)
    
</details>

<details>
<summary><h3>37일차(2026.07.09 목)</h3></summary>

#### 오전(3시간)
- [5. 의존성 주입 (DI: Dependency Injection)](docs/01.spring_core.md#5-의존성-주입-di-dependency-injection)
  - [5.3 의존성 주입 방식](docs/01.spring_core.md#53-의존성-주입-방식)
    - 💻 실습 (의존성 주입 - Setter Injection): [spring/di/setter](SpringCore/src/main/java/net/likelion/bebc25/spring/di/setter)
- [6. 관점 지향 프로그래밍 (AOP: Aspect Oriented Programming)](docs/01.spring_core.md#6-관점-지향-프로그래밍-aop-aspect-oriented-programming)
  - [6.1 AOP 개념과 도입 배경](docs/01.spring_core.md#61-aop-개념과-도입-배경)
  - [6.2 프록시(Proxy) 기반 AOP 기술](docs/01.spring_core.md#62-프록시proxy-기반-aop-기술)
    - 💻 실습 (정적 프록시를 이용한 AOP): [spring/aop/staticproxy](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/staticproxy)
    - 💻 실습 (동적 프록시를 이용한 AOP): [spring/aop/dynamicproxy](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/dynamicproxy)

#### 오후(3시간)
- [6. 관점 지향 프로그래밍 (AOP: Aspect Oriented Programming)](docs/01.spring_core.md#6-관점-지향-프로그래밍-aop-aspect-oriented-programming)
  - [6.3 스프링 AOP와 AspectJ의 관계](docs/01.spring_core.md#63-스프링-aop와-aspectj의-관계)
  - [6.4 AOP 핵심 용어](docs/01.spring_core.md#64-aop-핵심-용어)
  - [6.5 스프링 AOP 적용 방법](docs/01.spring_core.md#65-스프링-aop-적용-방법)
    - 💻 실습 (스프링 AOP): [spring/aop/springaop](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/springaop)

</details>

<details>
<summary><h3>38일차(2026.07.10 금)</h3></summary>

#### 오전(3시간)
- [7. 컴포넌트 스캔과 의존성 자동 주입](docs/01.spring_core.md#7-컴포넌트-스캔과-의존성-자동-주입)
  - [7.1 컴포넌트 스캔 (Component Scan)](docs/01.spring_core.md#71-컴포넌트-스캔-component-scan)
  - [7.2 의존성 자동 주입 (Dependency Auto Injection)](docs/01.spring_core.md#72-의존성-자동-주입-dependency-auto-injection)
  - 💻 실습 (컴포넌트 스캔): [spring/componentscan](SpringCore/src/main/java/net/likelion/bebc25/spring/componentscan)
- [8. 스프링 컨테이너 핵심 메커니즘](docs/01.spring_core.md#8-스프링-컨테이너-핵심-메커니즘)
  - [8.1 스프링 빈 스코프 (Scope)](docs/01.spring_core.md#81-스프링-빈-스코프-scope)
  - [8.2 스프링 빈 생명주기 및 콜백](docs/01.spring_core.md#82-스프링-빈-생명주기-및-콜백)
  - 💻 실습 (초기화 메서드와 소멸 메서드): [spring/lifecycle](SpringCore/src/main/java/net/likelion/bebc25/spring/lifecycle)

#### 오후(3시간)
- [1. 스프링 부트 개요](docs/02.spring_boot.md#1-스프링-부트-개요)
  - [1.1 스프링 부트의 정의와 역할](docs/02.spring_boot.md#11-스프링-부트의-정의와-역할)
  - [1.2 스프링 프레임워크와 스프링 부트의 차이점](docs/02.spring_boot.md#12-스프링-프레임워크와-스프링-부트의-차이점)
- [2. 스프링 부트 프로젝트 환경 구축](docs/02.spring_boot.md#2-스프링-부트-프로젝트-환경-구축)
  - [2.1 스프링 이니셜라이저로 프로젝트 생성](docs/02.spring_boot.md#21-스프링-이니셜라이저로-프로젝트-생성)
    - 💻 실습 (Spring Initializr로 스프링 부트 프로젝트 생성): [spring-boot-initilizr](spring-boot-initializr)
  - [2.2 IntelliJ에서 직접 프로젝트 생성](docs/02.spring_boot.md#22-IntelliJ에서-직접-프로젝트-생성)
    - 💻 실습 (IntelliJ로 스프링 부트 프로젝트 생성): [spring-boot-intellij](spring-boot-intellij)
- [3. 스프링 부트 빌드 설정](docs/02.spring_boot.md#3-스프링-부트-빌드-설정)
  - [3.1 build.gradle 설정](docs/02.spring_boot.md#31-buildgradle-설정)
- [4. 스프링 부트의 자동 빈 등록 메커니즘](docs/02.spring_boot.md#4-스프링-부트의-자동-빈-등록-메커니즘)
  - [4.1 메인 실행 클래스와 @SpringBootApplication](docs/02.spring_boot.md#41-메인-실행-클래스와-springbootapplication)
  - [4.2 자동 의존성 주입 예시](docs/02.spring_boot.md#42-자동-의존성-주입-예시)
  - 💻 실습 (스프링 부트에서 Car, Driver 작성): [spring-boot-intellij](spring-boot-intellij/src/main/java/net/likelion/bebc25/intellij)
  
</details>

<details>
<summary><h3>39일차(2026.07.13 월)</h3></summary>

#### 오전(3시간)
- [1. 스프링 부트 프로젝트 생성](docs/03.spring_web_mvc.md#1-스프링-부트-프로젝트-생성)
  - [1.1 IntelliJ 기반 프로젝트 생성](docs/03.spring_web_mvc.md#11-intellij-기반-프로젝트-생성)
  - [1.2 서버 구동 및 테스트](docs/03.spring_web_mvc.md#12-서버-구동-및-테스트)
  - [1.3 스프링 부트 빌드 설정 파일 구성](docs/03.spring_web_mvc.md#13-스프링-부트-빌드-설정-파일-구성)
  - [1.4 샘플 코드 복사](docs/03.spring_web_mvc.md#14-샘플-코드-복사)
  - [1.5 실시간 변경 감지 및 자동 재시작 설정](docs/03.spring_web_mvc.md#15-실시간-변경-감지-및-자동-재시작-설정)
  - 💻 실습 (게시판 프로젝트 생성, 샘플 코드 복사): [spring-board](spring-board)

#### 오후(3시간)
- [2. HTTP 프로토콜](docs/03.spring_web_mvc.md#2-http-프로토콜)
  - [2.1 주요 특징](docs/03.spring_web_mvc.md#21-주요-특징)
  - [2.2 동작 방식](docs/03.spring_web_mvc.md#22-동작-방식)
  - [2.3 Request 메시지 구조](docs/03.spring_web_mvc.md#23-request-메시지-구조)
  - [2.4 Response 메시지 구조](docs/03.spring_web_mvc.md#24-response-메시지-구조)
  - [2.5 HTTP의 특징](docs/03.spring_web_mvc.md#25-http의-특징)
  - [2.6 HTTP 주요 메서드](docs/03.spring_web_mvc.md#26-http-주요-메서드)
- [3. 3티어 아키텍처와 MVC 패턴 설계](docs/03.spring_web_mvc.md#3-3티어-아키텍처와-mvc-패턴-설계)
  - [3.1 3티어 아키텍처의 이해](docs/03.spring_web_mvc.md#31-3티어-아키텍처의-이해)
  - [3.2 Model 1과 Model 2 아키텍처](docs/03.spring_web_mvc.md#32-model-1과-model-2-아키텍처)
  - [3.3 MVC 패턴](docs/03.spring_web_mvc.md#33-mvc-패턴)
  - [3.4 계층별 클래스 설계 기법 (Layered Architecture)](docs/03.spring_web_mvc.md#34-계층별-클래스-설계-기법-layered-architecture)
  - [3.5 계층 간 데이터 전달 객체의 분류](docs/03.spring_web_mvc.md#35-계층-간-데이터-전달-객체의-분류)
  - [3.6 프로젝트 패키지 구조 설계](docs/03.spring_web_mvc.md#36-프로젝트-패키지-구조-설계)
- [4. Spring MVC 컨트롤러 설계 및 웹 요청 핸들러 정의](docs/03.spring_web_mvc.md#4-spring-mvc-컨트롤러-설계-및-웹-요청-핸들러-정의)
  - [4.1 Controller 어노테이션 정의 및 데이터 직접 응답](docs/03.spring_web_mvc.md#41-controller-어노테이션-정의-및-데이터-직접-응답)
  - [4.2 HTTP 파라미터 매핑 방법](docs/03.spring_web_mvc.md#42-http-파라미터-매핑-방법)
  - 💻 실습 (게시글 목록 조회 - 컨트롤러에서 직접 View 응답): [board01](spring-board/src/main/java/net/likelion/bebc25/board01)

</details>

<details>
<summary><h3>40일차(2026.07.14 화)</h3></summary>

#### 오전(3시간)
- 💻 실습 (게시글 등록, 상세조회, 수정, 삭제 기능 구현): [board01](spring-board/src/main/java/net/likelion/bebc25/board01)

#### 오후(3시간)
- [5. 뷰(View) 구현 및 렌더링](docs/03.spring_web_mvc.md#5-뷰view-구현-및-렌더링)
  - [5.1 서버 사이드 동적 화면 생성 기술의 변천사](docs/03.spring_web_mvc.md#51-서버-사이드-동적-화면-생성-기술의-변천사)
  - [5.2 스프링의 뷰(View)와 뷰 리졸버(ViewResolver) 아키텍처](docs/03.spring_web_mvc.md#52-스프링의-뷰view와-뷰-리졸버viewresolver-아키텍처)
  - [5.3 뷰 리졸버 (ViewResolver) 인터페이스](docs/03.spring_web_mvc.md#53-뷰-리졸버-viewresolver-인터페이스)
  - [5.4 뷰 (View) 인터페이스](docs/03.spring_web_mvc.md#54-뷰-view-인터페이스)
  - [5.5 뷰 처리 렌더링 동작 시나리오](docs/03.spring_web_mvc.md#55-뷰-처리-렌더링-동작-시나리오)
- [6. Thymeleaf 뷰 템플릿 엔진](docs/03.spring_web_mvc.md#6-thymeleaf-뷰-템플릿-엔진)
  - [6.1 컨트롤러 데이터 바인딩 및 템플릿 파일 경로 규칙](docs/03.spring_web_mvc.md#61-컨트롤러-데이터-바인딩-및-템플릿-파일-경로-규칙)
  - [6.2 타임리프 기본 문법](docs/03.spring_web_mvc.md#62-타임리프-기본-문법)
  - 💻 실습 (타임리프 템플릿 기반 동적 화면 렌더링): [templates/board](spring-board/src/main/resources/templates/board)

</details>

</details>

<details>

<summary><h2>9주차 - 2026.07.15(수) ~ 2026.07.23(목)</h2></summary>

<details>
<summary><h3>41일차(2026.07.15 수)</h3></summary>

#### 오전(3시간)
- [6. Thymeleaf 뷰 템플릿 엔진](docs/03.spring_web_mvc.md#6-thymeleaf-뷰-템플릿-엔진)
  - [6.3 공통 레이아웃 설계 및 컴포넌트 재사용](docs/03.spring_web_mvc.md#63-공통-레이아웃-설계-및-컴포넌트-재사용)
- [7. 웹 요청 처리와 디스패처 서블릿](docs/03.spring_web_mvc.md#7-웹-요청-처리와-디스패처-서블릿)
  - [7.1 HTTP 요청 라이프사이클 및 디스패처 서블릿의 핵심 역할](docs/03.spring_web_mvc.md#71-http-요청-라이프사이클-및-디스패처-서블릿의-핵심-역할)
  - [7.2 요청에서 응답까지 MVC 구성 요소의 호출 흐름](docs/03.spring_web_mvc.md#72-요청에서-응답까지-mvc-구성-요소의-호출-흐름)
  - 💻 실습 (공통 레이아웃 프래그먼트 분리): [templates/layout](spring-board/src/main/resources/templates/layout)

#### 오후(3시간)
- [8. 데이터 검증 및 예외 처리](docs/03.spring_web_mvc.md#8-데이터-검증-및-예외-처리)
  - [8.1 Controller 계층에서의 입력값 검증 필요성 및 @Valid 활용](docs/03.spring_web_mvc.md#81-controller-계층에서의-입력값-검증-필요성-및-valid-활용)
  - [8.2 BindingResult 객체를 이용한 검증 에러 처리](docs/03.spring_web_mvc.md#82-bindingresult-객체를-이용한-검증-에러-처리)
  - [8.3 @ControllerAdvice 기반 글로벌 예외 처리](docs/03.spring_web_mvc.md#83-controlleradvice-기반-글로벌-예외-처리)
- [3. 3티어 아키텍처와 MVC 패턴 설계](docs/03.spring_web_mvc.md#3-3티어-아키텍처와-mvc-패턴-설계)
  - [3.4 계층별 클래스 설계 기법 (Layered Architecture)](docs/03.spring_web_mvc.md#34-계층별-클래스-설계-기법-layered-architecture)
  - 💻 실습 (Validation 데이터 검증, 예외 처리 및 계층 분리): [board02](spring-board/src/main/java/net/likelion/bebc25/board02)
    
</details>

<details>
<summary><h3>42일차(2026.07.16 목)</h3></summary>

#### 오전(3시간)
- [1. 스프링 JDBC와 JdbcTemplate](docs/04.spring_database.md#1-스프링-jdbc와-jdbctemplate)
  - [1.1 순수 JDBC와 복잡성](docs/04.spring_database.md#11-순수-jdbc와-복잡성)
  - 💻 실습 (순수 JDBC 기반 리포지토리 구현 및 빈 선택): [board03/post/repository](spring-board/src/main/java/net/likelion/bebc25/board03/post/repository)

#### 오후(3시간)
- [1. 스프링 JDBC와 JdbcTemplate](docs/04.spring_database.md#1-스프링-jdbc와-jdbctemplate)
  - [1.2 JdbcTemplate 개요 및 의존성 설정](docs/04.spring_database.md#12-jdbctemplate-개요-및-의존성-설정)
  - [1.3 RowMapper를 활용한 결과 매핑](docs/04.spring_database.md#13-rowmapper를-활용한-결과-매핑)
  - [1.4 JdbcTemplate 기반 CRUD 구현](docs/04.spring_database.md#14-jdbctemplate-기반-crud-구현)
  - [1.5 데이터베이스 접속 정보의 외부 격리 및 @Value 활용](docs/04.spring_database.md#15-데이터베이스-접속-정보의-외부-격리-및-value-활용)
  - [1.6 데이터베이스 초기화 및 커넥션 풀 제어](docs/04.spring_database.md#16-데이터베이스-초기화-및-커넥션-풀-제어)
  - 💻 실습 (JdbcTemplate 연동 및 DB 초기화 스크립트 적용): [board03/post/repository](spring-board/src/main/java/net/likelion/bebc25/board03/post/repository)

</details>

<details>
<summary><h3>43일차(2026.07.21 화)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

<details>
<summary><h3>44일차(2026.07.22 수)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

<details>
<summary><h3>45일차(2026.07.23 목)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

</details>

<details>

<summary><h2>14주차 - 2026.08.26(수) ~ 2026.09.01(화)</h2></summary>

<details>
<summary><h3>69일차(2026.08.31 월)</h3></summary>

#### 오전(3시간)
- [2. 데이터베이스 모델링](docs/04.spring_database.md#2-데이터베이스-모델링)
  - [2.1 데이터베이스 모델링 개요](docs/04.spring_database.md#21-데이터베이스-모델링-개요)
  - [2.2 데이터베이스 정규화 이론](docs/04.spring_database.md#22-데이터베이스-정규화-이론)

#### 오후(3시간)
- [2. 데이터베이스 모델링](docs/04.spring_database.md#2-데이터베이스-모델링)
  - [2.3 ERD 설계와 Crow's Foot 표기법](docs/04.spring_database.md#23-erd-설계와-crows-foot-표기법)
  - [2.4 식별 관계와 비식별 관계의 구조적 구분](docs/04.spring_database.md#24-식별-관계와-비식별-관계의-구조적-구분)
  - [2.5 SNS 핵심 도메인 테이블 정의서 및 최종 DDL 스키마](docs/04.spring_database.md#25-sns-핵심-도메인-테이블-정의서-및-최종-ddl-스키마)
  - [2.6 대표적인 모델링 도구 및 설계 가이드라인](docs/04.spring_database.md#26-대표적인-모델링-도구-및-설계-가이드라인)
    
</details>

<details>
<summary><h3>70일차(2026.09.01 화)</h3></summary>

#### 오전(3시간)
- [3. 인덱스와 쿼리 성능 최적화](docs/04.spring_database.md#3-인덱스와-쿼리-성능-최적화)
  - [3.1 인덱스 정의와 옵티마이저 작동 원리](docs/04.spring_database.md#31-인덱스-정의와-옵티마이저-작동-원리)
  - [3.2 인덱스 관리 SQL 및 설계 원칙](docs/04.spring_database.md#32-인덱스-관리-sql-및-설계-원칙)
  - [3.3 쿼리 성능 저하 원인 분석](docs/04.spring_database.md#33-쿼리-성능-저하-원인-분석)
  - 💻 실습 (대량 더미 데이터 생성 프로시저): [spring-data/query/procedure.sql](spring-data/query/procedure.sql)

#### 오후(3시간)
- [3. 인덱스와 쿼리 성능 최적화](docs/04.spring_database.md#3-인덱스와-쿼리-성능-최적화)
  - [3.4 데이터베이스 실행 계획 확인](docs/04.spring_database.md#34-데이터베이스-실행-계획-확인)
  - [3.5 페이징 처리 기법](docs/04.spring_database.md#35-페이징-처리-기법)
  - 💻 실습 (인덱스 생성·성능 측정 및 실행 계획 분석): [spring-data/query/index.sql](spring-data/query/index.sql)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.1 MyBatis 개요와 SQL 매퍼 패러다임](docs/05.mybatis.md#11-mybatis-개요와-sql-매퍼-패러다임)

</details>

</details>

<details>

<summary><h2>15주차 - 2026.09.02(수) ~ 2026.09.08(화)</h2></summary>

<details>
<summary><h3>71일차(2026.09.02 수)</h3></summary>

#### 오전(3시간)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.2 MyBatis 핵심 구성 요소와 동작 원리](docs/05.mybatis.md#12-mybatis-핵심-구성-요소와-동작-원리)
  - [1.3 MyBatis 빌드 의존성 및 환경 설정](docs/05.mybatis.md#13-mybatis-빌드-의존성-및-환경-설정)
  - [1.4 Mapper 인터페이스와 매개변수 바인딩](docs/05.mybatis.md#14-mapper-인터페이스와-매개변수-바인딩)
- [2. MyBatis 실습: SNS 데이터 계층 구현](docs/05.mybatis.md#2-mybatis-실습-sns-데이터-계층-구현)
  - [2.1 프로젝트 환경 구성 및 설정](docs/05.mybatis.md#21-프로젝트-환경-구성-및-설정)
  - [2.2 기본 CRUD 기능 구현 및 단위 테스트](docs/05.mybatis.md#22-기본-crud-기능-구현-및-단위-테스트)
  - 💻 실습 (MyBatis SNS 프로젝트 설정 및 기본 CRUD 단위 테스트): [mybatis-sns](mybatis-sns)

#### 오후(3시간)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.5 ResultMap과 복합 객체 조인 매핑](docs/05.mybatis.md#15-resultmap과-복합-객체-조인-매핑)
  - [1.6 동적 SQL 제어와 공통 쿼리 모듈화](docs/05.mybatis.md#16-동적-sql-제어와-공통-쿼리-모듈화)
- [2. MyBatis 실습: SNS 데이터 계층 구현](docs/05.mybatis.md#2-mybatis-실습-sns-데이터-계층-구현)
  - [2.3 ResultMap 복합 조인 상세 조회 구현 및 단위 테스트](docs/05.mybatis.md#23-resultmap-복합-조인-상세-조회-구현-및-단위-테스트)
  - [2.4 동적 SQL 검색 및 일괄 삭제 구현 및 단위 테스트](docs/05.mybatis.md#24-동적-sql-검색-및-일괄-삭제-구현-및-단위-테스트)
  - 💻 실습 (ResultMap 1:1/1:N 복합 조인 및 동적 SQL 단위 테스트): [mybatis-sns/src/test/java/net/likelion/bebc25/sns/mapper/PostMapperTest.java](mybatis-sns/src/test/java/net/likelion/bebc25/sns/mapper/PostMapperTest.java)
    
</details>

<details>
<summary><h3>72일차(2026.09.03 목)</h3></summary>

#### 오전(3시간)
- [3. 스프링 선언적 트랜잭션](docs/05.mybatis.md#3-스프링-선언적-트랜잭션)
  - [3.1 스프링 트랜잭션 추상화](docs/05.mybatis.md#31-스프링-트랜잭션-추상화)
  - [3.2 @Transactional 선언과 AOP 프록시 동작 메커니즘](docs/05.mybatis.md#32-transactional-선언과-aop-프록시-동작-메커니즘)
  - [3.3 트랜잭션 전파 속성과 격리 수준](docs/05.mybatis.md#33-트랜잭션-전파-속성과-격리-수준)
  - [3.4 @Transactional 실무 사용법과 권장 설정](docs/05.mybatis.md#34-transactional-실무-사용법과-권장-설정)

#### 오후(3시간)
- [4. 서비스 계층 선언적 트랜잭션 실습](docs/05.mybatis.md#4-서비스-계층-선언적-트랜잭션-실습)
  - [4.1 트랜잭션 적용 시나리오: 좋아요 토글](docs/05.mybatis.md#41-트랜잭션-적용-시나리오-좋아요-토글)
  - [4.2 매퍼 설계 원칙: 도메인 관점과 테이블 책임 분리](docs/05.mybatis.md#42-매퍼-설계-원칙-도메인-관점과-테이블-책임-분리)
  - [4.3 PostLikeMapper 인터페이스 및 XML 구현](docs/05.mybatis.md#43-postlikemapper-인터페이스-및-xml-구현)
  - [4.4 PostMapper 인터페이스 및 XML 메서드 추가](docs/05.mybatis.md#44-postmapper-인터페이스-및-xml-메서드-추가)
  - [4.5 서비스 인터페이스 및 구현 클래스 작성](docs/05.mybatis.md#45-서비스-인터페이스-및-구현-클래스-작성)
  - [4.6 트랜잭션 롤백 테스트 및 무결성 검증](docs/05.mybatis.md#46-트랜잭션-롤백-테스트-및-무결성-검증)
  - 💻 실습 (서비스 계층 선언적 트랜잭션 실습): [mybatis-sns](mybatis-sns)

</details>

<details>
<summary><h3>73일차(2026.09.04 금)</h3></summary>

#### 오전(3시간)
- [5. 게시글 비즈니스 서비스 계층 구현](docs/05.mybatis.md#5-게시글-비즈니스-서비스-계층-구현)
  - [5.1 게시글 서비스 인터페이스 정의](docs/05.mybatis.md#51-게시글-서비스-인터페이스-정의)
  - [5.2 게시글 수정 요청 DTO 정의](docs/05.mybatis.md#52-게시글-수정-요청-dto-정의)
  - [5.3 서비스 구현 클래스 및 비즈니스 예외 처리](docs/05.mybatis.md#53-서비스-구현-클래스-및-비즈니스-예외-처리)
  - [5.4 게시글 서비스 통합 테스트 작성](docs/05.mybatis.md#54-게시글-서비스-통합-테스트-작성)
  - 💻 실습 (게시글 서비스 계층 구현 및 통합 테스트): [mybatis-sns](mybatis-sns)
- [1. 웹 렌더링 패러다임의 변화](docs/07.spring_rest_api.md#1-웹-렌더링-패러다임의-변화)
  - [1.1 SSR과 CSR의 동작 메커니즘](docs/07.spring_rest_api.md#11-ssr과-csr의-동작-메커니즘)
  - [1.2 데이터 중심 아키텍처에서의 클라이언트와 서버 역할](docs/07.spring_rest_api.md#12-데이터-중심-아키텍처에서의-클라이언트와-서버-역할)
  - [1.3 SSR과 CSR 렌더링 아키텍처 비교](docs/07.spring_rest_api.md#13-ssr과-csr-렌더링-아키텍처-비교)
- [2. REST 아키텍처와 설계 원칙](docs/07.spring_rest_api.md#2-rest-아키텍처와-설계-원칙)
  - [2.1 REST 핵심 용어 정의](docs/07.spring_rest_api.md#21-rest-핵심-용어-정의)
  - [2.2 REST 아키텍처 6대 제약조건](docs/07.spring_rest_api.md#22-rest-아키텍처-6대-제약조건)
  - [2.3 REST 환경의 HTTP 메서드 매핑](docs/07.spring_rest_api.md#23-rest-환경의-http-메서드-매핑)

#### 오후(3시간)
- [3. RESTful URI 설계와 HTTP 상태 코드](docs/07.spring_rest_api.md#3-restful-uri-설계와-http-상태-코드)
  - [3.1 자원 중심의 URI 설계 표준](docs/07.spring_rest_api.md#31-자원-중심의-uri-설계-표준)
  - [3.2 주요 HTTP 응답 상태 코드](docs/07.spring_rest_api.md#32-주요-http-응답-상태-코드)
- [4. Spring REST 컨트롤러와 메시지 변환](docs/07.spring_rest_api.md#4-spring-rest-컨트롤러와-메시지-변환)
  - [4.1 @RestController의 구조와 동작 메커니즘](docs/07.spring_rest_api.md#41-restcontroller의-구조와-동작-메커니즘)
  - [4.2 HttpMessageConverter와 Jackson 직렬화](docs/07.spring_rest_api.md#42-httpmessageconverter와-jackson-직렬화)
  - [4.3 Record DTO 기반 REST 컨트롤러 구현](docs/07.spring_rest_api.md#43-record-dto-기반-rest-컨트롤러-구현)
  - 💻 실습 (PostRestController 구현 및 API 테스트): [mybatis-sns](mybatis-sns)

</details>

<details>
<summary><h3>74일차(2026.09.07 월)</h3></summary>

#### 오전(3시간)
- [4. Spring REST 컨트롤러와 메시지 변환](docs/07.spring_rest_api.md#4-spring-rest-컨트롤러와-메시지-변환)
  - [4.3 Record DTO 기반 REST 컨트롤러 구현](docs/07.spring_rest_api.md#43-record-dto-기반-rest-컨트롤러-구현)
  - 💻 실습 (게시글 CRUD API 구현 및 권한 검증): [mybatis-sns](mybatis-sns)
- [5. REST 요청 검증과 전역 예외 처리](docs/07.spring_rest_api.md#5-rest-요청-검증과-전역-예외-처리)
  - [5.1 Bean Validation 기반 요청 데이터 검증](docs/07.spring_rest_api.md#51-bean-validation-기반-요청-데이터-검증)

#### 오후(3시간)
- [5. REST 요청 검증과 전역 예외 처리](docs/07.spring_rest_api.md#5-rest-요청-검증과-전역-예외-처리)
  - [5.2 공통 에러 응답 객체 설계](docs/07.spring_rest_api.md#52-공통-에러-응답-객체-설계)
  - [5.3 @RestControllerAdvice 기반 전역 예외 제어](docs/07.spring_rest_api.md#53-restcontrolleradvice-기반-전역-예외-제어)
  - [5.4 서비스 계층 비즈니스 예외 발생과 전파](docs/07.spring_rest_api.md#54-서비스-계층-비즈니스-예외-발생과-전파)
  - 💻 실습 (전역 예외 처리 및 공통 에러 응답 규격 적용): [mybatis-sns](mybatis-sns)

</details>

<details>
<summary><h3>75일차(2026.09.08 화)</h3></summary>

#### 오전(3시간)
- [5. REST 요청 검증과 전역 예외 처리](docs/07.spring_rest_api.md#5-rest-요청-검증과-전역-예외-처리)
  - [5.3 @RestControllerAdvice 기반 전역 예외 제어](docs/07.spring_rest_api.md#53-restcontrolleradvice-기반-전역-예외-제어)
  - 💻 실습 (Java Stream API 활용 전역 필드 검증 오류 처리): [GlobalRestExceptionHandler.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/exception/GlobalRestExceptionHandler.java)
- [6. OpenAPI 명세와 Swagger 문서화](docs/07.spring_rest_api.md#6-openapi-명세와-swagger-문서화)
  - [6.1 OpenAPI 사양과 Swagger 도구](docs/07.spring_rest_api.md#61-openapi-사양과-swagger-도구)
  - [6.2 Springdoc OpenAPI 라이브러리 환경 구성](docs/07.spring_rest_api.md#62-springdoc-openapi-라이브러리-환경-구성)
  - 💻 실습 (Springdoc 의존성 및 환경 설정)
    - [build.gradle](mybatis-sns/build.gradle)
    - [application.yaml](mybatis-sns/src/main/resources/application.yaml)
  - [6.3 Swagger 어노테이션 기반 API 명세화](docs/07.spring_rest_api.md#63-swagger-어노테이션-기반-api-명세화)
  - 💻 실습 (Swagger 명세용 컨트롤러 작성): [PostRestControllerSwagger.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/PostRestControllerSwagger.java)

#### 오후(3시간)
- [6. OpenAPI 명세와 Swagger 문서화](docs/07.spring_rest_api.md#6-openapi-명세와-swagger-문서화)
  - [6.3 Swagger 어노테이션 기반 API 명세화](docs/07.spring_rest_api.md#63-swagger-어노테이션-기반-api-명세화)
  - 💻 실습 (요청 및 응답 DTO 필드 스키마 명세화)
    - [PostCreateRequest.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/PostCreateRequest.java)
    - [PostResponse.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/PostResponse.java)
    - [PostUpdateRequest.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/PostUpdateRequest.java)
  - [6.4 Swagger UI 대화형 API 테스트](docs/07.spring_rest_api.md#64-swagger-ui-대화형-api-테스트)
  - 💻 실습 (Swagger UI 대화형 테스트 및 Bruno API 클라이언트 연동): [mybatis-sns/api/OpenAPI definition](mybatis-sns/api/OpenAPI%20definition)
- [1. 웹 보안 기초와 서블릿 필터 아키텍처](docs/08.spring_security.md#1-웹-보안-기초와-서블릿-필터-아키텍처)
  - [1.1 웹 애플리케이션 보안과 공통 관심사 분리](docs/08.spring_security.md#11-웹-애플리케이션-보안과-공통-관심사-분리)
  - [1.2 서블릿 필터의 동작 메커니즘](docs/08.spring_security.md#12-서블릿-필터의-동작-메커니즘)
- [2. 회원 인증과 비밀번호 암호화](docs/08.spring_security.md#2-회원-인증과-비밀번호-암호화)
  - [2.1 인증 아키텍처와 내부 동작 메커니즘](docs/08.spring_security.md#21-인증-아키텍처와-내부-동작-메커니즘)
  - [2.3 UserDetailsService 및 UserDetails 커스텀 구현](docs/08.spring_security.md#23-userdetailsservice-및-userdetails-커스텀-구현)
  - 💻 실습 (회원 도메인 모델 생성): [Member.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/domain/Member.java)
  - 💻 실습 (회원 테이블 DDL 및 초기 데이터 구성)
    - [schema.sql](mybatis-sns/src/main/resources/schema.sql)
    - [data.sql](mybatis-sns/src/main/resources/data.sql)
  - 💻 실습 (회원 조회용 MyBatis 매퍼 인터페이스 및 XML 작성)
    - [MemberMapper.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/mapper/MemberMapper.java)
    - [MemberMapper.xml](mybatis-sns/src/main/resources/mapper/MemberMapper.xml)
  - 💻 실습 (이메일 기반 회원 단건 조회 단위 테스트): [MemberMapperTest.java](mybatis-sns/src/test/java/net/likelion/bebc25/sns/mapper/MemberMapperTest.java)

</details>

</details>

<details>

<summary><h2>16주차 - 2026.09.09(수) ~ 2026.09.15(화)</h2></summary>

<details>
<summary><h3>76일차(2026.09.09 수)</h3></summary>

#### 오전(3시간)
- [1. 웹 보안 기초와 서블릿 필터 아키텍처](docs/08.spring_security.md#1-웹-보안-기초와-서블릿-필터-아키텍처)
  - [1.3 Spring Security 프레임워크 아키텍처](docs/08.spring_security.md#13-spring-security-프레임워크-아키텍처)
  - [1.4 서블릿 필터 체인과 Spring Security 연동 메커니즘](docs/08.spring_security.md#14-서블릿-필터-체인과-spring-security-연동-메커니즘)
  - [1.5 Spring Boot 환경의 보안 설정 구성](docs/08.spring_security.md#15-spring-boot-환경의-보안-설정-구성)
  - 💻 실습 (Spring Security 의존성 추가 및 SecurityConfig 기본 설정)
    - [build.gradle](mybatis-sns/build.gradle)
    - [SecurityConfig.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/config/SecurityConfig.java)
- [2. 회원 인증과 비밀번호 암호화](docs/08.spring_security.md#2-회원-인증과-비밀번호-암호화)
  - [2.2 PasswordEncoder와 비밀번호 단방향 암호화](docs/08.spring_security.md#22-passwordencoder와-비밀번호-단방향-암호화)
  - 💻 실습 (BCrypt PasswordEncoder 설정 및 초기 데이터 암호화 반영)
    - [PasswordEncoderConfig.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/config/PasswordEncoderConfig.java)
    - [data.sql](mybatis-sns/src/main/resources/data.sql)

#### 오후(3시간)
- [2. 회원 인증과 비밀번호 암호화](docs/08.spring_security.md#2-회원-인증과-비밀번호-암호화)
  - [2.3 UserDetailsService 및 UserDetails 커스텀 구현](docs/08.spring_security.md#23-userdetailsservice-및-userdetails-커스텀-구현)
  - 💻 실습 (UserDetails 및 UserDetailsService 커스텀 어댑터 구현)
    - [CustomUserDetails.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/principal/CustomUserDetails.java)
    - [CustomUserDetailsService.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/service/CustomUserDetailsService.java)
  - [2.4 인증 객체 참조와 비즈니스 API 연동 실습](docs/08.spring_security.md#24-인증-객체-참조와-비즈니스-api-연동-실습)
  - 💻 실습 (@AuthenticationPrincipal 기반 회원 정보 조회 API 구현): [MemberRestController.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/MemberRestController.java)
  - 💻 실습 (게시글 등록 API 인증 객체 연동): [PostRestController.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/PostRestController.java)

</details>

<details>
<summary><h3>77일차(2026.09.10 목)</h3></summary>

#### 오전(3시간)
- [3. 요청 인가와 메서드 수준 권한 제어](docs/08.spring_security.md#3-요청-인가와-메서드-수준-권한-제어)
  - [3.1 요청 인가 규칙 수립](docs/08.spring_security.md#31-요청-인가-규칙-수립)
  - 💻 실습 (URL 패턴별 접근 인가 규칙 수립): [SecurityConfig.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/config/SecurityConfig.java)
  - [3.2 메서드 수준 보안](docs/08.spring_security.md#32-메서드-수준-보안)
  - 💻 실습 (@PreAuthorize 기반 리소스 소유권 검증 및 서비스 비즈니스 보호)
    - [PostServiceImpl.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/service/PostServiceImpl.java)
    - [PostRestController.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/PostRestController.java)
  - [3.3 보안 예외 변환과 커스텀 에러 응답](docs/08.spring_security.md#33-보안-예외-변환과-커스텀-에러-응답)
  - 💻 실습 (컨트롤러 인가 예외 처리 및 에러 코드 추가)
    - [ErrorCode.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/exception/ErrorCode.java)
    - [GlobalRestExceptionHandler.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/exception/GlobalRestExceptionHandler.java)
  - 💻 실습 (서블릿 필터 계층 커스텀 인증/인가 예외 핸들러 구현)
    - [CustomAuthenticationEntryPoint.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/handler/CustomAuthenticationEntryPoint.java)
    - [CustomAccessDeniedHandler.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/handler/CustomAccessDeniedHandler.java)

#### 오후(3시간)
- [4. JWT 무상태 인증 체인 구축](docs/08.spring_security.md#4-jwt-무상태-인증-체인-구축)
  - [4.1 세션 기반 인증과 토큰 기반 인증 비교](docs/08.spring_security.md#41-세션-기반-인증과-토큰-기반-인증-비교)
  - [4.2 JWT 구조와 암호학적 서명 메커니즘](docs/08.spring_security.md#42-jwt-구조와-암호학적-서명-메커니즘)
  - [4.3 JwtProvider 유틸리티 클래스 구현](docs/08.spring_security.md#43-jwtprovider-유틸리티-클래스-구현)
  - 💻 실습 (JJWT 의존성 추가 및 JwtProvider 구현과 단위 테스트)
    - [build.gradle](mybatis-sns/build.gradle)
    - [application.yaml](mybatis-sns/src/main/resources/application.yaml)
    - [JwtProvider.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/jwt/JwtProvider.java)
    - [JwtProviderTest.java](mybatis-sns/src/test/java/net/likelion/bebc25/sns/security/jwt/JwtProviderTest.java)
  - [4.4 PK 기반 조회를 위한 MemberMapper 및 CustomUserDetailsService 확장](docs/08.spring_security.md#44-pk-기반-조회를-위한-membermapper-및-customuserdetailsservice-확장)
  - 💻 실습 (PK 기반 단건 조회 매퍼 및 서비스 메서드 확장)
    - [MemberMapper.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/mapper/MemberMapper.java)
    - [MemberMapper.xml](mybatis-sns/src/main/resources/mapper/MemberMapper.xml)
    - [CustomUserDetailsService.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/service/CustomUserDetailsService.java)
  - [4.5 커스텀 JWT 인증 필터 구현과 필터 체인 결합](docs/08.spring_security.md#45-커스텀-jwt-인증-필터-구현과-필터-체인-결합)
  - 💻 실습 (OncePerRequestFilter 기반 JwtAuthenticationFilter 구현 및 체인 등록)
    - [JwtAuthenticationFilter.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/jwt/JwtAuthenticationFilter.java)
    - [SecurityConfig.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/config/SecurityConfig.java)
  - [4.6 무상태 JWT 로그인 API 구현 및 엔드포인트 검증](docs/08.spring_security.md#46-무상태-jwt-로그인-api-구현-및-엔드포인트-검증)
  - 💻 실습 (무상태 로그인 API 컨트롤러 및 DTO 구현)
    - [LoginRequest.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/LoginRequest.java)
    - [TokenResponse.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/TokenResponse.java)
    - [AuthRestController.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/AuthRestController.java)

</details>

<details>
<summary><h3>78일차(2026.09.11 금)</h3></summary>

#### 오전(3시간)
- [4. JWT 무상태 인증 체인 구축](docs/08.spring_security.md#4-jwt-무상태-인증-체인-구축)
  - [4.7 Access Token과 Refresh Token 이중화 운영 전략](docs/08.spring_security.md#47-access-token과-refresh-token-이중화-운영-전략)
  - [4.8 AuthRestController 토큰 갱신 엔드포인트 구현 (POST /api/v1/auth/refresh)](docs/08.spring_security.md#48-authrestcontroller-토큰-갱신-엔드포인트-구현-post-apiv1authrefresh)
  - 💻 실습 (Refresh Token 요청 DTO 및 토큰 갱신 엔드포인트 구현)
    - [RefreshTokenRequest.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/dto/RefreshTokenRequest.java)
    - [AuthRestController.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/controller/AuthRestController.java)
    - [GlobalRestExceptionHandler.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/exception/GlobalRestExceptionHandler.java)
  - [4.9 토큰 갱신 파이프라인 검증 (Bruno)](docs/08.spring_security.md#49-토큰-갱신-파이프라인-검증-bruno)
  - 💻 실습 (Bruno 토큰 재발급 및 만료/변조 차단 파이프라인 검증): [mybatis-sns/api/OpenAPI definition](mybatis-sns/api/OpenAPI%20definition)
- [5. OAuth 2.0 소셜 로그인 연동](docs/08.spring_security.md#5-oauth-20-소셜-로그인-연동)
  - [5.1 OAuth(Open Authorization) 2.0 프로토콜](docs/08.spring_security.md#51-oauthopen-authorization-20-프로토콜)
  - [5.2 build.gradle 의존성 추가 (build.gradle)](docs/08.spring_security.md#52-buildgradle-의존성-추가-buildgradle)
  - 💻 실습 (OAuth 2.0 Client 의존성 추가): [build.gradle](mybatis-sns/build.gradle)

#### 오후(3시간)
- [5. OAuth 2.0 소셜 로그인 연동](docs/08.spring_security.md#5-oauth-20-소셜-로그인-연동)
  - [5.3 구글 OAuth 2.0 소셜 로그인 연동 (기본 공급자)](docs/08.spring_security.md#53-구글-oauth-20-소셜-로그인-연동-기본-공급자)
  - 💻 실습 (신규 소셜 회원 DB 저장을 위한 매퍼 확장)
    - [MemberMapper.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/mapper/MemberMapper.java)
    - [MemberMapper.xml](mybatis-sns/src/main/resources/mapper/MemberMapper.xml)
  - 💻 실습 (OAuth2User 다중 구현 및 속성 확장): [CustomUserDetails.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/principal/CustomUserDetails.java)
  - 💻 실습 (OAuth2User 공급자 파싱 및 자동 가입 서비스 구현): [CustomOAuth2UserService.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/oauth/CustomOAuth2UserService.java)
  - 💻 실습 (소셜 인증 성공 핸들러 및 자체 JWT 발급 연동): [OAuth2SuccessHandler.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/handler/OAuth2SuccessHandler.java)
  - [5.4 카카오 OAuth 2.0 확장 및 커스텀 공급자 연동 (서드파티 확장)](docs/08.spring_security.md#54-카카오-oauth-20-확장-및-커스텀-공급자-연동-서드파티-확장)
  - 💻 실습 (소셜 로그인 테스트 및 콜백 정적 페이지 작성)
    - [login.html](mybatis-sns/src/main/resources/static/login.html)
    - [callback.html](mybatis-sns/src/main/resources/static/oauth/callback.html)
- [6. 커스텀 보안 필터 설계와 필터 체인 제어](docs/08.spring_security.md#6-커스텀-보안-필터-설계와-필터-체인-제어)
  - [6.1 커스텀 필터 체인 설계 및 순서 제어](docs/08.spring_security.md#61-커스텀-필터-체인-설계-및-순서-제어)
  - 💻 실습 (OncePerRequestFilter 기반 요청 감사 로깅 필터 구현 및 체인 등록)
    - [RequestAuditFilter.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/filter/RequestAuditFilter.java)
    - [SecurityConfig.java](mybatis-sns/src/main/java/net/likelion/bebc25/sns/security/config/SecurityConfig.java)

</details>

<details>
<summary><h3>79일차(2026.09.14 월)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>80일차(2026.09.15 화)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

</details>

<details>

<summary><h2>17주차 - 2026.09.16(수) ~ 2026.09.22(화)</h2></summary>

<details>
<summary><h3>81일차(2026.09.16 수)</h3></summary>

#### 오전(3시간)


#### 오후(3시간)

    
</details>

<details>
<summary><h3>82일차(2026.09.17 목)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트 준비

#### 오후(3시간)
- 응용 프로젝트 준비

</details>

<details>
<summary><h3>83일차(2026.09.18 금)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>

<details>
<summary><h3>84일차(2026.09.21 월)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>

<details>
<summary><h3>85일차(2026.09.22 화)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>


</details>


</details>


