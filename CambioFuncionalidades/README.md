## Dentro de los distintos formatos de nomenclatura de objetos, variables, propiedades y funciones tenemos camel, snake, pascal y kebab case, por ejemplo:

* Camel case: holaMundo
* Snake case: hola_mundo
* Pascal case: HolaMundo
* Kebab case: hola-mundo

Crea un nuevo proyecto partiendo del reto #3 y cambia la funcionalidad para que se reciba:

* Un string conformado de una palabra o frase en cualquiera de los Cases mencionados (Pascal, Camel, Kebab y Snake)
* Una opción para transformar ese string en algún formato de los mencionados

Cumpliendo las siguientes condiciones:

Si se pide el mismo formato que ya tiene, no aplicar transformaciones y retornar el valor ingresado
Puedes valerte de cualquier estructura de datos o transformaciones para las transformaciones
Ten cuidado con caracteres especiales en los strings
En la respuesta de la función debe indicarse el case original del texto transformado
Indicar también el caso en que el texto no tuviese un formato conocido (ninguno de los 4 cases)

Resultado esperado:
Si llamo a la función caseTransformer("holaMundo", "snake"), deberá retornar:
El texto recibido se ha transformado de Camel Case a Snake Case hola_mundo

Si llamo a la función caseTransformer("hola mundo", "kebab"), deberá retornar:
El texto recibido no tiene formato Case conocido, se ha transformado a Kebab case: hola-mundo