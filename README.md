# HeapSort_con_Nodos
Tarea#2 del Curso de algoritmos y estructuraas de datos<br>
## Contenido
El proyecto presenta multiples Interfaces de ordanamiento y Estructuras de datos como listas enlazadas<br>
En ellas se encuentra el algoritmo de Heapsort implentado solamente usando "DNodos" (Nodos de listas doblemente enlazadas)<br>
## Observaciones
El algoritmo posee una complejidad temporal muy parecida a la de Heapsort<br>
la diferencia se encuentra en la iteración final, en la cual se realizan busqueda de tiempo O(log(n))<br>
para poder encontrar un nodo sin hijos en la base , remplazarlas con el valor que guarda el nodo "top" <br>
y eliminar el nodo sin nodos hijos.<br>
Por lo cual esta característica es decisiva de su ligera ineficiencia<br>
frente al Heapsort original, el cual gracias al uso de indices nos proporciona operaciones O(1) es decir<br>
de tiempo constante<br>

