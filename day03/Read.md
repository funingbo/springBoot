#1、使用信息：springBoot mybatis mysql
#2、使用spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver 时，
#spring.datasource.url链接需要添加 serverTimezone=UTC
#3、mybatis.mapper-locations=classpath:mapper/*Mapper.xml匹配目录mapper一级目录下所有以Mapper.xml结尾的文件
#   特别注意所有dao对应Mapper文件为dao文件名+Mapper.xml后缀 示例【UserDao对应UserDaoMapper.xml】


# Getting Started
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)