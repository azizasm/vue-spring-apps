
# Sample App - Cardio Challenge Mobile Apps using VueJS and Spring


Implementation  includes following features :

1. Responsive Design
1. Front end using VueJS and  Cordova
1. BackEnd using Spring Boot 
1. Easy deploy using dockers


###### Documentation
[Class  Diagram ](docs/README.md)



### Run in local environments 
```
$ git clone https://github.com/azizasm/vue-spring-apps.git
$ mvn clean package
$ java -jar target/vue-spring-apps-0.0.1-SNAPSHOT.jar
```

Open http://localhost:8088/ 



### Run as Dockers 

```
$ git clone https://github.com/azizasm/vue-spring-apps.git
$ cd vue-spring-apps

$ docker build  -t mobileApp .
$ docker run -it -p 8088:8088 mobileApp
```



### Build Logs

```
[INFO] ------------------------------------------------------------------------
[INFO] Building backend 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.2:prepare-agent (pre-unit-test) @ backend ---
[INFO] argLine set to -javaagent:C:\\Users\\shaha\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.2\\org.jacoco.agent-0.8.2-runtime.jar=destfile=C:\\temp\\IdeaProjects\\vue-spring-apps\\backend\\target\\jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:copy-resources (copy Vue.js frontend content) @ backend ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 22 resources
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ backend ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 86 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ backend ---
[INFO] Nothing to compile - all classes are up to date
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] vue-spring-apps .................................... SUCCESS [  0.432 s]
[INFO] frontend ........................................... SUCCESS [ 17.249 s]
[INFO] backend ............................................ SUCCESS [  0.489 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 18.565 s
[INFO] Finished at: 2019-02-08T22:24:16+08:00
[INFO] Final Memory: 29M/307M
[INFO] ------------------------------------------------------------------------


"C:\Program Files\Java\jdk1.8.0_191\bin\java.exe" -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=65228 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=localhost -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2018.3.3\lib\idea_rt.jar=65229:C:\Program Files\JetBrains\IntelliJ IDEA 2018.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;C:\temp\IdeaProjects\vue-spring-apps\backend\target\classes;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-actuator\2.1.2.RELEASE\spring-boot-starter-actuator-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter\2.1.2.RELEASE\spring-boot-starter-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.1.2.RELEASE\spring-boot-starter-logging-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\shaha\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\shaha\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.11.1\log4j-to-slf4j-2.11.1.jar;C:\Users\shaha\.m2\repository\org\apache\logging\log4j\log4j-api\2.11.1\log4j-api-2.11.1.jar;C:\Users\shaha\.m2\repository\org\slf4j\jul-to-slf4j\1.7.25\jul-to-slf4j-1.7.25.jar;C:\Users\shaha\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\shaha\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-actuator-autoconfigure\2.1.2.RELEASE\spring-boot-actuator-autoconfigure-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-actuator\2.1.2.RELEASE\spring-boot-actuator-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.9.8\jackson-databind-2.9.8.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.9.0\jackson-annotations-2.9.0.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.9.8\jackson-core-2.9.8.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-context\5.1.4.RELEASE\spring-context-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.9.8\jackson-datatype-jsr310-2.9.8.jar;C:\Users\shaha\.m2\repository\io\micrometer\micrometer-core\1.1.2\micrometer-core-1.1.2.jar;C:\Users\shaha\.m2\repository\org\hdrhistogram\HdrHistogram\2.1.9\HdrHistogram-2.1.9.jar;C:\Users\shaha\.m2\repository\org\latencyutils\LatencyUtils\2.0.3\LatencyUtils-2.0.3.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.1.2.RELEASE\spring-boot-starter-web-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.1.2.RELEASE\spring-boot-starter-json-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.9.8\jackson-datatype-jdk8-2.9.8.jar;C:\Users\shaha\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.9.8\jackson-module-parameter-names-2.9.8.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.1.2.RELEASE\spring-boot-starter-tomcat-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.14\tomcat-embed-core-9.0.14.jar;C:\Users\shaha\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.14\tomcat-embed-el-9.0.14.jar;C:\Users\shaha\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.14\tomcat-embed-websocket-9.0.14.jar;C:\Users\shaha\.m2\repository\org\hibernate\validator\hibernate-validator\6.0.14.Final\hibernate-validator-6.0.14.Final.jar;C:\Users\shaha\.m2\repository\javax\validation\validation-api\2.0.1.Final\validation-api-2.0.1.Final.jar;C:\Users\shaha\.m2\repository\org\jboss\logging\jboss-logging\3.3.2.Final\jboss-logging-3.3.2.Final.jar;C:\Users\shaha\.m2\repository\com\fasterxml\classmate\1.4.0\classmate-1.4.0.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-web\5.1.4.RELEASE\spring-web-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-beans\5.1.4.RELEASE\spring-beans-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-webmvc\5.1.4.RELEASE\spring-webmvc-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-aop\5.1.4.RELEASE\spring-aop-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-expression\5.1.4.RELEASE\spring-expression-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-devtools\2.1.2.RELEASE\spring-boot-devtools-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot\2.1.2.RELEASE\spring-boot-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.1.2.RELEASE\spring-boot-autoconfigure-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\2.1.2.RELEASE\spring-boot-starter-data-jpa-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-aop\2.1.2.RELEASE\spring-boot-starter-aop-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\org\aspectj\aspectjweaver\1.9.2\aspectjweaver-1.9.2.jar;C:\Users\shaha\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.1.2.RELEASE\spring-boot-starter-jdbc-2.1.2.RELEASE.jar;C:\Users\shaha\.m2\repository\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-jdbc\5.1.4.RELEASE\spring-jdbc-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\javax\transaction\javax.transaction-api\1.3\javax.transaction-api-1.3.jar;C:\Users\shaha\.m2\repository\javax\xml\bind\jaxb-api\2.3.1\jaxb-api-2.3.1.jar;C:\Users\shaha\.m2\repository\javax\activation\javax.activation-api\1.2.0\javax.activation-api-1.2.0.jar;C:\Users\shaha\.m2\repository\org\hibernate\hibernate-core\5.3.7.Final\hibernate-core-5.3.7.Final.jar;C:\Users\shaha\.m2\repository\javax\persistence\javax.persistence-api\2.2\javax.persistence-api-2.2.jar;C:\Users\shaha\.m2\repository\org\javassist\javassist\3.23.1-GA\javassist-3.23.1-GA.jar;C:\Users\shaha\.m2\repository\net\bytebuddy\byte-buddy\1.9.7\byte-buddy-1.9.7.jar;C:\Users\shaha\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\shaha\.m2\repository\org\jboss\jandex\2.0.5.Final\jandex-2.0.5.Final.jar;C:\Users\shaha\.m2\repository\org\dom4j\dom4j\2.1.1\dom4j-2.1.1.jar;C:\Users\shaha\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.0.4.Final\hibernate-commons-annotations-5.0.4.Final.jar;C:\Users\shaha\.m2\repository\org\springframework\data\spring-data-jpa\2.1.4.RELEASE\spring-data-jpa-2.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\data\spring-data-commons\2.1.4.RELEASE\spring-data-commons-2.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-orm\5.1.4.RELEASE\spring-orm-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-tx\5.1.4.RELEASE\spring-tx-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-aspects\5.1.4.RELEASE\spring-aspects-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\com\h2database\h2\1.4.197\h2-1.4.197.jar;C:\Users\shaha\.m2\repository\org\apache\tomcat\tomcat-jdbc\9.0.14\tomcat-jdbc-9.0.14.jar;C:\Users\shaha\.m2\repository\org\apache\tomcat\tomcat-juli\9.0.14\tomcat-juli-9.0.14.jar;C:\Users\shaha\.m2\repository\org\postgresql\postgresql\42.2.5\postgresql-42.2.5.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-core\5.1.4.RELEASE\spring-core-5.1.4.RELEASE.jar;C:\Users\shaha\.m2\repository\org\springframework\spring-jcl\5.1.4.RELEASE\spring-jcl-5.1.4.RELEASE.jar" com.hokenso.vuespringapps.VuejsApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.2.RELEASE)

2019-02-08 22:24:55.950  INFO 26824 --- [  restartedMain] c.h.vuespringapps.VuejsApplication       : Starting VuejsApplication on alienwareok with PID 26824 (C:\temp\IdeaProjects\vue-spring-apps\backend\target\classes started by shaha26 in C:\temp\IdeaProjects\vue-spring-apps)
2019-02-08 22:24:55.953  INFO 26824 --- [  restartedMain] c.h.vuespringapps.VuejsApplication       : No active profile set, falling back to default profiles: default
2019-02-08 22:24:55.992  INFO 26824 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2019-02-08 22:24:55.992  INFO 26824 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2019-02-08 22:24:56.954  INFO 26824 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-02-08 22:24:57.011  INFO 26824 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 51ms. Found 1 repository interfaces.
2019-02-08 22:24:57.338  INFO 26824 --- [  restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$eebb12b4] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-02-08 22:24:57.629  INFO 26824 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8088 (http)
2019-02-08 22:24:57.644  INFO 26824 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-02-08 22:24:57.644  INFO 26824 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.14]
2019-02-08 22:24:57.648  INFO 26824 --- [  restartedMain] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_191\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\Razer Chroma SDK\bin;C:\Program Files\Razer Chroma SDK\bin;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\iCLS\;C:\Program Files\Intel\Intel(R) Management Engine Components\iCLS\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Windows\system32\config\systemprofile\AppData\Local\Microsoft\WindowsApps;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\NVIDIA Corporation\NVIDIA NvDLISR;C:\Program Files\Git\cmd;C:\Users\shaha\AppData\Local\Microsoft\WindowsApps;;.]
2019-02-08 22:24:57.720  INFO 26824 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-02-08 22:24:57.720  INFO 26824 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1728 ms
2019-02-08 22:24:58.054  INFO 26824 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-02-08 22:24:58.111  INFO 26824 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-02-08 22:24:58.146  INFO 26824 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2019-02-08 22:24:58.189  INFO 26824 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.7.Final}
2019-02-08 22:24:58.190  INFO 26824 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-02-08 22:24:58.280  INFO 26824 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-02-08 22:24:58.382  INFO 26824 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2019-02-08 22:24:58.785  INFO 26824 --- [  restartedMain] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@2c8d1dc6'
2019-02-08 22:24:58.788  INFO 26824 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-02-08 22:24:58.815  INFO 26824 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2019-02-08 22:24:59.162  INFO 26824 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-02-08 22:24:59.187  WARN 26824 --- [  restartedMain] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-02-08 22:24:59.231  INFO 26824 --- [  restartedMain] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [public/index.html]
2019-02-08 22:24:59.390  INFO 26824 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2019-02-08 22:24:59.437  INFO 26824 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8088 (http) with context path ''
2019-02-08 22:24:59.439  INFO 26824 --- [  restartedMain] c.h.vuespringapps.VuejsApplication       : Started VuejsApplication in 3.788 seconds (JVM running for 4.557)
2019-02-08 22:24:59.579  INFO 26824 --- [on(5)-127.0.0.1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-02-08 22:24:59.579  INFO 26824 --- [on(5)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-02-08 22:24:59.585  INFO 26824 --- [on(5)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 6 ms


```