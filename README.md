# SelAca
Aplicando conocimientos del Curso

#Summary
Por lo general, esta informacion se encuentra alojada en un excel y cada vez que es necesario realizar un nuevo caso, hay que volver a definir el tipo y el nombre del campo nuevamente en un nuevo excel o sheet. A lo largo del tiempo, la mantencion se volverá tediosa.

La idea de esta nueva solucion, es que, desde el excel solo traigamos el dato que se necesita.
Para ello, lo primero que se hace es, validar si existe el campo en la clase, de ser TRUE nos devuelve el TIPO y el nombre REAL del campo, para luego operar con el en la aplicacion.

# SalesforceRepository class
En esta clase, es donde estan TODOS los campos de la aplicacion que concidere almacenar. Para ello uso un switch para determinar si el mismo está contemplado o no en nuestra lista. Si existe se procede con todo lo demas.

"En el caso que quiera agregar, modificar o quitar algun campo, el unico mantenimiento seria solo sobre esta clase"..

