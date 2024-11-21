
#? - Lectura y Escritura de información en archivos
'''
* Una de las funcionalidades que tiende a hacerse compleja en múltiples lenguajes de programación es la lectura y escritura de archivos de texto. Sin embargo, en Python
    es una tarea bastante sencilla (como es usual en Python), por medio de las funciones print() y write() para escribir en archivos y open() para leerlos.

* Vamos entonces a explorar las diferentes funcionalidades con su propósito particular.
'''

#? - Conceptos
'''
* Carpeta: Es un contenedor digital donde se pueden agrupar archivos y otras carpetas, llamadas a su vez subcarpetas.
    La denominación de carpeta o carpeta de archivos, comenzó a popularizarse a partir del lanzamiento del sistema operativo Windows 3.0 en el año 1990.

* Archivo: conjunto organizado de unidades de información (bits) almacenados en un dispositivo. Se les denomina de esa manera como metáfora a partir de los archivos
    tradicionales de oficina, escritos en papel, ya que vendrían a ser su equivalente digital.
'''

#? - Tipos de Archivos
'''
* Archivos de Adobe: PDF (.pdf), Illustrator (.ai, .eps), Photoshop (.psd)

* Imágenes: (.bmp, gif, .jpeg, .jpg, .png, .tif, .tiff, .svg)

* Archivos de Microsoft:
    - Documentos de Microsoft Word (.doc, .docx)
    - Presentaciones de Microsoft PowerPoint (.ppt, .pptx, .pptm, .pps, .ppsm, .ppsx)
    - Hojas de cálculo de Microsoft Excel (.xls, .xlsx)

* Archivos de texto: (.txt, .csv, .rtf, .odt, .md)

* Videos:(.3gp, .3gpp, .3gpp2, .asf, .avi, .dv, .m2t, .m4v, .mkv, .mov, .mp4, .mpeg, .mpg, .mts, .oggtheora, .ogv, .rm, .ts, .vob, .webm, .wmv, .flv)
'''

#? - Metodo open()
'''
* La función open() en Python, nos permite abrir un archivo existente. Sin embargo,si no existe lo creará inmediatamente. 
* Cabe resaltar, que al "abrir" un archivo, lo estamos preparando para su lectura, de modo que podremos acceder a su contenido
    (si lo tiene) e incluso, una vez abierto, podríamos escribir en él.

* Su uso es el siguiente:
'''

contenido = open("nombre-del-archivo.txt", "modo letra")
fichero = open('ejemplo.txt')

'''
* En el código anterior, la variable "contenido" tendrá todas las líneas que compongan al archivo y las podremos recorrer con un ciclo for.

* Por otro lado, open() recibe entonces el nombre del archivo como primer parámetro y el modo que se usará para abrir ese archivo.

* Existen varios modos para abrir los archivos, así que exploremos los más comunes:

    - r: Abre el archivo en modo de solo lectura. Es decir, no lo podremos modificar, solo obtener y usar sin contenido y sin realizar cambio alguno. 
        Si el archivo no existe, el programa fallará.
    - r+: Abre el archivo en modo lectura y escritura. Pudiendo así no solo obtener y usar su contenido, sino modificarlo si se desea.
    - w: Abre el archivo en solo modo escritura. Va a sustituir el archivo original si existe antes o crear uno nuevo si no existe. 
        Quiere decir entonces, que el contenido original que tenga ese archivo se perderá una vez escribas en él.
    - a: Abre el archivo para escritura, pero permitiendo agregar contenido al existente.
        Esto quiere decir que el contenido original se conserva y lo que escribas se agregará al final del archivo. Si el archivo no existe, se crea uno nuevo.
    - a+: Abre el archivo en modo de escritura para agregar contenido y lectura, permitiendo así agregar contenido al final y leerlo también.
'''

'''
#? Para añadir contenido a un fichero existente.
contenido = open("prueba1-aqui.txt", "a")
#? Agregarás contenido y lo podrás leer

contenido = open("prueba1-aqui.txt", "a+")
#? Por defecto, para leer el fichero.
contenido = open("prueba1-aqui.txt", "r")
#? Solo podrás leer el contenido
contenido = open("prueba1-aqui.txt", "r+")
#? Para escribir en el fichero.
contenido = open("prueba1-aqui.txt", "w")
#? Para la creación, fallando si ya existe.
contenido = open("prueba1-aqui.txt", "x")
#? Para abrir en modo binario.
contenido = open("prueba1-aqui.txt", "b")
'''

#? - Metodo read()
'''
* Con open() tendremos ya en fichero el contenido del documento listo para usar, y podemos imprimir su contenido con read()
'''

fichero = open('prueba1-aqui.txt')
print(fichero.read())

#? - Metodo readline()
'''
* Es posible también leer un número de líneas determinado y no todo el fichero de golpe. 
* Para ello hacemos uso de la función readline(). Cada vez que se llama a la función, se lee una línea.
'''

fichero = open('prueba1-aqui.txt')
print(fichero.readline())
print(fichero.readline())
print(fichero.readline())
print(fichero.readline())
fichero.close()

#? - Escribir en un archivo usando el metodo write()
'''
* La función write(), la podemos usar para escribir en un archivo ya abierto y nos recibe solo el texto (string) que vayamos a agregar. 
* Veamos cómo escribir una lista de nombre en un archivo:
'''
#?#? La lista de nombres a escribir
nombres = ["Juan", "Susana", "Andrea", "Melanie", "Andrés"]

#?#? Abrimos en modo escritura
archivo = open("nombres.txt", "w")

#?#? Recorremos la lista y agregamos cada nombre al archivo
for nombre in nombres:
    archivo.write(nombre + "\n")

#?#? Muy importante cerrar el archivo.
archivo.close()

#? Otro Ejemplo

file = open("escribir.txt", "w")
file.write("uno")
file.write("dos")
file.write("tres")
file.close()

'''
* En el código anterior, hay varias cosas por notar:

#! ¡Muy importante! Debes cerrar el archivo que estuviste escribiendo con close().
* Eso permitirá que el contenido sea finalmente escrito en el archivo (de lo contrario quedará vacío) y además que se pueda liberar el 
    archivo para ser usado luego (o incluso eliminado).
* La función write() no agrega saltos de línea, así que debemos ponerlos con "\n" para cada línea que deseamos escribir en el archivo.
* El archivo debe abrirse en alguno de los modos de escritura y primero debe abrirse con open(), antes de poder llamar a write y escribir en él.
'''

#? - Escribiendo en un archivo con usando print()

#? La misma lista de nombres a escribir
nombres = ["Juan", "Susana", "Andrea", "Melanie", "Andrés"]

#? Abrimos en modo escritura
archivo = open("nombres.txt", "w")

#? Recorremos la lista y agregamos cada nombre al archivo
for nombre in nombres:
    print(nombre, file=archivo)

#? NO olvides cerrar el archivo
archivo.close()

'''
* Si ejecutas el código anterior en Python, verás que el funcionamiento es el mismo. Sin embargo, al usar la función print() 
    nos evitamos poner el salto de línea "\n", pues print() lo hace automáticamente en cada llamado. Además, como vemos, lo único
    que hace falta para imprimir en el archivo, es usar el parámetro file, indicando el archivo que ya tenemos abierto para escritura.
'''