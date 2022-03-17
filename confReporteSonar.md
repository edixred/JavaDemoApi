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

![imagen analisis](/imgs/proyectAnalis.JPG)

Se descarga el archivo sonar-cnes-report.jar que se encuentra en el reposiorio y se ejecuta cnesreport:
* En modo complemento, copiar el archivo jar en `/opt/sonarqube/extensions/plugins`, una vez copiado se debe reiniciar sonarqube y se habilitará una opcion "Más" en sonarqube. Posteriormente se debe seleccionar "Informe CNES"

![imagen analisis](/imgs/copysonar.JPG)

* Una vez copiado se debe reiniciar sonarqube y se habilitará una opcion "Más" en sonarqube. Posteriormente se debe seleccionar "Informe CNES"

![imagen analisis](/imgs/mas.JPG)

Al seleccionar "Informe CNES" se muestra una serie de opciones a configurar para generar el reporte en formato comprimido.

![imagen analisis](/imgs/informe.JPG)

Si se selecciona la opcion de generar de descarga automaticamente el reporte.
