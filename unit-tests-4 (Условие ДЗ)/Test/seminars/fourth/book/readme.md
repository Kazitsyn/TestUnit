### Задание 1. Ответьте письменно на вопросы:

1. Почему использование тестовых заглушек может использоваться при написании модульных тестов?
* Использование тестовых заглушек Позволяет изолировать тестируемый модуль от зависимостей, 
которые могут быть подключены или включены во время тестирования. 
Это позволяет более эффективно и точно тестировать функциональность модуля и выявлять потенциальные ошибки и проблемы. 
Также использование тестовых заглушек позволяет легко создавать различные схемы тестирования и проверять работу модуля
в различных условиях.
2. Какой тип тестовой заглушки следует использовать, если вам нужно проверить, 
что метод был вызван с приведенными аргументами?
* Для вызова метода проверки с аргументами следует использовать моки (mocks). 
Моки - это тестовые заглушки, которые имитируют поведение отдельных объектов и позволяют проверять, 
что методы были вызваны с учетом аргументов и в нужном порядке.
3. Какой тип тестовой заглушки следует использовать, 
если вам просто нужно вернуть дополнительное значение или добавить в ответ на метод вызова?
* Для этой цели следует использовать заглушку (заглушку). 
Этот объект включает определенные предопределенные данные и использует их для ответа на вызовы во время тестов.
4. Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с API или базой данных?
* Для имитации синхронизации с API-интерфейсом или базой данных можно использовать моки (mocks). 
Моки — это тестовые заглушки, которые имитируют поведение реального объекта или сервиса, 
но не включают выполнение операций.