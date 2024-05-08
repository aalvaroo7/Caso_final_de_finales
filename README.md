https://github.com/aalvaroo7/Caso_final_de_finales.git

# Preguntas tipo test

## 1) b)
Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, solo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

## 2) b) Falso.
Los métodos de una clase pueden devolver objetos. En efecto, los métodos pueden devolver cualquier tipo de valor, incluyendo objetos. Esto se logra utilizando la palabra clave return seguida del objeto que se desea devolver. Por ejemplo, en Java, un método puede devolver un objeto utilizando el siguiente formato:

## 3)  b) Herencia.
La herencia es una característica fundamental de la programación orientada a objetos que permite la reutilización del código. Al heredar atributos y comportamientos de una clase superior o superclase, las clases secundarias pueden aprovechar el trabajo ya realizado en la superclase, reduciendo la necesidad de escribir código nuevo y aumentando la eficiencia en el desarrollo de software. Esto facilita la reutilización del código, ya que las clases secundarias pueden construirse sobre la base de la superclase, lo que ahorra tiempo y esfuerzo en el desarrollo.

## 4) a) O(n).
El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de O(n), ya que para acceder a un elemento en la lista, se debe seguir los enlaces en la lista, lo que puede ser un proceso que requiere tiempo proporcional al tamaño de la lista.

## 5) b) Falso.
El algoritmo de ordenación por inserción no se basa en la idea de seleccionar el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada. En su lugar, el algoritmo de ordenación por inserción se basa en la idea de ir insertando un elemento de la lista ó un arreglo en la parte ordenada de la misma, asumiendo que el primer elemento es la parte ordenada, y comparando el elemento con los elementos de la parte ordenada, insertando el elemento en la posición correcta dentro de la parte ordenada.

# Preguntas a desarrollar

## 1)

## 2) Diferencias entre una Tabla Hash y un Árbol
Las principales diferencias entre una Tabla Hash y un Árbol son:
Tabla Hash:
Estructura de datos que asocia claves únicas con valores.
Acceso a los elementos en tiempo constante O(1) en el mejor caso, gracias a la función de dispersión.
Estructura de datos no ordenada, por lo que no es eficiente para operaciones que requieren orden, como recorrer todos los elementos.
Manejo de colisiones (cuando dos claves se mapean al mismo índice) mediante técnicas como encadenamiento o direccionamiento abierto.
Tamaño fijo, que debe ajustarse a medida que aumenta el número de elementos para mantener un buen rendimiento.
Árbol (Binario de Búsqueda):
Estructura de datos ordenada, donde cada nodo tiene a lo más dos hijos.
Acceso a los elementos en tiempo logarítmico O(log n) en el mejor caso, gracias a la propiedad de ordenación.
Permite recorrer los elementos de forma ordenada (in-order, pre-order, post-order).
Estructura dinámica que se ajusta automáticamente a medida que se agregan o eliminan elementos.
Más eficiente que las Tablas Hash para operaciones que requieren orden, como encontrar el mínimo, máximo, sucesor o predecesor de un elemento.
Cuándo conviene utilizar cada estructura
Tabla Hash:
Cuando se requiere un acceso rápido a los elementos, sin importar el orden.
Cuando se necesita almacenar y recuperar grandes volúmenes de datos de forma eficiente.
Cuando no se requieren operaciones que impliquen recorrer todos los elementos de forma ordenada.
Árbol Binario de Búsqueda:
Cuando se necesita mantener los elementos ordenados y realizar operaciones que requieren orden, como encontrar el mínimo, máximo, sucesor o predecesor.
Cuando se requiere recorrer los elementos de forma ordenada (in-order, pre-order, post-order).
Cuando el tamaño de la estructura puede variar dinámicamente sin afectar significativamente el rendimiento.
En resumen, las Tablas Hash son más eficientes para acceso rápido a elementos sin importar el orden, mientras que los Árboles Binarios de Búsqueda son más adecuados cuando se requiere mantener los elementos ordenados y realizar operaciones que dependen del orden.

