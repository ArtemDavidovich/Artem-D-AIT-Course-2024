package tasks;

//**Задачи на повторение:**
//**Условия**
//**Задача 1.**
//По данному числу n закончите фразу “На лугу пасется...” одним из возможных продолжений: “n коров“, “n корова“, “n коровы“, правильно склоняя слово “корова“.
//Входные данные: Дано целое положительное число n (n <= 10),
//Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.
//**Задача 2(*).**
//Написать программу, определяющую, является ли год високосным. Значение года задается в программе или вводится пользователем с клавиатуры.
//Для того чтобы год был високосным, он должен: делится без остатка на 4 и, либо не должен делится без остатка на 100, либо если он делится на 100, то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.
//**Циклы**
//**Задача 1.**
//Распечатать 10 строк: “Task1”. “Task2". … “Task10”.
//Использовать цикл while.
//**Задача 2.**
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Использовать цикл do...while.
//**Задача 3.**
//С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
//Пример:для числа n = 3
//1 в кубе 1
//2 в кубе 8
//3 в кубе 27
//...
//**Задача 4.**
//С помощью цикла while написать программу, выводящую на экран результат умножения данного натурального числа n на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех натуральных чисел от 0 до n.
//**Задача 5.**
//Программа просит пользователя ввести строку
//“/|\’Hello’ ‘World’\|/ @*#&$%^_+-{[xx]} !”
//Если пользователь вводит строку правильно, то программа распечатывает на экран благодарность и завершает работу.
//Если вводится неверная строка, то программа просит ввести строку снова, до тех пор, пока у пользователя это не получится.
//Дополнительно: считать кол-во попыток, которые потребовались пользователю для введения правильной строки.
//По окончанию - вывести число попыток на экран.
//**Ввод данных с клавиатуры**
//**Задача 1.**
//Реализовать приложение, которое запрашивает информацию о вас, и выводит итоговую строку.
//Пример:
//Введите ваше имя:
//Иван
//Введите вашу фамилию:
//Иванов
//Введите ваш город:
//Берлин
//Введите ваш возраст:
//29
//Введите ваш рост (в метрах):
//1.80
//Вывод в консоль:
//Меня зовут Иван Иванов, мне 29 лет, мой город Берлин, мой рост 180 см.
//----------------------------------
//**Игра “Угадай число” (*)**
//Цель:
//Разработать консольную игру, в которой пользователь должен угадать случайно сгенерированное число в пределах от 1 до 100. Программа должна давать подсказки после каждой попытки, сообщая, больше или меньше введенное число, чем загаданное. Игра продолжается до тех пор, пока число не будет угадано. После угадывания, программа должна вывести количество попыток, потраченных на угадывание, и предложить пользователю сыграть еще раз.
//Шаги реализации:
//Генерация случайного числа.
//Использовать Math.random() для генерации случайного числа в заданном диапазоне (1-100).
//Основной игровой цикл:
//Использовать цикл (do-while или while), чтобы запросить у пользователя ввод числа до тех пор, пока не будет угадано загаданное число.
//Использовать условные операторы для сравнения введенного числа с загаданным и вывода подсказок (“слишком большое“, “слишком маленькое“).
//Подсчет попыток:
//Вести подсчет числа попыток, которые пользователь сделал для угадывания числа.
//Окончание игры и предложение повторить:
//После угадывания числа вывести количество попыток и спросить пользователя, хочет ли он сыграть еще раз.
//Если да, игра начинается заново с генерации нового случайного числа; если нет — программа завершается.
//Дополнительные условия:
//Обеспечить обработку ввода, чтобы программа принимала только числа и корректно реагировала на некорректный ввод (например, буквы или символы).
//Можно добавить функционал для ограничения максимального количества попыток.
//11:19
//Решения отправляйте в свой репозиторий на GitHub.

public class Tasks {
}
