//package org.http4s.blaze.channel
//
//import org.scalatest.{Matchers, WordSpec}
//
//import java.net.InetSocketAddress
//import org.http4s.blaze.examples.EchoServer
//
//
///**
// * @author Bryce Anderson
// *         Created on 1/5/14
// */
//class ChannelSpec extends WordSpec with Matchers {
//
//
//  "Channels" should {
//
//    "Bind the port and then be closed" in {
//      val server = new EchoServer().prepare(new InetSocketAddress(8086))
//      server.close()
//    }
//  }
//
//}
