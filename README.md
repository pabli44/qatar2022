# qatar2022
CRUD jugadores QATAR 2022

# tecnologias usadas
- H2 database
- Java 11
- Gradle 6.8
- Spring Data
- Spring Boot


# como funciona
- gradle clean
- gradle build
- gradle bootRun
- el proyecto corre el el puerto 8080


# postman services
obtener jugadores(GET)<br/>
http://localhost:8080/qatar/apiv1/jugadores

obtener jugador por id(GET)<br/>
http://localhost:8080/qatar/apiv1/jugadores/3

guardar jugador(POST)<br/>
http://localhost:8080/qatar/apiv1/jugadores

json body <br/>
{ <br/>
"jugadorId": 2,<br/>
"nombre": "Pablo V",<br/>
"equipo": "Real Madrid",<br/>
"nacionalidad": "Mexico",<br/>
"estatura": 1.89<br/>
}

eliminar jugador por id(DELETE)<br/>
http://localhost:8080/qatar/apiv1/jugadores/1

actualizar jugador(PUT)<br/>
http://localhost:8080/qatar/apiv1/jugadores/3

json body <br/>
{ <br/>
"nombre": "Alicia Eugenia",<br/>
"equipo": "River Plate",<br/>
"nacionalidad": "Nicaragua",<br/>
"estatura": 1.58<br/>
}



