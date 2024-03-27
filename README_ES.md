### Ferramentas para métricas

#### Sonar
A primeira coisa a se fazer é subir o container para rodar o sonar. Para isso, basta executar o docker-compose.yaml presente em
`/sonar`.
Após isso, para rodar a ferramenta de análise, utilize o comando: ```gradle sonar -D sonar.token=sqa_29ff240e37980a6d146cb2db09b9ba7047767fea```, colocando o 
token do sonar armazenado em `gradle.properties`

Depois basta acessar `localhost:9000`, acessar utilizando **admin** como login e também senha. Em seguida ver as métricas.

login -> admin
senha -> grupoes04