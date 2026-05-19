# Concesionaria con Builder + Director

Este proyecto resuelve el ejercicio de la concesionaria usando el patrón **Builder** respetando la estructura del diagrama:

- `Producto` → `Auto`
- `Builder` → `BuilderAuto`
- `BuilderConcretoA` → `AutoBuilderConcreto`
- `Director` → `Concesionaria`

## Idea principal

La clase `Concesionaria` tiene un atributo:

```java
private BuilderAuto builder;
```

Y usa ese builder para construir autos mediante recetas:

```java
construirAutoBasico(...)
construirAutoCompleto(...)
```

Después, una vez construido el auto, lo agrega a su lista con:

```java
agregarAuto(auto)
```

## ¿La Concesionaria puede ser el Director?

Sí, en este ejercicio se tomó esa decisión para que la estructura sea más simple y para respetar el diagrama dado.

De todos modos, en un sistema más grande sería mejor separar responsabilidades:

- `DirectorDeAutos`: se encarga de construir autos usando un builder.
- `Concesionaria`: se encarga de guardar autos y validar reglas de la lista, como que no se repita la patente.

## Cómo ejecutarlo

Desde IntelliJ:

1. Abrir la carpeta del proyecto.
2. Esperar que IntelliJ detecte Maven.
3. Ejecutar `Main.java`.

Desde consola:

```bash
mvn clean compile exec:java
```
