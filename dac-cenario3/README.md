Com o terminal aberto no diretório do projeto, execute os comandos abaixo:

docker build -t cenario3/banco ./postgres

docker build -t cenario3/app .

docker run -p 5433:5432 -d --name dbcenario3 cenario3/banco

docker run --name cenario3App --link dbcenario3:bancohost cenario3/app

docker exec -it dbcenario3 psql -U postgres

\c dac-cenario3

\d


