package uk.ac.uea.mathsthing.plugins.constants

import java.math.BigDecimal

import uk.ac.uea.mathsthing.IPlugin.IConstantPlugin

class Pi extends IConstantPlugin {

  def getName : String = "pi"
    
  def getValue : BigDecimal = new BigDecimal(Math.PI)
}