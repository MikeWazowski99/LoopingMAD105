class classEmployee constructor(var EmployeeID: Int, var firstName: String?, var lastName: String?, var EmployeeShift: Int?, var phoneHome: String?, var phoneWork: String?, var phoneCell: String?) {
    fun printAll() {
        println("Employee ID: "+ EmployeeID.toString() + "\n" + firstName + " " + lastName +
                "\nShift: " + EmployeeShift + "\nHome Phone: " + phoneHome + "\nWork Phone: " +
                phoneWork + "\nCell Phone: " + phoneCell)
    }
}
