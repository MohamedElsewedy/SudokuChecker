
fun main() {

}
fun isSudokuValid(sudoku: List<List<Char>>): Boolean {

    if (sudoku.size != 9) {
        return false
    }
    for (row in sudoku) {
        if (row.size != 9) {
            return false
        }
    }


    for (row in sudoku) {
        for (cell in row) {
            if (cell != '-' && cell !in '1'..'9' && cell != ' ') {
                return false
            }
            if (cell == ' ') {
                return false
            }

        }
    }
    // rows duplicates
    for (row in sudoku) {
        val seen = mutableSetOf<Char>()
        for (cell in row) {
            if (cell != '-' && !seen.add(cell)) {
                return false
            }
        }
    }
    //  columns duplicates
    for (col in 0..<9) {
        val seen = mutableSetOf<Char>()
        for (row in 0..<9) {
            val cell = sudoku[row][col]
            if (cell != '-' && !seen.add(cell)) {
                return false
            }
        }
    }

    for (subgridRow in 0..<3) {
        for (subgridCol in 0..<3) {
            val seen = mutableSetOf<Char>()
            for (row in subgridRow * 3..<(subgridRow + 1) * 3) {
                for (col in subgridCol * 3..<(subgridCol + 1) * 3) {
                    val cell = sudoku[row][col]
                    if (cell != '-' && !seen.add(cell)) {
                        return false
                    }
                }
            }
        }
    }
    return true
}