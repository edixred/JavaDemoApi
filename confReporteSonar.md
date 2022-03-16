# Índice de contenidos
* [Configuración SonarLint](./README.md)
* [Configuración SonarQube](./confSonar.md)
* [Configuracion Reportes Sonarqube](#item1)

_______________________________________________
_______________________________________________

<a name="item1"></a>

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