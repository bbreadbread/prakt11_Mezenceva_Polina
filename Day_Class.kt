class Day_Class (var day_numb: Int) {
    fun Weekend(day: DayOfWeekType) {
        if (day.number == 7 || day.number == 6) {
            println("${day.Get_Day()} - этот день считается выходным")
        } else {
            println("${day.Get_Day()} - этот день считается рабочим днем недели")
        }
    }
    fun NumDay(number: DayOfWeekType){
        println("Номер дня недели: ${number.ordinal+1}")
    }

    fun ReductionDay(day: DayOfWeekType)
    {
        print("Сокращение: ")
        if (day == DayOfWeekType.MONDAY) println("пн.")
        else if (day == DayOfWeekType.TUESDAY) println("вт.")
        else if (day == DayOfWeekType.WEDNESDAY) println("ср.")
        else if (day == DayOfWeekType.THURSDAY) println("чт.")
        else if (day == DayOfWeekType.FRIDAY) println("пт.")
        else if (day == DayOfWeekType.SATURDAY) println("сб.")
        else if (day == DayOfWeekType.SUNDAY) println("вс.")
    }
}