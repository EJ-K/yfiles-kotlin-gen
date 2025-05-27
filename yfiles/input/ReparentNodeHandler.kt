// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * An [IReparentNodeHandler] that treats shift key presses as reparent gestures and allows for reparenting all nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23ReparentNodeHandler-constructor-ReparentNodeHandler">Online Documentation</a>
 */
open external class ReparentNodeHandler () : IReparentNodeHandler {
  /**
   * Gets or sets the event recognizer that determines whether to reparent a node.
   * 
   * The default detects the current platform and delegates either to [META_IS_DOWN][EventRecognizers] (macOS) or [CTRL_IS_DOWN][EventRecognizers] (other platforms).
   * @see [isReparentGesture]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23reparentRecognizer">Online Documentation</a>
   */
  final var reparentRecognizer: EventRecognizer
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23ReparentNodeHandler-method-isReparentGesture">Online Documentation</a>
   */
  override fun isReparentGesture(
    context: IInputModeContext,
    node: INode,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23ReparentNodeHandler-method-isValidParent">Online Documentation</a>
   */
  override fun isValidParent(
    context: IInputModeContext,
    node: INode,
    newParent: INode?,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23ReparentNodeHandler-method-reparent">Online Documentation</a>
   */
  override fun reparent(
    context: IInputModeContext,
    node: INode,
    newParent: INode?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentNodeHandler%23ReparentNodeHandler-method-shouldReparent">Online Documentation</a>
   */
  override fun shouldReparent(
    context: IInputModeContext,
    node: INode,
  ): Boolean
  
  companion object : ClassMetadata<ReparentNodeHandler> {
  }
}

inline fun ReparentNodeHandler(
    block: ReparentNodeHandler.() -> Unit
): ReparentNodeHandler {
    return ReparentNodeHandler()
        .apply(block)
}
