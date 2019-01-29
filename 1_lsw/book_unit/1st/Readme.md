본문 : https://ridickle7.github.io/2018/09/15/2018-kotlin-in-Action-%EC%8A%A4%ED%84%B0%EB%94%94-1st/ 

# Part1 코틀린 소개
첫 장에서는 코틀린의 일반적인 특성을 설명한다고 한다.
[커니님께서 작성한 코틀린 책](https://kyobobook.co.kr/product/detailViewKor.laf?mallGb=KOR&ejkGb=KOR&barcode=9788966262137&orderClick=JAj)을 읽었으나 내용을 다 잊어버렸는데(...)   
이번 장을 보고 기억을 되 찾아야겠다.

<br>

## 1장. 코틀린이란 무엇이며 왜 필요한가?
- 간결하고 실용적
- 자바 코드와의 상호운용성 중시
- 성능은 자바와 같은 수준

<br>

### 1.1. 코틀린 맛보기
- 코틀린 코드 간편 실행 : https://try.kotlinlang.org/
<pre><code>class _1_1_ATasteOfKotlin {             // 1. quote 기호를 통해 새로운 이름 설정을 할 수 있다.
    data class Person(                  // 2. data 클래스
            val name: String,
            val age: Int = 0,           // 3. default 값을 넣어줄 수 있다.
            val phoneNum: Int? = null)  // 4. nullable 값 설정이 가능하다.

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val persons = listOf(
                    Person("Alice"),
                    Person("Bob", age = 29),           // 5. 파라미터를 명시하여 넣어줄 수 있다.
                    Person("ridickle", phoneNum = 10)) // 6. 파라미터 순서에 종속적이지 않다.

            // maxBy : Collection 내장 함수
            val oldest = persons.maxBy { it.age ?: 0 } // 7. 람다 식 & 엘비스 연산자
            println("The oldest person is $oldest")    // 8. 문자열 템플릿

            // 결과 : The oldest person is Person(name=Bob, age=29)  // 9. toString 내장
        }
    }
}</code></pre>
<span style="color:#CCCCCC">~~주관적으로~~</span> 코틀린만의 특성을 위와 같이 찾아볼 수 있다.

<strong>1. quote 기호를 통해 새로운 이름 설정을 할 수 있다.</strong>
- 위와 같이 앞에 숫자를 넣을 수도 있다.
- 하지만 dot(.) 이 안되는 등 일부 exception 이 있다.

<strong>2. data 클래스</strong>
- 데이터 저장에 특화된 클래스를 생성 가능하다.
- 편리한 함수를 제공한다. (equals(), hashCode(), toString(), componentN() 등)
- interface 이외 상속은 불가능하다 (여러가지 잠재적 문제가 있다. 이 [링크](https://blog.jetbrains.com/kotlin/2015/09/feedback-request-limitations-on-data-classes/)에서 자세한 내용 확인 가능)

<strong>3. default 값을 넣어줄 수 있다.</strong>
- 값이 안 들어갈 경우에 대한 기본값 설정이 가능하다.

<strong>4. nullable 값 설정이 가능하다.</strong>
- ?를 통해 null 값을 넣어줄 수 있다.

<strong>5. 파라미터를 명시하여 넣어줄 수 있다.</strong>
- 파라미터를 직접 명시하여 값을 넣어줄 수 있다.
- builder 패턴이 울고 있는 모습이 보인다(?)

<strong>6. 파라미터 순서에 종속적이지 않다.</strong>
- 5번의 연장선상 내용이다.
- 기존이라면 에러가 나거나, age에 값이 들어가 이상한 결과가 나와야한다.
  하지만 kotlin에는 파라미터 직접 명시 및 데이터 주입으로 유연한 처리가 가능하다.
  
<strong>7. 람다 식 & 엘비스 연산자</strong>
- 람다 식
  - function에 function을 전달하고, 이를 콜 하게 하는 것
  - SAM (Single Abstract Method) 에 대해서는 {} 식을 직접 만들수 있다.

  <pre><code>class MainActivity : AppcompatActivity {
      // ex (setOnClickListener)
      FloatingActionButton fab = findViewById(R.id.fab);
      
      fab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            // Something
          }
      });
      
      fab.setOnClickListener { /* Something */ }
  }</code></pre>
  - collection (Array, List 등) 에서 효율적으로 활용 가능
  - closure 
  - 할많다하... (할말이 많으므로 다음에 하겠습니다...)

