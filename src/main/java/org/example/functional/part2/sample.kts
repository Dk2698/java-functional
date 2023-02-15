var factor = 2

val numbers = listOf(1, 2, 3)

val temp = numbers
        //.asSequence() //without this line, the pipeline is eagerly evaluated. With this line it is lazy evaluation
        .map { number -> number * factor }

factor = 0

temp.forEach { number -> println(number) }

//What will be the output of the above code?
//0 0 0
//2 4 6
//I have no clue