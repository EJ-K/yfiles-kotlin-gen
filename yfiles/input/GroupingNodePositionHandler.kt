// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * The [IPositionHandler] implementation used in the context of [IGraph][yfiles.graph.IGraph]s where there is an [active hierarchy][yfiles.graph.IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GroupingNodePositionHandler] class.
 * @param [node] The node to reposition.
 * @param [wrappedHandler] The [IPositionHandler] to wrap. If omitted, this will be the default [IPositionHandler] for nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-constructor-GroupingNodePositionHandler">Online Documentation</a>
 */
open external class GroupingNodePositionHandler (
  node: INode,
  wrappedHandler: IPositionHandler  = definedExternally,
) : IPositionHandler {
  /**
   * Gets or sets a value determining whether the layout of the parent group node is adjusted to always keep the moved node inside.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23adjustParentNodeLayout">Online Documentation</a>
   */
  final var adjustParentNodeLayout: Boolean
  
  /**
   * Gets a view of the location of the item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23location">Online Documentation</a>
   */
  final override val location: IPoint
  
  /**
   * Gets or sets a value determining whether [children][yfiles.graph.IGraph] of the moved node are implicitly moved with it.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23moveChildNodes">Online Documentation</a>
   */
  final var moveChildNodes: Boolean
  
  /**
   * Gets or sets a value determining whether [reparenting][IReparentNodeHandler] the moved node is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23reparentingEnabled">Online Documentation</a>
   */
  final var reparentingEnabled: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-method-cancelDrag">Online Documentation</a>
   */
  override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-method-dragFinished">Online Documentation</a>
   */
  override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-method-handleMove">Online Documentation</a>
   */
  override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Sets a temporary visual parent for the node during reparenting.
   * @param [context] The current [IInputModeContext].
   * @param [node] The node being reparented.
   * @param [parent] The temporary parent for the node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingNodePositionHandler%23GroupingNodePositionHandler-method-setCurrentParent">Online Documentation</a>
   */
  protected open fun setCurrentParent(
    context: IInputModeContext,
    node: INode,
    parent: INode?,
  )
  
  companion object : ClassMetadata<GroupingNodePositionHandler> {
  }
}
