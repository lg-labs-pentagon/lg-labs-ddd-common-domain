# 🦾 Common to domain layers

<img src="https://pbs.twimg.com/profile_images/1410772782238081029/VO3SPTNV_400x400.jpg" align="left" width="172px" height="172px"/>
<img align="left" width="0" height="172px" hspace="10"/>

> 👋  Welcome From **lg-labs**! Get the basic common domain.

[![License](https://img.shields.io/github/license/lg-labs-pentagon/lg-labs-dotfiles?style=flat-square)](LICENSE)

With the utility **lg-labs-pentagon** has created this project, to help community.

For more information, check this pages 

https://lufgarciaqu.medium.com

## 🚀 Maven Install

Install 1/2: Add this to pom.xml:
```xml
<dependency>
  <groupId>com.labs.lg.pentagon</groupId>
  <artifactId>ddd-common-domain</artifactId>
  <version>1.0.0-alpha</version>
</dependency>
```

Install 2/2: Run via command line
```bash
mvn install
```


## 📚Contents
```
./
├── DomainConstants
├── entity/
│  ├── AggregateRoot
│  └── BaseEntity
├── event/
│  ├── DomainEvent
│  └── publisher/
├── exception/
│  └── DomainException
└── valueobject/
    ├── BaseId
    └── Money
```


## ⚖️ License

The MIT License (MIT). Please see [License](LICENSE) for more information.
