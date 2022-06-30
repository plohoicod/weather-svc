# weather-svc

Для запуска необходимо сбилдить приложение в JAR файл:

```
mvn clean install
```
(команду необходимо запускать в корне проекта)

Далее полученный JAR файл нужно скопировать в папку `src/main/docker`


![image](https://user-images.githubusercontent.com/35569768/176773934-f92441ba-44d1-4910-b6d0-86f5ee07f973.png)

Затем можно развернуть контейнеры для приложения и базы данных с помощью команды:
```
docker-compose up
```

Приложение будет доступно по адресу `http://localhost:8084/` (можно посмореть и потестировать API через swagger `http://localhost:8084/swagger-ui`)

![image](https://user-images.githubusercontent.com/35569768/176775174-d0f6a13b-4193-4617-bca9-5430734c269f.png)


База данных Postgresql доступна по адресу `http://localhost:8083/`. Название базы, имя пользователя и пароль `postgres`
