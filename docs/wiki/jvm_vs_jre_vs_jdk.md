![](https://t1.daumcdn.net/cfile/tistory/9984524F5EE61F7510)
# JVM
- **J**ava **V**ertual **M**achine의 줄임말.
- Java Byte Code(ex class 파일)를 각 OS에 맞게 해석하여 기계어로 번역한 후, 번역된 기계어의 실행 환경을 구성하고 실행한다.

# JRE
- **J**ava **R**un **E**nvironment의 줄임말.
- JVM을 포함한다. 그리고 Java 코드를 작성하고 실행하는 데에 필요한 **기본적인 클래스 라이브러리**도 포함한다.
- JRE는 컴파일러를 포함하고 있지 않기 때문에 java 파일을 컴파일할 수 없다. (즉, 실행시킬 수 없다.)
- JRE는 JVM을 포함하고 있기 때문에 class 파일을 실행시킬 수 있다.
- Oracle은 Java11 이상의 JRE를 제공하지 않기 때문에, Java11부터는 JDK를 이용해야만 java 파일을 컴파일할 수 있다.

# JDK
- **J**ava **D**evelopment **K**it의 줄임말.
- JRE를 포함한다. 그리고 javac, jconsole, jhat 등 java 개발에 필요한 툴도 포함한다. ([툴 목록](https://docs.oracle.com/javase/8/docs/technotes/tools/))
- JDK는 컴파일러를 포함하고 있기 때문에 java 파일을 컴파일하여 class 파일을 생성할 수 있다.
- JDK는 JVM을 포함하고 있기 때문에 class 파일을 실행시킬 수 있다.
- Oracle은 Java11 이상의 **상용** JDK부터 유료화 정책을 적용했다. (상용이 아닐 경우 무료) 하지만 Openjdk, zulu jdk 등 타 벤더의 모든 jdk는 무료이다. (굳이 유료 JDK를 사용하지 않고 타 벤더사의 무료 jdk를 사용하는 회사들도 많다.)
