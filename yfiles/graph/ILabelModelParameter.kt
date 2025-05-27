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
 * Defines a state that can be used to [determine the geometry of a label][ILabelModel] with a [ILabelModel].
 * @see [ILabelModel]
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter">Online Documentation</a>
 */
external interface ILabelModelParameter : ICloneable<ILabelModelParameter> {
  /**
   * Gets the model that can be used to determine the geometry of a label given this parameter and a label instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter%23model">Online Documentation</a>
   */
  val model: ILabelModel

  
  companion object : InterfaceMetadata<ILabelModelParameter> {
  }
}
