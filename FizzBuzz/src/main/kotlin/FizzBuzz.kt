private const val FIZZ = "Fizz"
private const val BUZZ = "Buzz"
private const val FIZZBUZZ = "$FIZZ$BUZZ"

fun fizzBuzz(number: Int): String
{
    return when
    {
        number.isDivisibleBy(3, 5) -> FIZZBUZZ
        number.isDivisibleBy(3)    -> FIZZ
        number.isDivisibleBy(5)    -> BUZZ
        else                       -> "$number"
    }
}

private fun Int.isDivisibleBy(vararg divisors: Int) = divisors.all { this % it == 0 }

