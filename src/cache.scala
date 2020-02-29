package njumips
package core

import chisel3._
import chisel3.util._
import njumips.consts._
import njumips.configs._
import njumips.utils._

class ICache extends Module {
  val io = IO(new Bundle {
    val in = Flipped(new MemIO)
    val out = new AXI4IO(4, conf.xprlen)
    val flush = Input(Bool())
  })

  io.in <> DontCare
  io.out <> DontCare
}

class DCache extends Module {
  val io = IO(new Bundle {
    val in = Flipped(new MemIO)
    val out = new AXI4IO(4, conf.xprlen)
    val flush = Input(Bool())
  })

  io.in <> DontCare
  io.out <> DontCare
}
