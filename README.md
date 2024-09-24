#### Библиотека внешних DTO для проекта shop_kotlin (предназначена для опытов с Jenkins/Nexus)

Основной проект [https://github.com/cherepakhin/shop_kotlin](https://github.com/cherepakhin/shop_kotlin)

Классы для обмена с внешними источниками данных: 

AddressExtDTO - адрес
StockExtDTO - описание внешнего склада
StockBalanceExtDTO - остатки на внешних складах

ErrMessages - сообщения об ошибках

### Сборка Jenkins

Сборка Jenkins:
![Сборка Jenkins](https://github.com/cherepakhin/shop_kotlin_extdto/blob/main/doc/jenkins_build.png)

Итог в Nexus:
![Итог в Nexus](https://github.com/cherepakhin/shop_kotlin_extdto/blob/main/doc/nexus.png)

### Разное

Получение адреса git репозитория

````shell
>git config --get remote.origin.url

https://github.com/cherepakhin/shop_kotlin_extdto.git

````

