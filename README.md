# qatar2022
CRUD jugadores QATAR 2022

# tecnologias usadas
- H2 database
- Java 11
- Gradle 6.8
- Spring Data
- Spring Boot


# postman services
obtener jugadores(GET)
http://localhost:8080/qatar/apiv1/jugadores

obtener jugador por id(GET)
http://localhost:8080/qatar/apiv1/jugadores/3

guardar jugador(POST)
http://localhost:8080/qatar/apiv1/jugadores

json body
{
"jugadorId": 2,
"nombre": "Pablo V",
"equipo": "Real Madrid",
"nacionalidad": "Mexico",
"estatura": 1.89
}

eliminar jugador por id(DELETE)
http://localhost:8080/qatar/apiv1/jugadores/1

actualizar jugador(PUT)
http://localhost:8080/qatar/apiv1/jugadores/3



