package chompdb.server

import chompdb.DomainInfo
import f1lesystem.FileSystem

trait Config {
  val domain: DomainInfo
}

trait ConfigReader {
  val fs: FileSystem

  def read(path: FileSystem#Path): Config
  def write(path: FileSystem#Path, config: Config): Unit
}