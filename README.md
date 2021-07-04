# Wikipedia Service
<p> Libreria de Android que provee un servicio para la comunicacion con Wikipedia.
</p>

![alt text](img/WikipediaLogo.png)

## Pasos para instalar el servicio como submodulo

1. Crear una carpeta ("libs") en el proyecto
2. Agregar la libreria al proyecto
3. Modificar el archivo settings.gradle del proyecto. Dentro del gradle agregar la siguiente línea:
```kotlin
include ':WikipediaData'
project(':WikipediaData').projectDir = new File(rootDir, 'libs/WikipediaData/')
```
4. Debera de aparecer la opcion para sincronizar el gradle, sincronizarlo
5. Agregar la siguiente linea en el "build.gradle" del proyecto como una dependencia:
```kotlin
implementation project(":WikipediaData")
```
6. Para finalizar se tiene que sincronizar el gradle nuevamente

## Como usar el servicio

Ya dentro del proyecto a desarrollar:
1. Importar el submodulo dentro del proyeto
```kotlin
import .../wikipedia.WikipediaService
```
2. Crear una instancia del mismo
```kotlin
val wikipediaTrackService: WikipediaService
```
3. Ya puede acceder a los servicios del submodulo 

## Casos excepcionales

En caso de buscar una cancion y la cancion no existe, la aplicación informará que la canción no fue encontrada, con el mensaje "Song not found".

En caso de no tener internet, si se realiza una busqueda la aplicación informará que la canción no fue encontrada, tambien con el mensaje "Song not found".