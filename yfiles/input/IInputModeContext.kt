// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IGraph
import yfiles.lang.InterfaceMetadata
import yfiles.view.ICanvasContext

/**
 * The interface for the context object that is passed to [IInputMode] instances during [install][IInputMode] and [uninstall][IInputMode] and [IDragHandler] implementations like [IPositionHandler] and [IHandle] to provide additional context for the implementations.
 * @see [ILookup][yfiles.collections.ILookup]
 * @see [IInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext">Online Documentation</a>
 */
external interface IInputModeContext : ICanvasContext {
  /**
   * Tries to retrieve an [IGraph] instance from an [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23graph">Online Documentation</a>
   */
  final val graph: IGraph?
  
  /**
   * Gets the [IInputMode] which this context conceptually has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23inputMode">Online Documentation</a>
   */
  val inputMode: IInputMode?
  
  /**
   * Tries to call [invalidateDisplays][IGraph] on the [graph][IInputModeContext] obtained from the [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-invalidateDisplays">Online Documentation</a>
   */
  final fun invalidateDisplays(): Unit = definedExternally

  
  companion object : InterfaceMetadata<IInputModeContext> {
  }
}
