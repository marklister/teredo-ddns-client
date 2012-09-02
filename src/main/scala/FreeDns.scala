/**
 * (c) 2012 Mark Lister
 * 
 * This software is licenced under the Apache Licence 2.0
 * 
 * Quick and dirty FreeDns.afraid.org client -- written because inadyn-mt wasted several hours of my life
 * This aims to support ip6 / teredo / miredo
 */
package org.catch22.freedns

import java.net.NetworkInterface
import java.net.URL
import java.lang.IllegalArgumentException
import scala.io.Source
import scala.collection.JavaConversions._

object FreeDns {

  def main(args: Array[String]): Unit = {
    if (args.length<1) {
      println("Usage: FreeDns hashcode"); 
      throw new IllegalArgumentException("No freedns.afraid.org hashcode supplied")
    }
    val ipv6Addr= NetworkInterface.getNetworkInterfaces.filter(_.getName.startsWith("teredo"))
                  .flatMap(_.getInterfaceAddresses).map(_.getAddress)
                  .filter(_.toString.startsWith("/2001")).mkString.drop(1).dropRight(2)
                  
    val u= new URL("http://freedns.afraid.org/dynamic/update.php?"+args(0)+"&address="+ipv6Addr)              
    val con=u.openConnection
    con.connect
    val result = Source.fromInputStream(con.getInputStream).getLines.mkString
    println(result)
  }
}