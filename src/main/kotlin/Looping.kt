fun main(){
    var userChoice = 0


    do {
        println("\nPlease enter the number of your selection")
        println("1) Classic")
        println("2) Jazz")
        println("3) Hip-Hop")
        println("4) Rap")
        println("5) Country")
        println("6) Speakers")
        println("7) Exit")

        print("Please enter an option: ")
        userChoice = readLine()!!.toInt()


        println("You have selected: $userChoice")

        if (userChoice > 7)
            println("You have selected an invalid entry, please try again")
        else if (userChoice == 6)
            println("Speakers\n")
        else if (userChoice == 5)
            println("Country\n")
        else if (userChoice == 4)
            println("Rap\n")
        else if (userChoice == 3)
            println("Hip-Hop\n")
        else if (userChoice == 2)
            println("Jazz\n")
        else if (userChoice == 1)
            println("Classic\n")
        else if (userChoice < 1)
            println("You have selected an invalid entry, please try again")

    } while(userChoice != 7)

}