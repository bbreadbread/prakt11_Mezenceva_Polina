class Color_Class (var color_numb: Int){
    fun ColorInfo(color: ColorType) {
        println("Название цвета на английском: $color")

    }
    fun Reccomend(color: ColorType){
        print("Контрастный цвет для ${color.Get_Color()} по цветовому кругу: ")
        if (color == ColorType.RED) println("зеленый.")
        else if (color == ColorType.BLUE) println("оранжевый.")
        else if (color == ColorType.ORANGE) println("синий.")
        else if (color == ColorType.PINK) println("желто-зеленый.")
        else if (color == ColorType.GREEN) println("красный.")
    }
}