Config Server(43.编写Config Server)
-------------------------------------------------
* 配置一个新的git仓库，里面存放一些配置文件
* 新建一个config-server项目，导入spring-cloud-config-server依赖
* 在启动类中添加@EnableConfigServer的注解
* application.yml中配置git的地址

##### 结论：可以用一下路径访问配置文件的内容
        /{application}/{profile}[/{label}]
        /{application}-{profile}.yml
        /{label}/{application}-{profile}.yml
        /{application}-{profile}.properties
        /{label}/{application}-{profile}.properties


