Com o terminal aberto no diretório do projeto, execute os comandos abaixo:

docker build -t cenario1/banco ./postgres

docker build -t cenario1/app .

docker run -p 5433:5432 -d --name dbcenario1 cenario1/banco

docker run --name cenario1App --link dbcenario1:bancohost cenario1/app

docker exec -it dbcenario1 psql -U postgres

\c dac-cenario1

\d

SELECT * FROM cliente;

SELECT * FROM conta;