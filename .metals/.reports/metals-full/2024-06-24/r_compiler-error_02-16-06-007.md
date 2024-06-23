file:///C:/Users/Acer/Desktop/SLS02/Main.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 172
uri: file:///C:/Users/Acer/Desktop/SLS02/Main.java
text:
```scala
public class Main {
     public static void main(String[] args) {
    int a=2,b=3,c=4,d=5;
    float  k=4.3f;
    float g=0.0f;

    def main(args:Array[String]):Unit@@={
        b--;
        println(b*a+c*d)
        d=d-1
       
        println(a)
         a=a+1

        println(-2*(g-k)+c)

        println(c)
        c=c+1

        c=c+1
        println(c*a)
        a=a+1

    }
}
}
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:380)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator