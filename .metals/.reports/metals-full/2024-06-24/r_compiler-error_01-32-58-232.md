file:///C:/Users/Acer/Desktop/SLS02/3.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  C:/Users/Acer/Desktop/SLS02/1.scala
and also in
  C:/Users/Acer/Desktop/SLS02/3.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 266
uri: file:///C:/Users/Acer/Desktop/SLS02/3.scala
text:
```scala
object demo{

    def Salary(normalhour:Int,OThour:Int)={
    var normalhourSalary=normalhour*250
    var OThourSalary=OThour*85
    var totalSalary=normalhourSalary+OThourSalary
    totalSalary
    }

    def tax(totalSalary:Double)={
        val taxRate=@@0.12
   
        val tax=totalSalary*taxRate

    }


    def main(args:Array[String]):Unit={
        val normalhour=40
        val OThour=30
        val salary=Salary(normalhour:Int,OThour:Int)
        val tax=Tax()
        println(salary())

    }
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  C:/Users/Acer/Desktop/SLS02/1.scala
and also in
  C:/Users/Acer/Desktop/SLS02/3.scala
One of these files should be removed from the classpath.