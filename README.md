# API Casa Inteligente

## Alunos
+ Amanda Paiola
+ Diego Costa
+ Felipe Silva Rocha
+ Jorge Luiz Reis Tavares
+ Luiz Henrique Pegoraro
+ Tiago Eduardo

## Como iniciar?
```sh
git clone git@github.com:ic-group3-engsoft2017/api-casa-inteligente.git

cd api-casa-inteligente

./mvnw clean install spring-boot:run
```
## Buildando em produção

### [Docker](https://www.docker.com)
```sh

*Gerando a imagem Docker

cd $APP_BASE_PATH/src/docker
 
docker build -t casa-inteligente:latest .

*Gerando o container a partir da imagem criada

cd $APP_BASE_PATH/src/docker

docker-compose up

```
### [Acessando]
```
http://localhost:8080/api

```
