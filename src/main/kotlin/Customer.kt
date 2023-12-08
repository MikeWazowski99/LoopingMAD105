open class Customer (    var customerName: String = "",
                         var customerPhone: String = "",
                         var customerAddress: String = "",
                         var squareFootage: Double = 0.0){
    open fun calculateWeeklyCharge(rate: Double, discountPercentage: Int = 0): Double {
        val baseCharge = squareFootage / 1000 * rate
        return baseCharge * (1 - discountPercentage / 100.0)
    }
    open fun displayQuote() {
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square Footage: $squareFootage sqft")
    }
}

