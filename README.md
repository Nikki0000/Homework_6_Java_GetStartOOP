**Задание**

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.


**Алгоритм решения задачи**

*Пример входных данных*
Aidar - 111, 222, 000 \n
Alena - 777
Oleg - 2222, 45678, 452, 567, 33333

1 class: User {name, List<Integer>}
2 class: PhoneBook { Map(где ключем будет User) }

User - переопределить 2 метода Object: equals и hashCode

PhoneBook -> 
  addPhone(long phone) - добавляет телефон, 
  removePhone(long phone) - удаляет телефон, 
  printAll() - должен будет вывести значения нашей map, но в порядке убывания числа телефонов

*Пример выходных данных*
Oleg - 2222, 45678, 452, 567, 33333
Aidar - 111, 222, 000
Alena - 777

чтобы вевысти в отсортированном виде, нужно использовать Comporator
