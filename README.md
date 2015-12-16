# worthless
[![Build Status](https://travis-ci.org/yuto-izzii/worthless.svg?branch=master)](https://travis-ci.org/yuto-izzii/worthless)

to study test-driven development and version control

###INSTALL

-> target/pack  
```bash
./sbt pack  
```
Newly generated 'target/pack' is installed package.  


-> $HOME/local 
```bash
./sbt packInstall 
```

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

###LICENSE

Under the MIT License, see [LICENSE.txt](https://yuto-izzii/worthless/LICENSE.txt).

###Others
[sbt](http://www.scala-sbt.org/) is a build tool for scala.  
Installing takes you very long time because of resolving dependency.  
These depended libraries are cached in your $HOME/.sbt or $HOME/.ivy2 and used next time.  
'pack' and 'packInstall' are sbt-plugin developed in https://github.com/xerial/sbt-pack

###Developer's Information & Contact
Yuto Ichikawa  
ichikaway{at}cb.k.u-tokyo.ac.jp