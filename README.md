# HeroesOfMightAndMagic

## Объектно - ориентированное программирование Java(семинары).
### Урок 1.  Принципы ООП: Инкапсуляция, наследование, полиморфизм.
Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. Для каждого сформировать список свойств и возможных действий. 
Напрнимер свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать 
Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. 
Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
В основной программе создать по одному экземпляру каждого типа персонажей.

### Урок 2. Принципы ООП Абстракция и интерфейсы. 
#### Пример проектирования
Доработать дерево классов так, чтобы экземпляры классов создавались конструктором с именем в параметре а остальные параметры 
инициализировали сами в зависимости от персонажа. Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo(); 
Добавить реализацию интерфейса в ваш коренной абстрактный класс. Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", 
"Я снайпер" и так далее в зависимости от типа персонажа. 
В основном классе создать список и добавить в него 10 случаных персонажей. Пройти по списку и вывести строку возвращаемую getInfo.



### Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования.
В материалы добавил heroes.xls с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. 
Создать в основной программе два списка. Положить в них по 10 случайных персонажей. 
В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. 
Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.

### Урок 4. ООП: Обобщения. ч1
- 1 Создать класс с описанием координат, x и y.
- 2 Добавить в абстрактный класс порле с координатами и пробросить его инициализацию до конструкторов персонажей. 
- Farmer farmer = new Farmer(getName(), x, y);
Реализовать метод step() лучников. 
- 3.1 Если жизнь равна нулю или стрел нет, завершить обработку. 
- 3.2 Поиск среди противников наиболее приближённого. 
- 3.3 Нанести среднее повреждение найденному противнику. 
- 3.4 Найти среди своих крестьянина. 
- 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.

### Урок 5. От простого к практике
Пример реализации шага лучника в архиве. Доработать шаг лучника в своём проекте. Сделать степ крестьян - если не труп то state = "Stand"
если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
