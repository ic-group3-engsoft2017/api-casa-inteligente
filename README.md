# API Casa Inteligente

## Alunos
+ Amanda
+ Jorge Luis Tavares Reis
+ Luiz Henrique Pegoraro
+ Felipe
+ Tiago

## Como iniciar?
```sh
git clone git@github.com:ic-group3-engsoft2017/api-casa-inteligente.git

cd api-casa-inteligente

./mvnw clean install spring-boot:run
```
## Buildando em produção

### [Docker](https://www.docker.com)
```sh
./mvnw clean install

cd src/docker

docker-compose build

```
### [Kubernetes](https://kubernetes.io/)
TBD

### Legacy
```sh
./mvnw clean install

java -jar target/api-casa-inteligente-$VERSION.jar
```
### [Acessando]
```
http://localhost:8080/api

```
