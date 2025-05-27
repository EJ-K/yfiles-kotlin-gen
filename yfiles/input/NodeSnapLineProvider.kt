// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * An implementation of the [ISnapLineProvider] interface that provides [OrthogonalSnapLine]s for [INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider">Online Documentation</a>
 */
external open class NodeSnapLineProvider  : ISnapLineProvider<INode> {

/**
 * Called by [addSnapLines] the collect snap lines for the centers of the node.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [node] The node to add snap lines for.
 * @param [layout] The layout of the node to use for adding the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addCenterSnapLines">Online Documentation</a>
 */
 open protected   fun addCenterSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 node: INode ,
 layout: Rect )
/**
 * Adds the fixed snap lines around the border of the nodes' `layout`.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [node] The node to add snap lines for.
 * @param [layout] The layout of the node to use for adding the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addFixedNodeBorderSnapLines">Online Documentation</a>
 */
 open protected   fun addFixedNodeBorderSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 node: INode ,
 layout: Rect )
/**
 * Adds the fixed snap lines around the node for other nodes to snap to using the [GraphSnapContext.nodeToNodeDistance].
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [node] The node to add snap lines for.
 * @param [layout] The layout of the node to use for adding the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addNodeToNodeSnapLines">Online Documentation</a>
 */
 open protected   fun addNodeToNodeSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 node: INode ,
 layout: Rect )
/**
 * Adds the fixed snap lines around the node for edge segments to snap to.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [node] The node to add snap lines for.
 * @param [layout] The layout of the node to use for adding the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addNodeToSegmentSnapLines">Online Documentation</a>
 */
 open protected   fun addNodeToSegmentSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 node: INode ,
 layout: Rect )
/**
 * Called by [addSnapLines] the collect snap lines to snap ports to at the provided node.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [node] The node to add snap lines for.
 * @param [layout] The layout of the node to use for adding the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addPortSnapLines">Online Documentation</a>
 */
 open protected   fun addPortSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 node: INode ,
 layout: Rect )
/**
 * Called by the [GraphSnapContext] when a [drag][GraphSnapContext.initializeDrag] is about to start.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [event] The argument to use for adding snap lines.
 * @param [item] The item to add snap lines for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-addSnapLines">Online Documentation</a>
 */
 override   fun addSnapLines( context: GraphSnapContext ,
 event: CollectGraphSnapLinesEventArgs ,
 item: INode )
/**
 * Creates a snap line for the center of nodes.
 * @param [context] The context which holds the settings for the snap lines. Note that implementations should not change the state of the context explicitly.
 * @param [node] The node to add snap lines for.
 * @param [orientation] The snap line orientation.
 * @param [location] The location of the snap line.
 * @return A snap line that other centers can snap to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapLineProvider%23NodeSnapLineProvider-method-createCenterSnapLine">Online Documentation</a>
 */
 open protected   fun createCenterSnapLine( context: GraphSnapContext ,
 node: INode ,
 orientation: SnapLineOrientation ,
 location: Point ):OrthogonalSnapLine

companion object : ClassMetadata<NodeSnapLineProvider> {
}
}
