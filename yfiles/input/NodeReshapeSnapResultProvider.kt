// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * The default implementation of the [INodeReshapeSnapResultProvider] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider">Online Documentation</a>
 */
external open class NodeReshapeSnapResultProvider 
protected constructor () : INodeReshapeSnapResultProvider {

/**
 * Adds a snap result for a location that snaps to a grid line.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [snapLineType] The type of snap line.
 * @param [snapLineLocation] The point at which the snap line is anchored.
 * @param [delta] The amount the mouse needs to be moved in order to get to the snapping location.
 * @param [snappedLocation] The location of the mouse that is associated with the grid point.
 * @param [from] Where the snap line starts.
 * @param [to] Where the snap line ends.
 * @param [snapLinePoint] A point of interest on the snap line that can be highlighted.
 * @param [preferredSnapType] Whether the cursor should preferably snap horizontally or vertically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-addGridLineSnapResult">Online Documentation</a>
 */
 open protected   fun addGridLineSnapResult( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 snapLineType: SnapLineSnapTypes ,
 snapLineLocation: IPoint ,
 delta: Point ,
 snappedLocation: Point ,
 from: Double ,
 to: Double ,
 snapLinePoint: Point ,
 preferredSnapType: SnapTypes )
/**
 * Adds a snap result for a location that snaps to the grid.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [provider] The provider that is associated with the grid snapping.
 * @param [gridSnappedPoint] The point on the grid that should be highlighted.
 * @param [snappedLocation] The location of the mouse that is associated with the grid point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-addGridSnapResult">Online Documentation</a>
 */
 open protected   fun addGridSnapResult( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 provider: IGridConstraintProvider<INode> ,
 gridSnappedPoint: Point ,
 snappedLocation: Point )
/**
 * Adds a snap result for "same size" to the collect event argument.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data. This will be used to [add][CollectSnapResultsEventArgs.addSnapResult] the result to.
 * @param [node] The node that is being reshaped.
 * @param [orientation] The orientation of the result - indicates whether width or height have been snapped.
 * @param [rectangles] The rectangles that have the same width or height as the node will - this does not yet includes the rectangle of the node being reshaped.
 * @param [finalSize] The target size to which the node will snap.
 * @param [snapDelta] The snap delta that the mouse needs to be moved in order to snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-addSameSizeSnapResult">Online Documentation</a>
 */
 open protected   fun addSameSizeSnapResult( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 orientation: SnapLineOrientation ,
 rectangles: IEnumerable<Rect> ,
 finalSize: Double ,
 snapDelta: Point )
/**
 * Adds a snap result for a location that snaps the node's bounds to a snap line.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [snapLine] The snap line to which the node can be snapped
 * @param [delta] The amount the mouse needs to be moved in order to get to the snapping location.
 * @param [snapPoint] The point of interest that can be highlighted on the snap line.
 * @param [preferredSnapType] Whether the cursor should preferably snap horizontally or vertically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-addSnaplineSnapResult">Online Documentation</a>
 */
 open protected   fun addSnaplineSnapResult( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 snapLine: OrthogonalSnapLine ,
 delta: Point ,
 snapPoint: Point ,
 preferredSnapType: SnapTypes )
/**
 * Collects the snap results for the grid.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [reshapeContext] The reshape context that describes how the node's layout is reshaped.
 * @param [suggestedLayout] The suggested layout of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectGridSnapResults">Online Documentation</a>
 */
 open protected   fun collectGridSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 reshapeContext: ReshapeRectangleContext ,
 suggestedLayout: Rect )
/**
 * Collects the snap results that make the node the same size as other elements.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
 * @param [suggestedLayout] The layout of the node as it would be if the mouse location would not be snapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectSameSizeSnapResults">Online Documentation</a>
 */
 open protected   fun collectSameSizeSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 reshapeContext: ReshapeRectangleContext ,
 suggestedLayout: Rect )
/**
 * Collects the snap results that makes the node's bounds snap to the [fixed node snap lines][GraphSnapContext.getFixedNodeSnapLines].
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
 * @param [suggestedLayout] The layout of the node as it would be if the mouse location would not be snapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectSnapLineResults">Online Documentation</a>
 */
 open protected   fun collectSnapLineResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 reshapeContext: ReshapeRectangleContext ,
 suggestedLayout: Rect )
/**
 * Called when a node is [dragged][IDragHandler.handleMove] to add [SnapResult]s for [OrthogonalSnapLine]s or sizes to which this node can potentially snap during resizing.
 * @param [context] The snap context which manages the snap lines and the settings.
 * @param [event] The event argument to obtain the context from and add the results to.
 * @param [node] The node that is being reshaped.
 * @param [reshapeContext] Carries information about the reshape process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
 */
 override   fun collectSnapResults( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 reshapeContext: ReshapeRectangleContext )
/**
 * Helper method for method [collectSnapLineResults] that gets all the [SnapLine] that should be checked for the currently moved node.
 * @param [context] The context in which the snapping is performed.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @param [node] The node that is being reshaped.
 * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
 * @param [suggestedLayout] The layout of the node as it would be if the mouse location would not be snapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-getSnapLines">Online Documentation</a>
 */
 open protected   fun getSnapLines( context: GraphSnapContext ,
 event: CollectSnapResultsEventArgs ,
 node: INode ,
 reshapeContext: ReshapeRectangleContext ,
 suggestedLayout: Rect ):IEnumerable<SnapLine>

companion object : ClassMetadata<NodeReshapeSnapResultProvider> {
/**
 * A shared singleton instance of this type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: INodeReshapeSnapResultProvider
}
}
