/*module_01_final_task by seikin alexey
Учитывая массив целых чисел nums и целочисленную переменную target,
верните индексы двух чисел из массива так,
чтобы их сумма была равна target.

• Пример входных данных: nums = arrayOf(2,7,11,15), target = 9

• Пример результата: [0,1] (т.к. nums[0] + nums[1] = 9)
*/

fun main() {
    val num = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
    val target = 19

    for (i in num.indices) {
        for (j in i + 1 until num.size) {
            if (num[i]+num[j] == target)
                println("$i, $j тк ${num[i]} + ${num[j]} равно $target")
        }
    }
}