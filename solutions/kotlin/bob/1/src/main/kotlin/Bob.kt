object Bob {
        fun hey(input: String): String {
            val trimmed = input.trim()
    
            return when {
                // Silence (empty or only whitespace)
                trimmed.isEmpty() -> "Fine. Be that way!"
    
                // Yelled question (ends with ? and all uppercase letters)
                trimmed.endsWith("?") && trimmed.any { it.isLetter() } && trimmed == trimmed.uppercase() ->
                    "Calm down, I know what I'm doing!"
        
                // Question
                trimmed.endsWith("?") -> "Sure."
        
                // Yelling (only uppercase letters for letters present)
                trimmed.any { it.isLetter() } && trimmed == trimmed.uppercase() ->
                    "Whoa, chill out!"
        
                // Anything else
                else -> "Whatever."
            }
        }
}
