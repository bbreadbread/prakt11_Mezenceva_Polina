enum class ColorType (val rgb: Int){
    RED(0xFF0000),
    BLUE(0x0000FF),
    GREEN(0x008000),
    PINK(0xFFC0CB),
    ORANGE(0xFFA500);
    fun Get_Color(): String {
        return when (this) {
            RED -> "Розовый"
            BLUE -> "Голубой"
            GREEN -> "Зеленый"
            PINK -> "Розовый"
            ORANGE -> "Оранжевый"
        }
    }
}