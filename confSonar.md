# Índice de contenidos
* [Configuración SonarLint](./README.md)
* [Configuración SonarQube](#item1)
* [Configuracion Reportes Sonarqube](./confReporteSonar.md)

_______________________________________________
_______________________________________________

<a name="item1"></a>

 # Configuración SonarQube
 
 ![alt text](/imgs/sonar1.png)

Para enviar el análisis a SonarQube se requiere habilitar la conexión mediante el pluging de sonarLint;
se procede a realizar click derecho sobre el proyecto > SonarLint > SonarQube o SonarCLoud obteniendo la siguiente interfáz

![alt text](/imgs/sonar2.png)

Posteriormente se procede a fijar la url del servidor de sonar

![alt text](/imgs/sonar3.png)

Luego se fija el token con el cual se va relacionar el proyecto

![alt text](/imgs/sonar4.png)

El token generado debe corresponder al proyecto creado en sonarqube para que pueda realizar el análisis desde el IDE

![alt text](/imgs/sonar5.png)

Se fija un nombre a la conexión

![alt text](/imgs/sonar6.png)

Se verifica que la configuración se haya realizado de forma correcta

![alt text](/imgs/sonar7.png)

Se puede configurar adicionalmente el sonarqube en el **pom.xml** del proyecto para que pueda realizar el análisis en 
la construcción del artefacto, tambien se verifica en pestaña de **SonarLint Binfdings** la conexión configurada en los pasos anteriores

```
<dependency>
	<groupId>org.sonarsource.scanner.maven</groupId>
	<artifactId>sonar-maven-plugin</artifactId>
	<version>3.2</version>
</dependency>
```

![alt text](/imgs/sonar10.png)
 
Otra configuración adicional que se debe agregar en **pom.xml** el  para realizar el análisis en la construcción del artefacto es adicionar las líneas 

```
	<profiles>
		<profile>
			<id>sonar</id>
				<activation>
					<activeByDefault>true</activeByDefault>
				</activation>
				<properties>
					<sonar.host.url>
					http://ip172-18-0-86-c8hdq2dmrepg00crar50-9100.direct.labs.play-with-docker.com
					</sonar.host.url>
			</properties>
		</profile>
	</profiles>
 ```
 
 ![alt text](/imgs/sonar11.png)
 
 Y finalmente se realiza el análisis con el comando 
 
 ```
 	mvn clean install sonar:sonar
 ```
 obteniendo el resultado del análisis requerido
 
 ![alt text](/imgs/sonar12.png)