### Ferramentas para métricas

#### Sonar
A primeira coisa a se fazer é subir o container para rodar o sonar. Para isso, basta executar o docker-compose.yaml presente em
`/sonar`.
Após isso, para rodar a ferramenta de análise, utilize o comando: ```cd```, colocando o 
token do sonar armazenado em `gradle.properties`

Depois basta acessar `localhost:9000`, acessar utilizando **admin** como login e também senha. Em seguida ver as métricas.

login -> admin
senha -> grupoes04