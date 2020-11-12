
# 代码生成器

​		基于内部规则的代码生成器，可支持MySQL，Oracle，PostgreSQL，SQLServer，可生成权限相关sql语句

## 1、修改数据库配置

```
# application.yml 修改数据库连接配置
```

## 2、修改项目路径

文件generator.properties

- 修改 package 路径名 如：com.example
- 修改 author 如 LaiZhiShen
- 修改 模块命名，如 asset

如需修改字段映射类型，只修改本文件字段对应即可

## 3、启动

正常SpringBoot启动，端口8082，直接访问即可
