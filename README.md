# Conecta Cuatro

Conecta Cuatro es un juego de mesa clásico para dos jugadores en el que el objetivo es alinear cuatro fichas del mismo color en un tablero vertical. Este proyecto implementa el juego de Conecta Cuatro en Java, con diferentes modos de juego y una interfaz de consola interactiva.

## Modos de juego

El proyecto ofrece tres modos de juego:

1. **Jugador contra jugador (PvP):** En este modo, dos jugadores humanos pueden enfrentarse cara a cara. Cada jugador se turna para colocar una ficha en el tablero hasta que uno de ellos consigue alinear cuatro fichas del mismo color.

2. **Jugador contra máquina (PvM):** En este modo, un jugador humano se enfrenta a una máquina. El jugador humano coloca una ficha en el tablero, y luego la máquina realiza su movimiento. Ambos jugadores se turnan hasta que uno de ellos consigue ganar el juego.

3. **Máquina contra máquina (MvM):** En este modo, dos máquinas se enfrentan entre sí. Cada máquina realiza su movimiento de forma automática basándose en una estrategia de juego predefinida. El juego continúa hasta que una de las máquinas consigue ganar.

## Cómo jugar

1. Ejecuta la aplicación en tu entorno de desarrollo o terminal.

2. Selecciona el modo de juego deseado siguiendo las indicaciones que aparecerán en la consola.

3. Durante el juego, se te pedirá ingresar las columnas en las que deseas colocar tus fichas. Ingresa el número correspondiente a la columna y presiona Enter.

4. El juego mostrará el tablero después de cada movimiento y te informará si alguien ha ganado o si se ha producido un empate.

5. Sigue jugando hasta que haya un ganador o decidas salir del juego.

## Requisitos del proyecto

Para ejecutar este proyecto, necesitarás tener instalado lo siguiente:

- Java Development Kit (JDK) versión 8 o superior.
- Un entorno de desarrollo integrado (IDE) o una terminal para ejecutar los comandos.

## Estructura del proyecto

El proyecto está estructurado en las siguientes clases y archivos:

- `Board.java`: Clase que representa el tablero de juego y gestiona las fichas colocadas.
- `Color.java`: Enumeración que define los colores de las fichas (X, O, NULL).
- `GameInterface.java`: Interfaz que define los métodos para iniciar y jugar el juego.
- `GameMvM.java`: Clase que implementa el modo de juego Máquina contra máquina.
- `GamePvM.java`: Clase que implementa el modo de juego Jugador contra máquina.
- `GamePvp.java`: Clase que implementa el modo de juego Jugador contra jugador.
- `MachinePlayer.java`: Clase que representa a la máquina jugador y realiza movimientos automáticos.
- `PlayerInterface.java`: Interfaz que define el método para que los jugadores realicen sus movimientos.
- `Start.java`: Clase principal que permite iniciar y seleccionar el modo de juego.
- Otros archivos relacionados con la compilación y ejecución del proyecto.

## Autor

Este proyecto fue desarrollado por Manuel Neto Romero.
Linkdin https://www.linkedin.com/in/manuel-neto-romero-5780a4215/

¡Diviértete jugando al Conecta Cuatro!
