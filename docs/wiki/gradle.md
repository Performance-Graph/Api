### Gradle 이란?
- gradle 은 Java 로 개발된 어플리케이션을 포함한 다양한 소프트웨어의 빌드 자동화를 위해 오픈소스로 개발된 도구입니다.
  - 특징
    - 빌드 스크립트 작성 언어
      - 다른 빌드 도구인 Maven 에서는 XML 언어를 사용하는 반면, gradle 은 JVM 에서 동작하는 스크립트 언어 ‘그루비’ 기반의 DSL(Domain Specific Language)를 사용합니다.
      - 그루비(Groovy)는 Java 에 파이썬, 루비, 스몰토크등의 특징을 더한 동적 객체 지향 프로그래밍 언어입니다. 이로 인해 자바 개발자들에 러닝커브가 낮으며 쉽게 사용할 수 있습니다.
    - 고성능
      - 빌드 캐시를 사용하여 이전 실행 또는 다른 시스템(공유 빌드 캐시 사용)의 작업 출력을 재사용할 수 있어 매우 빠른 빌드를 지원합니다.
    - 다양한 IDE 지원
      - 대표적으로 많이 사용하는 Android Studio, IntelliJ IDEA, Eclipse, Visual Studio 와 상호작용 하여 gradle 빌드를 수행할 수 있습니다.
    - 간결함
      - Maven 이 사용하는 XML 의 경우 구조적으로 작성해야 하는 내용이 많은 반면, gradle 은 개발자가 유연하게 빌드 과정에서 필요한 작업(Task) 를 작성할 수 있으므로 훨씬 가독성이 뛰어납니다.
    - 종속성 제거
      - gradle 을 사용할 때 권장되는 gradle wrapper 를 사용하여, 환경에 상관없이 gradle 을 수동으로 설치할 필요 없이 wrapper 에 정의된 gradle 버전을 다운로드 하여 사용할수 있습니다.
      - 이는 어느 환경에서도 동일한 빌드 및 결과를 얻을 수 있다는 뜻이고, 다시말하면 <b>환경의 종속성이 없다</b> 는 것입니다. 이것이 gradle 의 강력한 특징 중 하나입니다.
  - 구성
    <pre><code>{ ├── build.gradle<br>
      ├── gradle<br>
      │   └── wrapper<br>
      │       ├── gradle-wrapper.jar<br>
      │       └── gradle-wrapper.properties<br>
      ├── gradlew<br>
      ├── gradlew.bat<br>
      ├── settings.gradle<br>
      └── src<br>
          ├── main<br>
          │   ├── java<br>
          │   │   └── temp<br>
          │   │       └── App.java<br>
          │   └── resources<br>
          └── test<br>
                ├── java<br>
                │   └── temp<br>
                │       └── AppTest.java<br>
                └── resources<br>}</code></pre>
    - build.gradle
      - 빌드 과정에서 필요한 처리를 작성하는 파일입니다.
      - 실행 될 작업(task), 의존성(defendency) 등을 groovy 언어로 작성합니다.
    - gradle 디렉토리
      - gradlew 설정파일이 위치하는 경로입니다.
    - gradlew, gradlew.bat
      - 각각 Unix, 윈도우 환경용 gradlew 실행 스크립트입니다.
    - settings.gradle
      - 프로젝트의 설정을 작성하는 파일입니다.
    - src
      - 프로젝트 소스코드 및 테스트를 작성하는 기본 경로입니다.
  - 사용법
    - 기본적으로 gradle [task 명] 또는 gradlew 사용 시 ./gradlew [task 명] 으로 사용합니다.
    - 빌드
      - gradle
        - gradle build
      - gradlew
        - ./gradlew build
    - 이전 빌드 초기화
      - gradle
        - gradle clean
      - gradlew
        - ./gradlew clean
