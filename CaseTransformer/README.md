## Dentro de los distintos formatos de nomenclatura de objetos, variables, propiedades y funciones tenemos camel, snake, pascal y kebab case, por ejemplo:

* Camel case: holaMundo
* Snake case: hola_mundo
* Pascal case: HolaMundo
* Kebab case: hola-mundo

Realiza una función que reciba dos parámetros:

* Un string conformado de una o más palabras separadas solo por espacio en blanco
* Una opción para transformar ese string en algún formato de los mencionados

Cumpliendo las siguientes condiciones:

* Si el string consta de una sola palabra, retornar la palabra (ojo con los casos camel y pascal).
* Puedes valerte de cualquier estructura de datos o transformaciones para las transformaciones.
* Ten cuidado con caracteres especiales en los strings.

Resultado esperado

* Si llamo a la función caseTransformer("hola mundo", "snake"), deberá retornar: hola_mundo
* Si llamo a la función caseTransformer("hola mundo", "kebab"), deberá retornar: hola-mundo
* Si llamo a la función caseTransformer("hola mundo", "pascal"), deberá retornar: HolaMundo
* Si llamo a la función caseTransformer("hola mundo", "camel"), deberá retornar: holaMundo