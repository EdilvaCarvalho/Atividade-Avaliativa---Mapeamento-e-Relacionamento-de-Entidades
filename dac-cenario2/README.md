Com o terminal aberto no diretório do projeto, execute os comandos abaixo:

docker build -t cenario2/banco ./postgres

docker build -t cenario2/app .

docker run -p 5433:5432 -d --name dbcenario2 cenario2/banco

docker run --name cenario2App --link dbcenario2:bancohost cenario2/app

docker exec -it dbcenario2 psql -U postgres

\c dac-cenario2

\d

SELECT * FROM filme;

SELECT * FROM ator;

SELECT * FROM evento;