- 엘비스 연산자
  - 만약 왼쪽의 값이 비어있을 시, 오른쪽 값을 대입한다.
  - null 체크 및 null safety

<strong>8. 문자열 템플릿</strong>
- \+ 로 string을 처리하는 방식 -> $ 키워드를 활용해 "" 안에 한 번에 처리

<strong>9. toString 내장</strong>
- 2번의 연장선상 내용
- 편리한 함수를 제공한다. (equals(), hashCode(), toString(), componentN() 등)

<br>

### 1.2. 코틀린의 주요 특성
#### 1.2.1 대상 플랫폼 :  서버 안드로이드 등 자바가 실행되는 모든 것
- 코틀린의 주 목적 : Java보다 **간결**하고 **생산적**이며 **안전한** 대체 언어 제공
- 코틀린 활용 영역
  >- 서버상의 코드 (JSP/Servlet)
  >- 안드로이드
  >- \+ [인텔의 OS 엔진](https://github.com/moe-java-samples) : IOS
  >- \+ [토네이도FX](https://github.com/edvin/tornadofx) / 자바FX : 데스크톱 서비스
  >- \+ javascript 지원 (kotlin 1.1+)

#### 1.2.2 정적 타입 지정 언어
- Kotlin은 정적 타입 지정 언어 (하지만 **타입 추론**을 지원)
- class, interface, generics
- null safety
- 함수형 타입 지원
> **참고 (다른 글에 옮길 예정)**
> **Q : 정적 타입 지정이라 함은 (ex> Java)**
> - 모든 프로그램 구성 요소 타입을 컴파일 시점에 알 수 있다.  
> - 프로그램 안에서 객체의 필드나 메소드를 사용할 때마다 컴파일러가 타입을 검증한다.  
>  
>  <br>
>  
> **장점** 
> - 컴파일 단에서 검증하므로 메소드 호출이 더 빠름
> - 컴파일 시점에서 오류 미리 catch
> - 어떤 타입인지 바로 확인 가능
> - 안전하게 리펙토링 가능 / 다른 지원 기능도 효과적으로 만들 수 있음 => 크게 체감을 못하겠음...
>  
>  
> **단점** 
> - 일일히 명시 필요
> - 코드길이 up
> - 데이터 구조 복잡
> <br>
>  
> ------------------------------
> **Q : 동적 타입 지정이라 함은 (ex> Groovy, JRuby)**
> - 타입과 관계없이 모든 값을 변수에 넣을 수 있다.
> - 프로그램 안에서 객체의 필드나 메소드를 사용할 때마다 실행 시점에서 타입을 검증한다.  
>  
>  <br>
>  
> **장점**
> - 타입 추론
> - 코드길이 down
> - 데이터 구조 유연
>  
>  
> **단점** 
> - 실행 시점에서 모든 것을 확인하므로 성능적 이슈 발생 가능
> - 실행 시점 오류 발생률이 높아짐  

#### 1.2.3 함수형 프로그래밍과 객체지향 프로그래밍
- 코틀린 = 함수형 프로그래밍 + 명령형 프로그래밍
> 참고
> **Q : 함수형 프로그래밍이라 함은**
> - 함수를 일반 값처럼 다룬다. (first-class)  
> - 만들어지고 나면 내부상태가 바뀌지 않는 불변 객체를 사용
> - 부수 효과 없음  
>> (함수 외부나 다른 바깥 환경과 상호작용하지 않음)  
>> (입력 같을 시 항상 같은 출력)
>> (다른 객체 상태 변경하지 않음)  
>  
>  <br>
>  
> **장점** 
> - 간결함
> - 다중 스레드를 사용해도 안전함 (<- 불변 데이터 구조 사용 + 순수 함수)
> - 테스트 용이
> ------------------------------
> **Q : 명령형 프로그래밍이라 함은**
> - 프로그래밍의 상태, 상태를 변경시키는 구문의 관점에서 연산을 설명
> - 수행하는 절차를 자세하게 설명하는 데 중점을 둠 (절차지향)

#### 1.2.4 무료 오픈소스
- 모두 오픈소스이며 아파치2 라이선스하에 무료 제공 ([개발 링크](https://github.com/jetbrains/kotlin))

### 1.3. 코틀린 응용
- 서버 사이드, 안드로이드에서 많이 쓰임

#### 1.3.1 코틀린 서버 프로그래밍
- 기존의 코드와 호환성이 좋으며 상호운용도 가능함 (Java)
- 코틀린만의 새로운 기술 제공 (Builder Pattern, DSL 기능)
  <pre><code>
  class NewTechnology{
    // ex> HTML 생성 라이브러리
    fun renderPersonList(persons: Collection<Person>) = 
    createHTML().table{
        for(person in persons){
            tr{
              td { +person.name }
              td { +person.age }
          }
        }
    }

    // ex> 영속성 프레임워크 (exposed 프레임워크)
    object CountryTable : IdTable() {
        val name = varchar("name", 250).uniqueIndex()
        val iso = varchar("iso", 2).uniqueIndex()
    }

    class Country(id : EntityID) : Entity(id) {
        var name = String by CountryTable.name
        var iso = String by CountryTable.iso
    }

    val russia = Country.find {
        CountryTable.iso.eq("ru")
    }.first()

    println(russia.name)
  }</code></pre>

#### 1.3.2 코틀린 안드로이드 프로그래밍
- android에 적합한 kotlin과 anko 라이브러리 활용 가능
  <pre><code>verticalLayout {
      nal name = editText()
      button("say Hello"){
          onClick { toast ("Hello, %{name.text}!") }
      }
  }</code></pre>
- Null Safety 처리를 통한 ANR 확률 줄임
- 인라인 등을 활용한 성능상의 차이를 없앰

### 1.4. 코틀린의 철학
- 코틀린은 자바와의 상호 운용성에 초점을 맞춘 실용적이고 간결하며 안전한 언어이다.

#### 1.4.1 실용성
- 개발자의 니즈를 최대한 반영한 언어

#### 1.4.2 간결성
- 작성이 번거로운 코드를 묵시적으로 제공, 람다를 통한 코드 라인 줄이기를 최대한 반영한 언어

#### 1.4.3 안전성
- Null Safety & 타입 추론 등을 통한 안전성을 추구한 언어

#### 1.4.4 상호운용성
- 자바의 기존 라이브러리를 계승할 수 있고, 상호운용성에 힘을 실은 언어

### 1.5. 코틀린 도구 사용
자신의 컴파일러 설정 방법을 확인하고 싶을 시 http://kotlinlang.org/docs/tutorials 참고

#### 1.5.1 코틀린 코드 컴파일

#### 1.5.2 인텔리J 아이디어와 안드로이드 스튜디오의 코틀린 플러그인
- 안드로이드 스튜디오, IntelliJ에서 코틀린 사용 가능

#### 1.5.3 대화형 셀
- REPL을 통해 간단한 코틀린 코드 테스트 가능 (정규식 등)

#### 1.5.4 이클립스 플러그인
- 이클립스 마켓플레이스에서 선택 가능

#### 1.5.5 온라인 놀이터
- http://try.kotl.in/ 을 통한 진행 가능

#### 1.5.6 자바-코틀린 변환기
- Code -> Convert Java File to Kotlin File 을 통해 JAVA와의 100%(를 자랑하지만 99%) 호환 가능
