# spring-cloud-components

一款基于 SpringCloud 组件构建的分布式服务架构（持续更新），可以作学习之用

v1.0 tag 版本是没有使用配置中心

相关文章解读参考：https://blog.csdn.net/hubo_88

SpringCloud 版本 Finchley.RC1

SpringBoot 版本 2.0.1.RELEASE

## 系统module

### eureka-service

SpringCloud 的服务注册中心，相关文章：
https://blog.csdn.net/hubo_88/article/details/80520850
https://blog.csdn.net/hubo_88/article/details/80633113

### spring-demo-service

一个服务实例demo

### spring-demo-service-ribbon

基于 rest + ribbon 实现的拥有负载均衡的服务消费者，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80560592  
https://blog.csdn.net/hubo_88/article/details/80578457  

### spring-demo-service-feign

基于 Feign 实现的服务消费者， Feign 是基于 ribbon 实现的， 已实现负载均衡，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80567960  
https://blog.csdn.net/hubo_88/article/details/80578457  

### spring-cloud-hystrix-dashboard

作为断路器状态的一个组件，提供了数据监控和友好的图形化界面，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80598374  

### spring-cloud-hystrix-dashboard-turbine

把多个hystrix.stream的内容聚合为一个数据源供Dashboard展示，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80623032  

### spring-boot-admin

它是用于监控 Spring Boot 应用程序的监控系统，应用程序通过 Spring Boot Admin Client 进行注册（通过 HTTP 的方式），  
或者使用 Spring Cloud 来发现（比如：Eureka)，UI 只是在 Spring Boot Actuator 端点上的一个 AngularJs 应用程序  
相关文章：  
https://blog.csdn.net/hubo_88/article/details/80671192  
https://blog.csdn.net/hubo_88/article/details/80684339  

### spring-cloud-config、spring-cloud-config-client

spring-cloud-config：配置中心，spring-cloud-config-client：配置中心的测试服务，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80692156  
https://blog.csdn.net/hubo_88/article/details/80726901  
https://blog.csdn.net/hubo_88/article/details/80784730  
 
### spring-cloud-gateway

使用 Spring Cloud Zuul 组件实现的服务网关，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80849276  
https://blog.csdn.net/hubo_88/article/details/80862397  

### spring-cloud-stream

Spring Cloud Stream 消息驱动，相关文章：  
https://blog.csdn.net/hubo_88/article/details/80904165


### spring-cloud-service1、spring-cloud-service2

测试 Spring Cloud Sleuth + Zipkin 实现的链路监控  
由于 Spring Boot 2.0 之后，官方不建议自定义实现 Zipkin Server，而是直接提供了编译好的 jar 包  
具体情况可以参考相关文章：  
https://blog.csdn.net/hubo_88/article/details/80878632  
https://blog.csdn.net/hubo_88/article/details/80889973  
https://blog.csdn.net/hubo_88/article/details/80890461  

