# spring-cloud-componets

一款基于 SpringCloud 组件构建的分布式服务架构（待完善），可以作学习之用

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

### springboot-admin

它是用于监控springboot应用程序的监控系统，应用程序通过Apring Boot Admin Client进行注册（通过HTTP的方式），
或者使用springcloud来发现（比如：eureka)，UI只是在Spring Boot Actuator端点上的一个AngularJs应用程序

