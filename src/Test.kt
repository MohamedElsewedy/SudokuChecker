fun main(){
    //Valid
    test(
        name = "test 1: not repeated numbers in rows and columns and empty cells , it should return true",
        result = isSudokuValid(listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = true
    )
    test(
        name = "test 2 : no repeated numbers in rows or columns, it should return true",
        result = isSudokuValid(listOf(
            listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
            listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
            listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
            listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
            listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
            listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
            listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
            listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
        )),
        correctResult = true
    )
    test(
        name = "test 3 : when all cells are empty, it should return true",
        result = isSudokuValid(listOf(
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
        )),
        correctResult = true
    )
    //inValid
    test(
        name = "test 4 : repeated number in a ROW, it should return false",
        result = isSudokuValid(listOf(
            listOf('5', '3', '-', '-', '7', '-', '7', '-', '-'), //7
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )
    test(
        name = "test 5 : repeated number in a COLUMN , it should return false",
        result = isSudokuValid(listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('7', '6', '-', '-', '-', '-', '2', '8', '-'), //7
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )

    test(
        name = "test 6 : repeated number in a SUBGRID, it should return false",
        result = isSudokuValid(listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '5', '-', '1', '9', '5', '-', '-', '-'), //5
            listOf('-', '9', '2', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )

    test(
        name = "test 7 : invalid CHAR, it should return false",
        result = isSudokuValid(listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '#', '-', '6', '-'), // #
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )
    test(
        name = "test 8 : invalid size , it should return false",
        result = isSudokuValid(listOf(
            listOf('1', '4', '-', '-', '7', '-', '-', '-', '-'),
            listOf('2', '-', '-', '-', '9', '5', '-', '-', '-'),
            listOf('3', '5', '9', '-', '-', '-', '-', '6', '-'),
            listOf('4', '-', '-', '3', '6', '-', '-', '-', '3'),
            listOf('5', '6', '-', '-', '-', '3', '-', '-', '1'),
            listOf('6', '-', '1', '-', '2', '-', '-', '-', '6'),
            listOf('7', '7', '-', '-', '-', '-', '2', '8', '-'),
            listOf('8', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('9', '8', '2', '-', '8') //
        )),
        correctResult = false
    )
    test(
        name = "test 9:  contain numbers but there are blank spaces, it should return false",
        result = isSudokuValid(listOf(
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', '1', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', '2', ' ', ' ', '4', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', '5', ' ', ' ', '7'),
            listOf(' ', ' ', '3', ' ', ' ', '9', '6', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', '8', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        )),
        correctResult = false
    )
    test(
        name = "test 10 :  blank spaces, it should return false",
        result = isSudokuValid(listOf(
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            listOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
        )),
        correctResult = false
    )
}
fun test(name:String,result: Boolean,correctResult: Boolean){
    if (result == correctResult){
        println("Success - $name")
    } else{
        println("Failed - $name")
    }
}