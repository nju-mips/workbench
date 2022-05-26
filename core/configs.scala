package njumips
package configs

import chisel3._

object conf {
  val xprlen = 32
  val addr_width = 32
  val data_width = 32
  val xprbyte = xprlen / 8
  val start_addr = "hbfc00000".U
  val axi_data_width = 32
  val axi_id_width = 3
  val memio_cycles = 2
  val INSTR_ID_SZ = 6
  val mul_stages = 7
  val div_stages = 45
  val random_delay = false

  val TLB_BITS = 5
  val TLBSZ = (1 << TLB_BITS)
  val PABITS = 32

  val nICacheSets = 256
  val nICacheWaysPerSet = 4
  val nICacheWordsPerWay = 16
  val nDCacheSets = 256
  val nDCacheWays = 4
  val nDCacheWayBytes = 16

  val AXI4_DATA_WIDTH = 32
  val AXI4_ID_WIDTH = 3
  val AXI4_BURST_LENGTH = 32
  val AXI4_BURST_BYTES = AXI4_DATA_WIDTH / 8
}
