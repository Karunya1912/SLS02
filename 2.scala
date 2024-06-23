object demo{
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=0.0f

    def main(args:Array[String]):Unit={
        b=b-1
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