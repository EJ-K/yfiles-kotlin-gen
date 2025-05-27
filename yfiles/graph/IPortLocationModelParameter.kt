// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ICloneable
import yfiles.lang.InterfaceMetadata

/**
 * Defines a state that can be used to [determine the location of a port][IPortLocationModel] with a [IPortLocationModel].
 * @see [IPortLocationModel]
 * @see [IPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter">Online Documentation</a>
 */
external interface IPortLocationModelParameter : ICloneable<IPortLocationModelParameter> {
  /**
   * Gets the model that created this parameter.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter%23model">Online Documentation</a>
   */
  val model: IPortLocationModel

  
  companion object : InterfaceMetadata<IPortLocationModelParameter> {
  }
}
