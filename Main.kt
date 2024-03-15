import Color_Class as C
import  Day_Class as D

fun main()
{
    try {
        var day_numb = 0;
        var color_numb = 0;

        do {
            print("Введите номер дня недели от 1 до 7: ")
            day_numb = readln()!!.toInt()
        } while (day_numb < 1 || day_numb > 7)

        do {
            print("Введите номер цвета от 1 до 5: ")
            color_numb = readln()!!.toInt()
        } while (color_numb < 1 || color_numb > 5)

        var day = DayOfWeekType.SATURDAY
        var col = ColorType.PINK

        if (day_numb == 1) day = DayOfWeekType.MONDAY
        else if (day_numb == 2) day = DayOfWeekType.TUESDAY
        else if (day_numb == 3) day = DayOfWeekType.WEDNESDAY
        else if (day_numb == 4) day = DayOfWeekType.THURSDAY
        else if (day_numb == 5) day = DayOfWeekType.FRIDAY
        else if (day_numb == 6) day = DayOfWeekType.SATURDAY
        else if (day_numb == 7) day = DayOfWeekType.SUNDAY

        if(color_numb == 1) col = ColorType.RED
        else if(color_numb == 2) col = ColorType.BLUE
        else if(color_numb == 3) col = ColorType.GREEN
        else if(color_numb == 4) col = ColorType.PINK
        else if(color_numb == 5) col = ColorType.ORANGE

        val c = C(0)
        val d = D(0)

        println("День недели: ${day.Get_Day()}")
        println("Цвет: ${col.Get_Color()}\n")
        d.NumDay(day)
        d.ReductionDay(day)
        d.Weekend(day)

        c.ColorInfo(col)
        c.Reccomend(col)

    }
    catch (e:Exception){
        println("Ошибка!!")
    }
}