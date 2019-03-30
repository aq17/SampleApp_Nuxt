import java.math.BigInteger

var capital = Map("US" -> "Washington", "French" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("French"))

println("Hello,World!")

def factorial(x:BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorial(x.subtract(BigInteger.ONE)))