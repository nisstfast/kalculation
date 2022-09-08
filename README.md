# kalculation
####복잡한 kotlin의 연산(ex. Random) 코드를 더욱 간결하게 해줍니다.

----------------------------------------------------------------

일반적인 kotlin으로 1~5의 숫자중 하나를 랜덤으로 뽑는다 해봅시다.

``` Kotlin
fun main(args: Array<String>) {
    val range = (1..5)
    println(range.random())
}
```

그렇다면 이렇게 복잡하고 보기 힘든 코드가 나오게됩니다.

----------------------------------------------------------------

하지만 kalculation의 RandomK( ) 함수를 활용하면

``` Kotlin
fun main(args: Array<String>) {
    val variable = RandomK(1,5) // variable == Int
    println(variable)
}
```

이렇게 더욱 보기 쉬운 코드를 활용해서 랜덤한 숫자를 출력할 수 있습니다

----------------------------------------------------------------

Gradle

``` Gradle
dependencies {
    implemetation("com.github.nisstfast:kalculation:version")
}
```



