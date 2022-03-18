# Índice de contenidos
* [Configuración SonarLint](../README.md)
* [Configuración SonarQube](./confSonar.md)
* [Configuracion Reportes Sonarqube](#item1)

_______________________________________________
_______________________________________________

<a name="item1"></a>

 # Configuracion Reportes Sonarqube

Para obtener un reporte en pdf de un análisis en SonarQube es necesario que ya se haya realizado el msmo análisis.

Una vez el análisis ya esté listo como se observa en la siguiente figura.

![imagen analisis](/imgs/proyectAnalis.JPG)

Se descarga el archivo [sonar-cnes-report.jar](https://github.com/edixred/JavaDemoApi/raw/main/sonar-cnes-report-4.1.0.jar) que se encuentra en el reposiorio y se ejecuta cnesreport, esta documentacion está basada en [**Sonar CNES Report**](https://github.com/cnescatlab/sonar-cnes-report) donde tambien se encuentra la documentacion para crear el archivo en caso de no ser compatible con la version de Sonarqube utilizada:
* En modo complemento, copiar el archivo jar en `/opt/sonarqube/extensions/plugins`, se debe tener en cuenta que la direcccion cambia de acuerdo al nombre del proyecto como se muestra en la siguiente imagen.

![imagen analisis](/imgs/copysonar.JPG)

* Una vez copiado se debe reiniciar sonarqube y se habilitará una opcion "Más" en sonarqube. Posteriormente se debe seleccionar "Informe CNES"

![imagen analisis](/imgs/mas.JPG)

Al seleccionar "Informe CNES" se muestra una serie de opciones a configurar para generar el reporte en formato comprimido.

![imagen analisis](/imgs/informe.JPG)

Si se selecciona la opcion de generar de descarga automaticamente el reporte.
