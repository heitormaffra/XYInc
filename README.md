# Descrição

Repositório com um app RESTful, utilizando como base o mySQL como banco de dados para cálculo de distância de POI (Points of Interests).
Dada uma localização (x,y) é feito o cálculo da distância, mostrando como resultados relevantes locais com menos de 10m de distância.


Execução
--------

Para executar o projeto, basta executar o comando do maven:

    mvn spring-boot:run

Cadastrando um novo POI
-----------------------

Para o cadastro de um novo POI, em seu client HTTP, colocar o seguinte caminho:

    POST: http://localhost:8080/pois

Segue abaixo um exemplo de JSON do modelo do POI:

    {
	    "nomeDoPoi" : "Churrascaria",
	    "coordenadaX" : "28",
	    "coordenadaY" : "2"
    }

Listando todos os POI's
-----------------------

Para listas todos os POI's uma requisição GET deverá ser feita, conforme descrito abaixo:

    GET: http://localhost:8080/pois
    
Descobrindo os POI's próximos
-----------------------------

Para descobrir quais são os POI's próximos da localização, uma requisição GET deverá ser montada, conforme descrito abaixo

    GET: http://localhost:8080/proximidade?x=20&y=10


Criação do banco
----------------

O arquivo application.properties irá fazer a configuração do banco de dados. Caso seja necessário adicionar as tabelas ao banco na 
primeira execução, adicionar a linha a seguir no arquivo:
    
    spring.jpa.hibernate.ddl-auto=create
    
Lembrando que para o MySQL, banco utilizado no app, é necessário ter o banco de dados criado