## 3) Las diferencias entre una pila y una cola son fundamentales en el ámbito de las estructuras de datos:
Pila:
Principio de acceso: LIFO (Last In, First Out). El último elemento en entrar es el primero en salir.
Operaciones: Se añaden y eliminan elementos del mismo extremo, conocido como "tope".
Uso común: Se utiliza en situaciones donde se necesita un seguimiento de operaciones en orden inverso, como en la gestión de llamadas a funciones en la memoria de un programa.
Cola:
Principio de acceso: FIFO (First In, First Out). El primer elemento en entrar es el primero en salir.
Operaciones: Los elementos se añaden al final de la cola y se eliminan del frente.
Uso común: Ideal para situaciones donde se necesita procesar elementos en el orden en que llegaron, como en la gestión de tareas en un sistema de impresión.
Cuándo utilizar cada estructura:
Pila: Se utiliza cuando se requiere un seguimiento de operaciones en orden inverso, como en la gestión de llamadas a funciones o en la reversión de texto.
Cola: Se prefiere cuando se necesita procesar elementos en el orden en que llegaron, como en la gestión de tareas en un sistema de impresión o en la atención de solicitudes.
Orden de complejidad computacional:
Tanto para pilas como para colas, las operaciones básicas como inserción (enqueue en colas, push en pilas) y eliminación (dequeue en colas, pop en pilas) tienen una complejidad de tiempo constante O(1) en el mejor de los casos, ya que se realizan en un extremo de la estructura.
Sin embargo, es importante considerar que la complejidad puede variar dependiendo de la implementación específica de cada estructura y las operaciones realizadas.
En resumen, las pilas y colas son estructuras de datos esenciales con principios de acceso distintos que se utilizan en diferentes contextos según las necesidades de procesamiento de datos. Mientras que las pilas son útiles para seguimientos en orden inverso, las colas son ideales para procesar elementos en el orden en que llegaron.

## 4) El método de ordenación por inserción (Insertion Sort) se basa en la idea de ir construyendo una lista ordenada a partir de una lista desordenada. El algoritmo funciona de la siguiente manera:
Se comienza con el primer elemento de la lista como la parte ordenada.
Se toma el siguiente elemento de la lista desordenada y se inserta en la posición correcta dentro de la parte ordenada.
Se repite el paso 2 hasta que todos los elementos de la lista desordenada hayan sido insertados en la parte ordenada.
Veamos cómo se aplicaría este método de ordenación al conjunto de datos:
Datos iniciales: 50 20 84 13 22 16 89 85

Iteración 1:
La parte ordenada inicial es: 50
Se toma el siguiente elemento de la lista desordenada: 20
Se inserta 20 en la posición correcta dentro de la parte ordenada: 20 50

Iteración 2:
La parte ordenada es: 20 50
Se toma el siguiente elemento de la lista desordenada: 84
Se inserta 84 en la posición correcta dentro de la parte ordenada: 20 50 84

Iteración 3:
La parte ordenada es: 20 50 84
Se toma el siguiente elemento de la lista desordenada: 13
Se inserta 13 en la posición correcta dentro de la parte ordenada: 13 20 50 84

Iteración 4:
La parte ordenada es: 13 20 50 84
Se toma el siguiente elemento de la lista desordenada: 22
Se inserta 22 en la posición correcta dentro de la parte ordenada: 13 20 22 50 84

Iteración 5:
La parte ordenada es: 13 20 22 50 84
Se toma el siguiente elemento de la lista desordenada: 16
Se inserta 16 en la posición correcta dentro de la parte ordenada: 13 16 20 22 50 84

Iteración 6:
La parte ordenada es: 13 16 20 22 50 84
Se toma el siguiente elemento de la lista desordenada: 89
Se inserta 89 en la posición correcta dentro de la parte ordenada: 13 16 20 22 50 84 89

Iteración 7:
La parte ordenada es: 13 16 20 22 50 84 89
Se toma el siguiente elemento de la lista desordenada: 85
Se inserta 85 en la posición correcta dentro de la parte ordenada: 13 16 20 22 50 84 85 89
Después de estas iteraciones, la lista queda ordenada: 13 16 20 22 50 84 85 89.

## 5) Para determinar a partir de qué tamaño de entrada
𝑛
n la función
𝐴
=
1024
𝑛
A=1024n es más eficiente que la función
𝐵
=
16
𝑛
3
B=16n
3
, debemos comparar el crecimiento de ambas funciones en función de
𝑛
n.
Para encontrar el punto de inflexión donde
𝐴
A es más eficiente que
𝐵
B, igualamos las dos funciones y resolvemos para
𝑛
n:
1024
𝑛
=
16
𝑛
3
1024n=16n
3

Dividimos ambos lados por
𝑛
n (asumiendo
𝑛
≠
0
n

=0):
1024
=
16
𝑛
2
1024=16n
2

Dividimos por 16:
64
=
𝑛
2
64=n
2

Tomamos la raíz cuadrada de ambos lados:
𝑛
=
64
n=
64
​

