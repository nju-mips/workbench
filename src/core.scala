package njumips
package core

import chisel3._
import chisel3.util._
import njumips.configs._
import njumips.consts._
import njumips.utils._

class Core extends Module {
  val io = IO(new Bundle {
    val imem = new MemIO
    val dmem = new MemIO
    val commit = new CommitIO
    val flush = Output(Bool())
  })

  io.imem.req.valid := N
  io.imem.req.bits := 0.U.asTypeOf(io.imem.req.bits)
  io.imem.resp.ready := N

  io.dmem.req.valid := N
  io.dmem.req.bits := 0.U.asTypeOf(io.dmem.req.bits)
  io.dmem.resp.ready := N

  io.commit := 0.U.asTypeOf(io.commit)
  io.flush := N
}
