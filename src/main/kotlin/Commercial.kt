class Commercial(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    var propertyName: String,
    var multiProperty: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {

    val COMMERCIAL_RATE = 5.0
    val DISCOUNT_PERCENTAGE = 10

    fun calculateWeeklyCharge(): Double {
        val baseCharge = squareFootage / 1000 * COMMERCIAL_RATE
        return baseCharge * (1 - if (multiProperty) DISCOUNT_PERCENTAGE / 100.0 else 0.0)
    }

    override fun displayQuote() {
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square Footage: $squareFootage sqft")
        println("Property Name: $propertyName")
        println("Weekly Charge: $${calculateWeeklyCharge()}")
    }
}

class Resident(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    var senior: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {

    val RESIDENTIAL_RATE = 6.0
    val DISCOUNT_PERCENTAGE = 15

    fun calculateWeeklyCharge(): Double {
        val baseCharge = squareFootage / 1000 * RESIDENTIAL_RATE
        return baseCharge * (1 - if (senior) DISCOUNT_PERCENTAGE / 100.0 else 0.0)
    }

    override fun displayQuote() {
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square Footage: $squareFootage sqft")
        println("Senior Discount: ${if (senior) "Yes" else "No"}")
        println("Weekly Charge: $${calculateWeeklyCharge()}")
    }
}
