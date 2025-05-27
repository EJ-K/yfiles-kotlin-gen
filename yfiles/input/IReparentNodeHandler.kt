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
import yfiles.lang.InterfaceMetadata

/**
 * Interface used for implementations that recognize, approve, and disapprove node reparenting gestures, as well as actually perform the reparenting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentNodeHandler">Online Documentation</a>
 */
external interface IReparentNodeHandler  {
  /**
   * Determines whether the current gesture that can be determined through the context is a reparent gesture.
   * @param [context] The context that provides information about the user input.
   * @param [node] The node that will possibly be reparented.
   * @return Whether this is a reparenting gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentNodeHandler%23IReparentNodeHandler-method-isReparentGesture">Online Documentation</a>
   */
  fun isReparentGesture(
    context: IInputModeContext,
    node: INode,
  ): Boolean
  
  /**
   * Determines whether the provided node may be reparented to a `newParent`.
   * @param [context] The context that provides information about the user input.
   * @param [node] The node that will be reparented.
   * @param [newParent] The potential new parent or `null`. Can be a group or a non-group node.
   * @return Whether `newParent` is a valid new parent for `node`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentNodeHandler%23IReparentNodeHandler-method-isValidParent">Online Documentation</a>
   */
  fun isValidParent(
    context: IInputModeContext,
    node: INode,
    newParent: INode?,
  ): Boolean
  
  /**
   * Performs the actual reparenting after the reparent gesture has been finalized.
   * @param [context] The context that provides information about the user input.
   * @param [node] The node that will be reparented.
   * @param [newParent] The potential new parent or `null`. Can be a group or a non-group node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentNodeHandler%23IReparentNodeHandler-method-reparent">Online Documentation</a>
   */
  fun reparent(
    context: IInputModeContext,
    node: INode,
    newParent: INode?,
  )
  
  /**
   * Determines whether the user may detach the given node from its current parent in order to reparent it.
   * @param [context] The context that provides information about the user input.
   * @param [node] The node that is about to be detached from its current parent.
   * @return Whether the node may be detached and reparented.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReparentNodeHandler%23IReparentNodeHandler-method-shouldReparent">Online Documentation</a>
   */
  fun shouldReparent(
    context: IInputModeContext,
    node: INode,
  ): Boolean

  
  companion object : InterfaceMetadata<IReparentNodeHandler> {
  }
}
