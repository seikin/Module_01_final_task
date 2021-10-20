/*module_01_final_task by seikin alexey
Учитывая массив целых чисел nums и целочисленную переменную target,
верните индексы двух чисел из массива так,
чтобы их сумма была равна target.

• Пример входных данных: nums = arrayOf(2,7,11,15), target = 9

• Пример результата: [0,1] (т.к. nums[0] + nums[1] = 9)
*/
fun main(){
    try {
        val nums: Array<Int> = arrayOf(1,3,5,7,9,12,15,17,19,21,616,5165,151,42,5,57,8,7,8)
        print("Введите значение переменной target: ")
        val target = readLine()!!.toInt()
        val size = nums.size
        var i = 0
        println("Всего индексов в массиве: $size")
        while (i <= size-1){
            for (index in nums.indices){
                if (i < index) {
                    val sum = nums[i] + nums[index]
                    when (sum){
                        target -> println("Для индексов [${i}:${index}] со значениями (${nums[i]}+${nums[index]}) сумма значений = $sum")
                    }
                }
            }
            i++
        }
    } catch (e: Exception){
        println("Можно вводить только целые числа")
    } finally {
        println("Программа завершена")
    }
}