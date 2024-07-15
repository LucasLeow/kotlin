package learnKotlin

fun main(args: Array<String>) {

    // 1. Declare non-nullable float
    val myFloat: Float = -3847.384f

    // 2. Change to nullable variable
    val myNullableFloat: Float? = -3837.384f


    // 3. Declare an array of non-nullable Short. Size 5. assign value 1 to 5
    val myShortArr: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // 4. Declare array of nullable ints, init with values 5, 10, 15 ... 200
    val myNullableIntArray: Array<Int?> = Array(200 / 5) {
        i -> (i * 5) + 5
    }

    // 5. Have to call java method with signature method1(char[] chrArr)
    // Create Kotlin Arr with values 'a', 'b', 'c' and call method

    val myPrimitiveCharArr = charArrayOf('a', 'b', 'c')

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using 1 line, declare another variable, assign x.toLowerCase() when x isn't null and "I give up!" if null

    val y: String = x?.toLowerCase() ?: "I give up!"
}