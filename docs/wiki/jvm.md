J(ava) V(irtual) M(achine) a.k.a JVM 은 자바로 개발된 어플리케이션의 실행파일(컴파일된 바이트코드)을 실행할 수 있는 주체입니다.

### JVM 이 왜 필요한가?
일반적인 컴파일 프로그래밍 언어에서는 특정 시스템(OS) 에서 실행 가능한 코드를 생성합니다. 이는 달리 말하면 서로 다른 시스템에서 사용할 코드를 생성하기 위해 여러번의 컴파일 과정이 필요함을 의미입니다. Java 는 이러한 불편함을 해결하기 위해 WORA (Write Once Run Anywhre) 라는 개념을 적용하였고 이를 위해 JVM 이 생겨납니다.  
JVM 은 운영체제와 자바 실행 코드의 중간에 위치하여 자바 실행코드를 운영체제 독립적으로 만드는 역할을 합니다. 즉, 운영체제에 JVM 을 포함한 JRE (Java Runtime Environment) 를 설치하면 한번 작성된 (Write Once) 자바 코드를 운영체제의 종류에 상관없이 어디에서나 실행 (Run Anywhere) 할 수 있습니다.
- JRE (Java Runtime Environment) 란?
  * JVM 을 포함하여 아래 구성요소를 포함하는 자바로 작성된 애플리케이션을 실행할 수 있는 환경입니다.
	- 구성요소
		- JVM
		- Java Class Library
		- Java Class Loader

JVM 은  아래 세가지 구성 요소를 가집니다.
- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
