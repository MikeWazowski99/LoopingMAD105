fun main(args: Array<String>) {


    val person1 = classEmployee(1, "Barney", "Dino", 1,
        "815-555-1234", "815-555-1111", "815-555-2222")
    val person2 = classEmployee(2, "Fred", "Krueger", 2,
        "815-555-3334", "815-555-3111", "815-555-5552")
    val person3 = classEmployee(3, "Freddy", "Fazzbear", 3,
        "815-555-3334", "815-555-3111", "815-555-5552")

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()

}