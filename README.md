# HeapSort_con_Nodos
Tarea#2 del Curso de algoritmos y estructuraas de datos<br>
## Contenido
El proyecto presenta multiples Interfaces de ordanamiento y Estructuras de datos como listas enlazadas<br>
En ellas se encuentra el algoritmo de Heapsort implentado solamente usando "DNodos" (Nodos de listas doblemente enlazadas)<br>
Para ver el funcionamiento de este algoritmo solo basta de dirigirse al JMenu "Linked List", presionar "Heap Sort With Nodes"<br>
y ya habrás ingresado a la interfaz correspondiente<br>
![image](https://github.com/JaocHatter/HeapSort_con_Nodos/assets/112034917/3beaf5d8-cd45-4929-bba2-951a4c8c510c)

## Observaciones
El algoritmo posee una complejidad temporal muy parecida a la de Heapsort<br>
la diferencia se encuentra en la iteración final, en la cual se realizan busqueda de tiempo O(log(n))<br>
para poder encontrar un nodo sin hijos en la base , remplazarlas con el valor que guarda el nodo "top" <br>
y eliminar el nodo sin nodos hijos.<br>
Por lo cual esta característica es decisiva de su ligera ineficiencia<br>
frente al Heapsort original, el cual gracias al uso de indices nos proporciona operaciones O(1) es decir<br>
de tiempo constante<br>
## Detalles ante problemas de compilación
En caso tener problemas con "maven", ingrese a pom.xml<br>
Ahí podrá cambiar la version de java con la que trabaje  actualmente<br>
### Referencia:
En mi caso, uso la version 17, intente con la version 19.<br>

<maven.compiler.source>17</maven.compiler.source><br>
<maven.compiler.target>17</maven.compiler.target>
