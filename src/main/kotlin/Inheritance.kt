fun main() {
    var residential = Resident(
        "John Doe",
        "123-456-7890",
        "123 Main Ave",
        20000.0,
        true
    )
    residential.displayQuote()

    var commercial = Commercial(
        "ABC Corp",
        "987-654-3210",
        "456 Business St",
        15000.0,
        "Office Building",
        true
    )
    commercial.displayQuote()
}