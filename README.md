# kalculation
복잡한 kotlin의 연산(ex. Random) 코드를 더욱 간결하게 해줍니다.

ex. 평소 kotlin으로 1~5의 숫자중 하나를 랜덤으로 뽑는다 해봅시다.

fun main(args: Array<String>) {
    val range = (1..5)
    println(range.random())
}

그렇다면 이렇게 복잡하고 보기 힘든 코드가 나오게됩니다.
하지만 kalculation의 RandomK() function을 활용하면

fun main(args: Array<String>) {
    val variable = Randomk(1,5) // variable == Int
    println(variable)
    
}

이런 코드를 사용해서 단 한줄의 코드만으로 랜덤한 숫자를 출력할 수 있게됩니다.
또한 꾸준히 업데이트 될 예정입니다.

