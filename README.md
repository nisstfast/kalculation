# kalculation
#### 복잡한 kotlin의 연산(ex. Random) 코드를 더욱 간결하게 해줍니다.

----------------------------------------------------------------

일반적인 kotlin으로 1~5의 숫자중 하나를 랜덤으로 뽑는다 해봅시다.

``` Kotlin
fun main() {
    val range = (1..5)
    println(range.random())
}
```

그렇다면 이렇게 이해하기 힘든 코드가 나오게됩니다.

----------------------------------------------------------------

하지만 kalculation의 Random( ) 함수를 활용하면

``` Kotlin
fun main() {
    println(Random(1,5))
}
```

이렇게 더욱 이해하기 쉬운 코드를 활용해서 랜덤한 숫자를 출력할 수 있습니다.  
이외에도 여러가지 편리한 기능들이 포함되어 있습니다.

----------------------------------------------------------------

Gradle

``` Gradle
repositories {
    maven("https://jitpack.io")
}
```
``` Gradle
dependencies {
    implementation("com.github.nisstfast:kalculation:<version>")
}
```



