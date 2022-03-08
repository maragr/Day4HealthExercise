
object Day5FizzBuzzExercise extends App {
  //TODO create a FizzBuzz program based on children's game I think from Britain
  //for numbers 1 to 100 (included!)
  //print FizzBuzz if number divides evenly by both 5 and 7
  //print Fizz if number only divides by 5
  //print Buzz if number divides by 7
  //print number if number does not divide by 5 or 7
  //so something like this 1,2,3,4,Fizz,6,Buzz,..... 34,FizzBuzz,36,...., 99,Fizz (because 100 divides evenly by 5
  //printing can be done with number on new line like we have been doing

  var number1 = 5
  var number2 = 7
  for (n <- 1 to 100)
    if (n % number1 == 0 && n % number2 == 0)
      print(s"FizzBuzz,")
    else if (n % number1 == 0)
      print(s"Fizz,")
    else if (n % number2 == 0)
      print(s"Buzz,")
    else print(n + s",")}

