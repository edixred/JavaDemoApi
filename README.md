# Índice de contenidos
* [Configuración SonarLint](#item1)
* [Configuración SonarQube](./confSonar.md)
* [Configuracion Reportes Sonarqube](#item3)

_______________________________________________
_______________________________________________

<a name="item1"></a>

# Configuración SonarLint

 ![alt text](/imgs/images.png)


1 - Dirigirse a Ayuda > marketplace -> buscar sonarLint en Eclipse

2 - una vez instalado reinicio del IDE

3 - Se ingresa al menu en la opcion window > show View > others 
  
  ![alt text](/imgs/Selection_148.png)
  
4 - en la ventana emergente se busca sonarLint y se habilitan los las siguientes ventanas
	* SonarLint On-The-Fly
	* SonarLint Report
	* SonarLint Rule Description
	Se visualiza el siguiente resultado al activar las pestañas indicadas

![imagen analisis](/imgs/sonarLint3.png)

5 - Activar Análisis: para realizar analisis al código se procede a realizar click derecho sobre el proyecto > SonarLint > Analizar

6 - Revission de resultados: los resultados se pueden visualizar en la ventana ventanas correspondientes 
  
  * SonarLint Report: errores identificados en las clases
  
  * SonarLint Rule Description: Descripción de la regla y ejemplo de solución 
  
 ![imagen analisis](/imgs/Selection_150.png)
 
 _______________________________________________

 
<a name="item3"></a>

 # Configuracion Reportes Sonarqube

Para obtener un reporte en pdf de un análisis en SonarQube es necesario que ya se haya realizado el msmo análisis.

Una vez el análisis ya esté listo como se observa en la siguiente figura.

Se descarga el archivo sonar-cnes-report.jar que se encuentra en el reposiorio y se ejecuta el siguente comando:
```
 	java -jar sonar-cnes-report.jar -t eaa48820d1b9c21bd24446ff76a63fd55c75a970 -s https://172.168.10.26:9100 -p alpopular -r ./ReporteAlPopular.docx
 ```

 Donde:
 * **-jar**: Es el nombre del archivo 
 * **-t:** Es el token del proyecto
 * **-s:** Es el servidor 
 * **-p:** Es el nombre del proyecto analizado 
 * **-r:** Es el nombre y tipo de documento del reporte que se va a generar 

 Una vez ejecutado este comando con sus respectivas configuraciones se obtiene el reporte en pdf de análisis de codigo en PDF.