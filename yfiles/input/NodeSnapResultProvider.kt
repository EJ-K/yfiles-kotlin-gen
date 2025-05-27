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
 * The default implementation of the [INodeSnapResultProvider] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider">Online Documentation</a>
 */
external open class NodeSnapResultProvider 
protected constructor () : INodeSnapResultProvider {

/**
 * Calculates a [SnapResult] and [adds it][CollectSnapResultsEventArgs.addSnapResult] to the argument.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The arguments to add the results to.
 * @param [location] A location in the layout of the suggested layout of the node that will be snapped to a grid point location.
 * @param [node] The node that is currently being processed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-addGridSnapResult">Online Documentation</a>
 */
 open protected   fun addGridSnapResult( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 location: Point ,
 node: INode )
/**
 * Calculates a [SnapResult] and [adds it][CollectSnapResultsEventArgs.addSnapResult] to the argument.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The arguments to add the results to.
 * @param [location] A location in the layout of the suggested layout of the node that will be snapped to a grid point location.
 * @param [node] The node that is currently being processed.
 * @param [gridSnapType] The type of snapping that should be performed.
 * @param [xSnapPolicy] How to snap the x coordinate.
 * @param [ySnapPolicy] How to snap the y coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-addGridSnapResultCore">Online Documentation</a>
 */
 open protected   fun addGridSnapResultCore( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 location: Point ,
 node: INode ,
 gridSnapType: GridSnapTypes ,
 xSnapPolicy: SnapPolicy ,
 ySnapPolicy: SnapPolicy )
/**
 * Collects snap results that snap the node to a grid and [adds them][CollectSnapResultsEventArgs.addSnapResult] to the argument.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The arguments to add the results to.
 * @param [suggestedLayout] The layout of the node if it would move without snapping.
 * @param [node] The node that is currently being processed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectGridSnapResults">Online Documentation</a>
 */
 open protected   fun collectGridSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLayout: Rect ,
 node: INode )
/**
 * Collects the results for the given layout for all snap lines in question.
 * @param [context] The context for which the results are being queried.
 * @param [event] The [CollectSnapResultsEventArgs] instance to which the results should be [added][CollectSnapResultsEventArgs.addSnapResult].
 * @param [suggestedLayout] The suggested layout of the node.
 * @param [node] The node that is being dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectSnapLineSnapResults">Online Documentation</a>
 */
 open protected   fun collectSnapLineSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLayout: Rect ,
 node: INode )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
 */
 override   fun collectSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLayout: Rect ,
 node: INode )
/**
 * Verifies whether the node will snap to the given snap line.
 * @param [event] The arguments to add the results to.
 * @param [snapLine] The snap line to test snapping for.
 * @param [suggestedLayout] The layout of the node if it would move without snapping.
 * @param [node] The node that is currently being processed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectSnapResultsForSnapLine">Online Documentation</a>
 */
 open protected   fun collectSnapResultsForSnapLine( event: CollectSnapResultsEventArgs ,
 snapLine: OrthogonalSnapLine ,
 suggestedLayout: Rect ,
 node: INode )

companion object : ClassMetadata<NodeSnapResultProvider> {
/**
 * Yields the static shared instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: INodeSnapResultProvider
}
}
