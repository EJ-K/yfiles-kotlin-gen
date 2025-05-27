// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.ILookup
import yfiles.lang.InterfaceMetadata

/**
 * This interface describes the context for many operations performed on items in a [canvasComponent][ICanvasContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasContext">Online Documentation</a>
 */
external interface ICanvasContext : ILookup {
  /**
   * Gets the Canvas that is associated with this context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasContext%23canvasComponent">Online Documentation</a>
   */
  val canvasComponent: CanvasComponent
  
  /**
   * Gets the radius for hit tests and marquee selection tests in world coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasContext%23hitTestRadius">Online Documentation</a>
   */
  val hitTestRadius: Double
  
  /**
   * Gets the current zoom level that is the ratio of world coordinates to screen pixels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasContext%23zoom">Online Documentation</a>
   */
  val zoom: Double
  
  /**
   * Adds an element to the defs section of the document, if it has not been added yet.
   * @param [defsSupport] The instance that is used to create and update the element and to query if the element is still referenced
   * @return The id of the element with which it can be referenced using an url reference.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasContext%23ICanvasContext-method-getDefsId">Online Documentation</a>
   */
  fun getDefsId(
    defsSupport: ISvgDefsCreator,
  ): String

  
  companion object : InterfaceMetadata<ICanvasContext> {
  }
}
