# Proyecto1

Segunda actividad del **proyecto intermodular**: un programa en Java con menú de consola que gestiona datos personales, un saldo y calcula la nómina mensual de un trabajador. Une dos asignaturas: **Entornos de Desarrollo** y **Programación**.

## Qué hace el programa

Al arrancar enseña un menú principal con cuatro opciones:

| Opción | Qué hace |
|---|---|
| Introducir datos | Submenú para meter nombre, apellidos, NIF, móvil, email y cuenta bancaria. Cada dato se valida y, si el formato es incorrecto, se vuelve a pedir hasta que esté bien. No hace falta rellenarlos todos y se puede volver al menú principal. |
| Mostrar datos | Enseña los datos que ya se han introducido. |
| Gestión del saldo | Consultar, ingresar o extraer saldo. |
| Cálculo de la nómina | Calcula el sueldo del mes según los productos vendidos. |

## Cómo se calcula la nómina

1. Se pueden vender productos de **100 €, 300 € y 500 €** a lo largo del mes.
2. Por cada producto vendido el trabajador se lleva una **comisión del 10 %** de su valor.
3. Al total se le descuenta un **14 % de impuestos**.
4. En **junio y diciembre** se suma una **paga extra de 700 €**.

Ejemplo: con 2 productos de 100 €, 1 de 300 € y 1 de 500 € (1.000 € en ventas) la comisión es 100 €, los impuestos 14 € y la nómina neta 86 € (sin contar la paga extra).

## Fases del proyecto

Planificación hecha con el tablero de GitHub Projects (vista Roadmap).

| Fase | Fechas | Estado |
|---|---|---|
| 1. Análisis (entender el problema) | 4–5 nov | Hecho |
| 2. Diseño (prototipo de la GUI con WindowBuilder) | 6 nov | Hecho |
| 3. Codificación (Java) | 7–9 nov | En curso |
| 4. Pruebas (casos correctos y erróneos) | 10 nov | Pendiente |
| 5. Mantenimiento (nueva funcionalidad) | 11 nov | Pendiente |

Las fechas se irán ajustando si cambian las previsiones, y al final se compara el Gantt inicial con el final.

## Cómo ejecutarlo

Necesitas tener instalado el JDK de Java. Compila el fichero `.java` con `javac` y ejecútalo con `java` desde la terminal. Si lo abres en un IDE como Eclipse, basta con ejecutar la clase principal.

## Entregable

Un PDF con el Gantt inicial y final, el código del `.java`, las pruebas (capturas de ejecuciones correctas y erróneas, con la causa y la solución de cada error) y los cambios propuestos en mantenimiento.

## Ideas para mejorar

La fase de mantenimiento servirá para proponer funcionalidad nueva y ver cómo afecta a cada etapa del proyecto.
