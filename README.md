# pivotal_spring

# AOP Module :
    AOP = programming pradigme to handle cross cutting concern (logging/ securing/ transaction / monitoring...)
          in a great fashion where there is no code duplication + mixture of businees and infra code

## Weaving : applying the aspect in the joint point

Type of weaving <br> 
    * Compile time weaving : the byte code is changed at compile time.<br>
    * Load time weaving : the byte code is changed when the class loader is laoding a class.<br>
    * Runtime weaving : at runtime , byte code not changed

<br>
Spring uses runtime weaving , to intercept call it uses : <br>
 * JDK proxy : for class that implement interfaces<br>
 * CGLIB proxy : for classes that does not implement any interfaces

to force spring to use CGLIB proxy use : @EnableAspectJAutoProxy(proxyTargetClass =true)