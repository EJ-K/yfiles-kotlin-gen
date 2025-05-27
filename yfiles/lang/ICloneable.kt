// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * Implemented by objects which can create a clone of themselves.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICloneable">Online Documentation</a>
 */
external interface ICloneable<out T : ICloneable<T>>  {
  /**
   * Create a clone of this object.
   * @return A clone of this object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICloneable%23ICloneable-method-clone">Online Documentation</a>
   */
  fun clone(): T

  
  companion object : InterfaceMetadata<ICloneable<*>> {
  }
}
