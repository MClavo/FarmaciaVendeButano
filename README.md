# Práctica de Git

**Alumno 1**: Mauro Clavo Conesa

**Alumno 2**: Federico López Pérez

**Alumno 3**: Alejandro Cabo Vázquez

**Alumno 4**: Zuleima Muñoz Jiménez

**repositorio**: https://github.com/MClavo/FarmaciaVendeButano

# Comandos Ejercicios
## Ejercicio 4
Para resolver el ejercicio 4, hemos decidido usar la extensión de VSCode para evitarnos tener que generar los tokens.

Posterioremente estos cambios se han añadido al repositorio local con `git add` y `git commit` y luego al repositorio remoto con `git push`.

## Ejercicio 5
- La clonación la he hecho desde vscode, para tener que evitar generar tokens de autenticación dado que al tener las cuentas enlazadas se realiza de forma automática.
- `git add .` para añadir los archivos al área de staging
- `git commit -m "Inicialización del repositorio con archivos Farmacia"` para hacer el commit
- `git push` para subir los cambios
- `git pull`para traer los cambios
- `git add .` para añadir los cambios
- `git commit -m` "Actualizado el Readme con el ejercicio 5"
- `git push` para subir los cambios

## Ejercicio 7
### Alumno 1
- `git checkout -b ramaAlumno1` Creo mi rama
### Alumno 2
- Creación de la rama con el comando `git branch ramaAlno2`
- Cambio a la rama creada con el comando `git checkout ramaAlno2`
- Cambio al nombre de la rama con el comando `git branch -m "ramaAlumno2"`

## Ejercicio 8
### Alumno 1
- `git branch` Listo las ramas y solo aparece la mia local y main dado que ninguno de los dos hemos subido los cambios. El asterisco indica la rama en la que estamos actualmente.
### Alumno 2
- Listamos las ramas con `git branch` y se nos muestran 2 ramas, la rama "main" y la rama "ramaAlumno2" que son las 2 ramas locales. En este caso el asterisco se encuentra en la rama "ramaAlumno2" lo cual implica que actualmente nos encontramos en esa rama


## Ejercicio 9
### Alumno 1
- `git add .` añado los cambios
- `git commit -m "Añadiendo fichero almacen_cli.java"` Hago el commit
### Alumno 2
- Creamos el fichero manualmente y copiamos el contenido
- Luego subimos los cambios localmente con `git add .` y `git commit -m "Añadiendo fichero cliente.java"`


# Ejercicio 10 
## Alumno 1
- `git diff main` miramos las diferencias con la rama main, porque al no estar subidos los cambios al repositorio remoto es imposible mirar las diferencias con el otro compañero. 
Lo único que podemos comprobar es la diferencia entre nuestra rama local y el main. Tarde 10 segundos.
## Alumno 2
- Para esto tenemos que realizar el comando `git diff main` para ver las diferencias de nuestra rama con la rama principal. He tardado 30 segundos así que me he librado de la bronca.


# Ejercicio 11
## Alumno 1
- `git checkout main` vamos a la rama principal
- `git pull` traemos los cambios si existen
- `git merge ramaAlumno1` Hacemos un merge y traemos los cambios de ramaAlumno1 a main.
## Alumno 2
- Para realizar este ejercicio, hemos utilizado el comando `git checkout main` para movernos a la rama principal, `git pull` para asegurarnos de que estamos en la última versión y finalmente `git merge ramaAlumno2` para realizar la fusión.

Para realizar los dos push, primero hay que resolver los problemas de conflicto del Readme.
Hemos juntado los dos cambios realizados por los dos alumnos y ya

# Ejercicio 12
En nuestro caso no es necesario ya que estamos utilziando una herramienta que gestiona las cuentas de usuario de github y los tokens automáticamente.
La herramienta que estamos utilizado es VSCode, y no hemos tenido ningún problema.
**Para los logs hemos utilizado:**  `git log --graph --stat  --decorate --all > LogAlumnoX.txt`

# Ejercicio 15
## Alumno 1
- `git checkout -b exerimentación` creamos la rama de experimentación
- `git push origin experimentación` subimos la rama de experimentación
## Alumno 2
- `git push origin ramaAlumno2` subir la rama al repositorio remoto
- `git branch ramaInvestigacion` crear la rama de investigación
- `git push origin ramaInvestigacion` submir la rama al repositorio remoto 
## Alumno 3
- `git branch ramaAlumno3` creamos la rama de alumno 3.
- `git push origin ramaAlumno3` subimos la rama al repositorio remoto.
##  Alumno 4
- `git branch ramaAlumno4` creamos la rama de alumno 4.
- `git push origin ramaAlumno4` subimos la rama al repositorio remoto.

# Ejercicio 16
## Alumno 2
- `git add .` Para añadir los cambios
- `git commit -m 'Cambios en Pantalla.java'` Para subir los cambios

# Ejercicio 17
- `git whatchanged --pretty=format:"commit %H%nAuthor: %an%nCommitter: %cn%nMessage: %s%n"` Es el comando utilizado.

# Ejercicio 18
## Alumno 3
- `git checkout main` Vamos a la rama main
- `git merge ramaAlumno 3` Unimos los cambios de la rama
- `git push` Subimos los cambios
## Alumno 2
- `git checkout main` Vamos a la rama main
- `git pull` Traemos los cambios
- `git merge ramaAlumno 2` Unimos los cambios de la rama
- `git push` Subimos los cambios
## Alumno 4
- `git checkout main` Vamos a la rama main
- `git pull` Traemos los cambios
- `git merge ramaAlumno 4` Unimos los cambios de la rama
- `git push` Subimos los cambios
## Alumno 1
- `git checkout main` Vamos a la rama main
- `git pull` Traemos los cambios
- `git merge ramaAlumno 1` Unimos los cambios de la rama
- `git push` Subimos los cambios

# Ejercicio 20
El problema es que el primer alumno que realiza el commit (Mauro) no tiene ningún problema ya que simplemente está añadiendo cambios a un fichero. El resto de alumnos, añaden los cambios depués de los de Mauro, lo que provoca que se generen conflictos al estar cambiando líneas de código que ya fueron cambiadas por Mauro.

La solución sería resolver los conflictos del Merge si fuese necesario, pero en nuestro caso bastaba con simplemente quedarse con 1 de los cambios ya que los 4 códigos eran prácticamente idénticos.

# Ejercicio 21
Comando utilizado: `git shortlog -s -n --all`
- 16  FedeLo
- 14  MClavo
- 6  AlexCaboVaz
- 6  Mauro
- 5  ZuleimaMunozJimenez

El comando `git cherry` sirve para mostrar la diferencia entre el número de commits de 2 ramas.

# Ejercicio 22
El comando utilizado para resolver este ejercicio es `git push origin --delete "ramaInvestigacion"`