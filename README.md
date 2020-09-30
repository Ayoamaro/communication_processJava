# Actividad 1.3: Comunicación entre procesos en Java (1)

Escribe un clase Java que ejecute 2 comandos:  **ls  -la**  y  **tr 'd' 'D'**

Cada uno de estos comandos se ejecutará en un proceso hijo. Cada comando tendrá sus propios argumentos.

Se debe redireccionar la salida estándar del primer proceso a la entrada estándar del segundo. El resultado del comando debe ser el mismo que al ejecutar en la shell de Linux **ls -la | tr 'd' 'D'**

Para poder ejecutar estos comandos en Windows, instalaremos previamente la consola **Bash** de Ubuntu en Windows 10: https://protegermipc.net/2018/08/15/instalar-bash-en-windows-10/

Otra opción podría ser instalar la herramienta **Cygwin**: https://www.cygwin.com/

Para leer la salida de un proceso usamos: *ProcessBuilder*, *InputStream*, *InputStreamReader* y *BufferReader*. Para escribir en la entrada de un proceso usamos: *OutputStream*, *OutputStreamWriter* y *BufferedWriter*.
