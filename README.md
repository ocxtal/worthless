# worthless
to study tes coding and version control for 

###INSTALL
```bash
./sbt pack  
```

Newly generated 'target/pack' is installed package.  


###USAGE(example)
```bash
cd target/pack
bin/main 2 4 +
2,3,4,5
3,4,5,6
bin/main 2 4 x
1,2,3,4
2,4,6,8
```

###Others
[sbt](http://www.scala-sbt.org/) is a build tool for scala.  
Installing takes you very long time because of resolving dependency.  
These depended libraries are cached in your $HOME/.sbt or $HOME/.ivy2 and used next time.
