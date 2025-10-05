object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Only positive numbers are allowed" }
        
        var starting = start
        var count = 0
        if(starting <= 0)
            return 0
        
        while(starting != 1) {
            count++
            starting = if(starting%2 == 0) {
                 starting/2 
            }
            else {
                starting*3+1
            }
        }
        return count
    }
}