𝑛 =8
n=8
Por lo tanto, a partir de un tamaño de entrada de
𝑛 = 8
n=8, la función
𝐴
=
1024
𝑛
A=1024n será más eficiente que la función
𝐵
=
16
𝑛
3
B=16n
3
. Para valores de
𝑛
n mayores a 8, la función
𝐴
A requerirá menos operaciones que la función
𝐵
B para el mismo tamaño de entrada.

pero a pesar de esto la funcion B tiene mayores resultados en funcion de n que la funcion A al ser 16n elevado al cubo

## Ejercicio 3)(codigo que itera varias veces una variable) 
a) Para corregir el código y realizar la operación de potenciación correctamente, donde 'a' es la base y 'b' es el exponente, debes cambiar la base de la recursión. En lugar de multiplicar 'a' por la llamada recursiva, debes multiplicar el resultado de la llamada recursiva por sí misma.

b) El cálculo que está haciendo es una potenciación, donde ‘a’ es la base y ‘b’ es el exponente. Sin embargo, dado que la base es 1, el resultado siempre será 1, independientemente del valor del exponente.

## Ejercicio 4) 

El tipo de recursividad que se está empleando es la recursividad lineal. En este tipo de recursividad, una función se llama a sí misma una vez en su cuerpo.  En cuanto a la complejidad computacional, el algoritmo tiene una complejidad de tiempo de O(d), donde d es el número de dígitos en el número. Esto se debe a que la función se llama a sí misma una vez por cada dígito en el número.

en cuanto a la ejecucion del progama, este es posible ejecutarlo en el propio Suma_de_dos_digitos_recursiva.java y no seria necesario recurrir a ella en el main correspoondiente del proyecto :)

## Ejercicio 5)
Parte 2 respuesta a la cuestion planteada en el apartado d)

• No es necesario modificar los atributos timeline y tweets de la clase UserAccount para que contengan elementos de la clase hija Retweet. Esto se debe a que Retweet es una subclase de Tweet, por lo que un Retweet es un Tweet. En Java, una lista de una superclase puede contener objetos de cualquier subclase. Por lo tanto, una List<Tweet> puede contener objetos Tweet y cualquier objeto de una clase que extienda Tweet, como Retweet.

• No es necesario modificar el método tweet(Tweet tweet1) de la clase UserAccount para que pueda enviar también objetos de tipo Retweet. Al igual que con los atributos timeline y tweets, esto se debe a que Retweet es una subclase de Tweet. En Java, un método que acepta un parámetro de una superclase puede recibir un objeto de cualquier subclase. Por lo tanto, un método que acepta un Tweet puede recibir un Retweet. Sin embargo, si necesitas realizar operaciones específicas de Retweet dentro del método tweet(), entonces tendrías que verificar el tipo del objeto y hacer un casting apropiado.

## Explicacion del desarrollo del codigo para la aplicacion Twitter(ahora X) y sus distintos modulos asi como metodos:

Este proyecto de Java consta de varias clases que simulan una versión simplificada de una red social como Twitter. Aquí está una descripción de cada clase y su propósito:  

UserAccount.java: 
Esta clase representa una cuenta de usuario en la red social. Cada cuenta de usuario tiene un alias, un email, una lista de seguidores, una lista de usuarios a los que sigue, una lista de tweets que ha publicado y una línea de tiempo de tweets.  

Tweet.java: 
Esta clase representa un tweet en la red social. Cada tweet tiene una fecha y hora, un mensaje y un remitente.  

DirectMessage.java:
Esta clase hereda de Tweet y representa un mensaje directo en la red social. Un mensaje directo es un tipo especial de tweet que tiene un destinatario.  

Retweet.java: E
sta clase también hereda de Tweet y representa un retweet en la red social. Un retweet es un tipo especial de tweet que tiene un tweet original que está siendo retuiteado.  

Email.java: 
Esta clase representa un correo electrónico. Se utiliza para almacenar la dirección de correo electrónico de una cuenta de usuario.  

Utils.java: 
Esta clase contiene métodos de utilidad que se utilizan en todo el proyecto. Por ejemplo, tiene métodos para leer una cadena o un entero de la entrada estándar, y métodos para validar un alias o un correo electrónico.  

Main.java:
Esta es la clase principal del proyecto. Contiene el método main(), que es el punto de entrada del programa. Esta clase maneja la interacción con el usuario, como cargar usuarios de un archivo, permitir al usuario cargar un usuario en memoria, publicar un tweet, y ordenar los usuarios por correo electrónico.  

El código proporcionado en Main.java implementa un menú de opciones que permite al usuario cargar un usuario en memoria, publicar un tweet y ordenar los usuarios por correo electrónico. También implementa una búsqueda secuencial con centinela para buscar un usuario en la lista de usuarios.

