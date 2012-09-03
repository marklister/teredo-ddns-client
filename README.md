##FreeDns client

This client is a JVM (scala) client that sniffs your teredo address and pushes it to freedns.afraid.org

##Why?

Where I live routable ip4 addresses are few and far between.  And there's no IPv6 infrastructure either...

freedns.afraid.org will sniff your address if you curl or wget them _but they don't have an ip6 address!_ 

I couldn't get inadyn-mt to compile properly. Then I started looking through inadyn-mt's source -- big and complicated... 

The source code for this client is about 10 lines.  Less than the readme.

##How to build

Run `sbt compile assembly` from the root of the directory.  This will package the scala library and the ddns client into FreeDns-assembly-1.0.jar.  If you don't want to build you can just copy the jar file.

The project includes paulp/optional as source crudely hacked to compile with sbt 0.12 and scala 2.9.2.  the compile/assembly task will compile this project too.

##Binary

If you don't want to build you can download the FreeDns-assembly-1.0.jar from the target directory.

##How to run

run `java -jar FreeDns-assembly-1.0.jar --hashCode {your freeddns hashcode}`  Scala is not required to run this client -- only to build it.

Optional arguments:

--url the url you want to 'hit' with `%1$s` substituting for the hashcode and `%2$s` substituting for the ip address.

--address: the ipaddress you want to send to freedns (defaults to your teredo address).

If that appears to work for you then put the command into your /etc/cron.hourly directory or into your crontab (or set it up as a job to run when the teredo interface appears) 

Note:  I'm using optional to parse the arguments.  Optional is out of date for current versions of scala and incorrectly reports the syntax as `FreeDns <hashCode>` when in fact it only accepts `FreeDns --hashCode hashcode`

##Licence

The Apache Licence 2.0.  Or if that's not permissive enough for you ask for it to be released under another licence.
