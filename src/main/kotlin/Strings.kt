fun main() {
    println("Hello world and welcome to a quiz about space and time. You will be given 5 questions which will only have 1 right answer in every question so let's begin\n--------------------------")
    println("What is our galaxy called?")

    println("A. Milky Way Galaxy\nB. Black Eye Galaxy\nC. Whirlpool Galaxy\nD. Cartwheel Galaxy")
    var answer1 = "A"
    println("Please select an answer: ")
    var userAnswer = readLine()
    var result = answer1.compareTo(userAnswer.toString(), ignoreCase = true)
    if (result == 0)
        println("Correct!")
    else
        println("Sorry but that is not correct.")

    println("--------------------------")

    println("How old is our universe?")
    println("A. 100 Billions Years old\nB. 50.7 Billion years old\nC. 13.7 Billion years old\nD. 7.5 Billion years old")
    var answer2 = "C"
    println("Please select an answer: ")
    var userAnswer2 = readLine()
    var result2 = answer2.compareTo(userAnswer2.toString(), ignoreCase = true)
    if (result2 == 0)
        println("Correct!")
    else
        println("Sorry but that is not correct.")

    println("--------------------------")

    println("What do you call a large group of stars, dust, and gas?")
    println("A. Galaxy\nB. Universe\nC. Cluster\nD. Life")
    var answer3 = "A"
    println("Please select an answer: ")
    var userAnswer3 = readLine()
    var result3 = answer3.compareTo(userAnswer3.toString(), ignoreCase = true)
    if (result3 == 0)
        println("Correct!")
    else
        println("Sorry but that is not correct.")

    println("--------------------------")

    println("What is at the center of the Milky Way galaxy?\n")
    println("A. Dwarf Star\nB. Nothing\nC. White hole\nD. Black Hole")
    var answer4 = "D"
    println("Please select an answer: ")
    var userAnswer4 = readLine()
    var result4 = answer4.compareTo(userAnswer4.toString(), ignoreCase = true)
    if (result4 == 0)
        println("Correct!")
    else
        println("Sorry but that is not correct.")

    println("--------------------------")

    println("What is the only planet not named after a God?\n")
    println("A. Mars\nB. Earth\nC. Saturn\nD. Pluto")
    var answer5 = "B"
    println("Please select an answer: ")
    var userAnswer5 = readLine()
    var result5 = answer5.compareTo(userAnswer5.toString(), ignoreCase = true)
    if (result5 == 0)
        println("Correct!")
    else
        println("Sorry but that is not correct.")

    var correctAnswers = result + result2 + result3 + result4 + result5

    println("Congratulations you passed the quiz with $correctAnswers questions wrong!")
}