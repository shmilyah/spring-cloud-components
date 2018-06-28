# spring-cloud-components

一款基于 SpringCloud 组件构建的分布式服务架构（持续更新），可以作学习之用

v1.0 tag 版本是没有使用配置中心

相关文章解读参考：https://blog.csdn.net/hubo_88

SpringCloud 版本 Finchley.RC1

SpringBoot 版本 2.0.1.RELEASE

## 系统module

### eureka-service

SpringCloud 的服务注册中心

### spring-demo-service

一个服务实例demo

### spring-demo-service-ribbon

基于 rest + ribbon 实现的拥有负载均衡的服务消费者

### spring-demo-service-feign

基于 Feign 实现的服务消费者， Feign 是基于 ribbon 实现的， 已实现负载均衡

### spring-cloud-hystrix-dashboard

作为断路器状态的一个组件，提供了数据监控和友好的图形化界面

### spring-cloud-hystrix-dashboard-turbine

把多个hystrix.stream的内容聚合为一个数据源供Dashboard展示

### spring-boot-admin

它是用于监控 Spring Boot 应用程序的监控系统，应用程序通过 Spring Boot Admin Client 进行注册（通过 HTTP 的方式），
或者使用 Spring Cloud 来发现（比如：Eureka)，UI 只是在 Spring Boot Actuator 端点上的一个 AngularJs 应用程序

### spring-cloud-gateway

使用 Spring Cloud Zuul 组件实现的服务网关

