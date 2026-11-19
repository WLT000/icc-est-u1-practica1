C1: Código ascendente.  Comparable y ordenamiento natural.

![alt text](assets/1.png)

C2: Nombre ascendente; código ascendente.  Comparator con lambda de dos parámetros.

![alt text](assets/2.png)

C3: Nota ascendente, sin desempate.   comparingDouble y referencia a método.

![alt text](assets/3.png)

C4: Nota descendente; nombre ascendente.  reversed y thenComparing.

![alt text](assets/4.png)

C5: Edad ascendente; nombre descendente.  comparingInt y sentido independiente para el criterio secundario.

![alt text](assets/5.png)

C6: Carrera ascendente; nota descendente; nombre ascendente; código ascendente.  Composición de cuatro criterios.

![alt text](assets/6.png)

C7: Nota ajustada descendente; nombre ascendente; código ascendente.  Lambda que calcule Math.min(10.0, nota + 0.5) para estudiantes de Computacion y conserve la nota de las demás carreras.

![alt text](assets/7.png)