# Práctica de Git

**Alumno 1**: Mauro Clavo Conesa

**Alumno 2**: Federico López Pérez

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
### Alumno 2
- Creación de la rama con el comando `git branch ramaAlno2`
- Cambio a la rama creada con el comando `git checkout ramaAlno2`
- Cambio al nombre de la rama con el comando `git branch -m "ramaAlumno2"`

## Ejercicio 8
### Alumno 2
- Listamos las ramas con `git branch` y se nos muestran 2 ramas, la rama "main" y la rama "ramaAlumno2" que son las 2 ramas locales. En este caso el asterisco se encuentra en la rama "ramaAlumno2" lo cual implica que actualmente nos encontramos en esa rama

## Ejercicio 9
### Alumno 2
- Creamos el fichero manualmente y copiamos el contenido
- Luego subimos los cambios localmente con `git add .` y `git commit -m "Añadiendo fichero cliente.java"`

## Ejercicio 10
## Alumno 2
- Para esto tenemos que realizar el comando `git diff main` para ver las diferencias de nuestra rama con la rama principal. He tardado 30 segundos así que me he librado de la bronca.

## Ejercicio 11
## Alumno 2
- Para realizar este ejercicio, hemos utilizado el comando `git checkout main` para movernos a la rama principal, `git pull` para asegurarnos de que estamos en la última versión y finalmente `git merge ramaAlumno2` para realizar la fusión.