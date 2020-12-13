# SpringRedis
Projeto para estudar a utilização no redis em aplicações Spring com o banco de dados H2.


# Requisitos

Para rodar a imagem com o Redis é necessário ter instalado em seu computador o Docker pelo link:  https://www.docker.com/

ATENÇÃO: Alguns problemas na instalação do Docker, podem necessitar a configuração da Maquina para virtualização e Ativação do Hyper-V

# Criando container
docker pull redis
docker run --name redis -p 6379:6379 -i -t -d redis

Para verificarmos se o contâiner realmente foi criado, basta rodar o comando:   docker ps -a

Assim que o comando for executado você poderá encontrar todos os contâiners existentes em seu sistema operaciona
l e entre eles deve ter o Redis como mostrado na imagem abaixo:

 


# Requisições para efetuar testes
curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1010", "name": "Company 1"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1020", "name": "Company 2"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1030", "name": "Company 3"}'

curl -s http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1040", "name": "Company 4"}'
curl -s http://localhost:8080/company/
curl -s -X PUT http://localhost:8080/company \
 -H "Content-Type: application/json" \
 -d '{"identifier": "1010", "name": "Company 1010"}'
curl -s http://localhost:8080/company/1010
curl -s -X DELETE http://localhost:8080/company/1040 
