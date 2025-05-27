// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1

/**
 * Concrete [SnapContext] implementation which handles snapping movement for [IGraph][yfiles.graph.IGraph] items.
 * @see [GraphEditorInputMode]
 * @see [GraphEditorInputMode.snapContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext">Online Documentation</a>
 * 
 * @constructor Creates a new instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-constructor-GraphSnapContext">Online Documentation</a>
 */
external open class GraphSnapContext  () : SnapContext {

/**
 * Gets the collection of additional [OrthogonalSnapLine]s.
 * @see [getAdditionalSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23additionalSnapLines">Online Documentation</a>
 */
final val additionalSnapLines: IEnumerable<OrthogonalSnapLine>
/**
 * Gets or sets the grid constraint provider for the [IBend]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23bendGridConstraintProvider">Online Documentation</a>
 */
final var bendGridConstraintProvider: IGridConstraintProvider<IBend>?
/**
 * Gets or sets whether this instance should collect [fixed snap lines][fixedSegmentSnapLines] for edge segments.
 * 
 * The default is `true`.
 * @see [ISnapLineProvider]
 * @see [collectFixedSegmentSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectEdgeSnapLines">Online Documentation</a>
 */
final var collectEdgeSnapLines: Boolean
/**
 * Gets or sets whether this instance will try to align the centers of adjacent nodes so that their centers are equally far away from each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodePairCenterSnapLines">Online Documentation</a>
 */
final var collectNodePairCenterSnapLines: Boolean
/**
 * Gets or sets a value indicating whether this instance will collect pairs of adjacent nodes and add snapping logic so that moved edge segments will snap so that the distances to the adjacent nodes are equal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodePairSegmentSnapLines">Online Documentation</a>
 */
final var collectNodePairSegmentSnapLines: Boolean
/**
 * Gets or sets a value indicating whether this instance will collect pairs of adjacent nodes and add snapping logic so that moved nodes will snap so that the distances to the adjacent nodes are equal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodePairSnapLines">Online Documentation</a>
 */
final var collectNodePairSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect the sizes of fixed nodes.
 * 
 * The default is `true`.
 * @see [collectSameSizeEntries]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodeSizes">Online Documentation</a>
 */
final var collectNodeSizes: Boolean
/**
 * Gets or sets whether this instance should collect [fixed snap lines][fixedNodeSnapLines] for nodes.
 * 
 * The default is `true`.
 * @see [ISnapLineProvider]
 * @see [collectFixedNodeSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodeSnapLines">Online Documentation</a>
 */
final var collectNodeSnapLines: Boolean
/**
 * Gets or sets whether this instance should collect [fixed snap lines][fixedPortSnapLines] for ports.
 * 
 * The default is `true`.
 * @see [ISnapLineProvider]
 * @see [collectFixedPortSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectPortSnapLines">Online Documentation</a>
 */
final var collectPortSnapLines: Boolean
/**
 * Gets or sets a value indicating whether to crop the snap lines at obstacles.
 * 
 * The default is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23cropSnapLines">Online Documentation</a>
 */
final var cropSnapLines: Boolean
/**
 * Gets or sets the preferred distance between edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23edgeToEdgeDistance">Online Documentation</a>
 */
final var edgeToEdgeDistance: Double
/**
 * Gets the collection of [OrthogonalSnapLine]s for fixed nodes.
 * @see [getFixedNodeSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23fixedNodeSnapLines">Online Documentation</a>
 */
final val fixedNodeSnapLines: IEnumerable<OrthogonalSnapLine>
/**
 * Gets the nodes that stay fixed for the current edit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23fixedNodes">Online Documentation</a>
 */
protected final val fixedNodes: ICollection<out INode>
/**
 * Gets the collection of [OrthogonalSnapLine]s to which ports should be snapping.
 * @see [getFixedPortSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23fixedPortSnapLines">Online Documentation</a>
 */
final val fixedPortSnapLines: IEnumerable<OrthogonalSnapLine>
/**
 * Gets the collection of [OrthogonalSnapLine]s for fixed segments.
 * @see [getFixedSegmentSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23fixedSegmentSnapLines">Online Documentation</a>
 */
final val fixedSegmentSnapLines: IEnumerable<OrthogonalSnapLine>
/**
 * Gets or sets the grid constraint provider for the [INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23nodeGridConstraintProvider">Online Documentation</a>
 */
final var nodeGridConstraintProvider: IGridConstraintProvider<INode>?
/**
 * Gets or sets the preferred distance between node borders and edge segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23nodeToEdgeDistance">Online Documentation</a>
 */
final var nodeToEdgeDistance: Double
/**
 * Gets or sets the preferred distance between node borders.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23nodeToNodeDistance">Online Documentation</a>
 */
final var nodeToNodeDistance: Double
/**
 * Gets or sets the grid constraint provider for the [IPort]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23portGridConstraintProvider">Online Documentation</a>
 */
final var portGridConstraintProvider: IGridConstraintProvider<IPort>?
/**
 * Gets or sets whether this context will automatically snap the movements of bends so that the two adjacent segments become horizontally or vertically oriented.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapBendAdjacentSegments">Online Documentation</a>
 */
final var snapBendAdjacentSegments: Boolean
/**
 * Gets or sets whether this context will automatically snap the bends to snap lines.
 * 
 * The default is false.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapBendsToSnapLines">Online Documentation</a>
 */
final var snapBendsToSnapLines: Boolean
/**
 * Gets or sets the amount by which snap lines that are induced by existing edge segments and node borders are being extended.
 * 
 * The default is `40.0`, this value will be used to extend the ends of the snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapLineExtension">Online Documentation</a>
 */
final var snapLineExtension: Double
/**
 * Gets or sets whether [INodeSnapResultProvider] implementations should snap nodes to snap lines.
 * 
 * The default is true.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapNodesToSnapLines">Online Documentation</a>
 */
final var snapNodesToSnapLines: Boolean
/**
 * Gets or sets whether this context will automatically snap the movement in such a way that the overall move gesture is constrained to the horizontal or vertical axis.
 * 
 * The default is false.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapOrthogonalMovement">Online Documentation</a>
 */
final var snapOrthogonalMovement: Boolean
/**
 * Gets or sets whether this context will automatically snap the movements of nodes so that the first and last segments of edges become orthogonal.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapPortAdjacentSegments">Online Documentation</a>
 */
final var snapPortAdjacentSegments: Boolean
/**
 * Gets or sets whether this context will automatically snap orthogonal edge segments to snap lines.
 * 
 * The default is true.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapSegmentsToSnapLines">Online Documentation</a>
 */
final var snapSegmentsToSnapLines: Boolean
/**
 * Adds [MovementInfo] representing an [IBend] that will be considered for the next drag gesture.
 * 
 * The default [IHandle] of an [IBend] calls this method in its [IDragHandler.initializeDrag] method so snap results are calculated when this bend is repositioned. Custom [IHandle] implementations can add infos created by [getMovementInfo].
 * @param [info] The [MovementInfo] representing the bend to be moved. Can be created with [getMovementInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addBendToBeMoved">Online Documentation</a>
 */
 open   fun addBendToBeMoved( info: MovementInfo )
/**
 * Adds [MovementInfo] representing the end of an [IEdge] that will be considered for the next drag gesture.
 * @param [info] The [MovementInfo] representing the edge end to be reparented. Can be created with [getMovementInfos].
 * @param [sourceEnd] `true` if the `info` represents the source end of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addEdgeEndToBeMoved">Online Documentation</a>
 */
 open   fun addEdgeEndToBeMoved( info: MovementInfo ,
 sourceEnd: Boolean )
/**
 * Adds an item which will be reshaped.
 * @param [item] The item to be reshaped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addItemToBeReshaped">Online Documentation</a>
 */
 open   fun addItemToBeReshaped( item: IModelItem )
/**
 * Adds [MovementInfo] representing an [INode] that will be considered for the next drag gesture.
 * 
 * The default [IPositionHandler] of an [INode] calls this method in its [IDragHandler.initializeDrag] method so snap results are calculated when this node is repositioned. Custom [IPositionHandler] implementations can add infos created by [getMovementInfo].
 * @param [info] The [MovementInfo] representing the node to be moved. Can be created with [getMovementInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addNodeToBeMoved">Online Documentation</a>
 */
 open   fun addNodeToBeMoved( info: MovementInfo )
/**
 * Adds an orthogonally moved segment to this context for which this instance will automatically collect [SnapResult]s and provide a default visualization.
 * @param [start] The starting point of the manipulated segment.
 * @param [end] The end point of the manipulated segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addOrthogonalSegment">Online Documentation</a>
 */
 open   fun addOrthogonalSegment( start: MovementInfo ,
 end: MovementInfo )
/**
 * Adds [MovementInfo] representing an [IPort] that will be considered for the next drag gesture.
 * 
 * The default [IHandle] of an [IPort] calls this method in its [IDragHandler.initializeDrag] method so snap results are calculated for this port. Custom [IHandle] implementations can add infos created by [getMovementInfo].
 * @param [info] The [MovementInfo] representing the port to be moved. Can be created with [getMovementInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addPortToBeMoved">Online Documentation</a>
 */
 open   fun addPortToBeMoved( info: MovementInfo )
/**
 * Adds an entry for the same-height-snapping.
 * @param [rectangle] The rectangle to obtain the height value from. This rectangle will be used for the snap result visualization.
 * @see [addSameWidthEntry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addSameHeightEntry">Online Documentation</a>
 */
 open   fun addSameHeightEntry( rectangle: Rect )
/**
 * Adds an entry for the same-width-snapping.
 * @param [rectangle] The rectangle to obtain the width value from. This rectangle will be used for the snap result visualization.
 * @see [addSameHeightEntry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addSameWidthEntry">Online Documentation</a>
 */
 open   fun addSameWidthEntry( rectangle: Rect )
/**
 * Disposes of all previously temporarily collected state and clears the [SnapContext.snapResults] collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * Collects the [OrthogonalSnapLine]s for the nodes which are not moving.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedNodeSnapLines">Online Documentation</a>
 */
 open protected   fun collectFixedNodeSnapLines( event: CollectGraphSnapLinesEventArgs )
/**
 * Collects the [OrthogonalSnapLine]s for the ports which are not moving.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedPortSnapLines">Online Documentation</a>
 */
 open protected   fun collectFixedPortSnapLines( event: CollectGraphSnapLinesEventArgs )
/**
 * Collects snap lines for edge segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedSegmentSnapLines">Online Documentation</a>
 */
 open protected   fun collectFixedSegmentSnapLines( event: CollectGraphSnapLinesEventArgs )
/**
 * Collects all node widths and heights in the collections [findSameWidthEntries] and [findSameHeightEntries].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectSameSizeEntries">Online Documentation</a>
 */
 open protected   fun collectSameSizeEntries()
/**
 * Finds pairs of nodes that are visually adjacent to create [center][collectNodePairCenterSnapLines] and [same distance][collectNodePairSnapLines] snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectVisibleNodePairs">Online Documentation</a>
 */
 open protected   fun collectVisibleNodePairs()
/**
 * Collects a list of snap lines.
 * @see [onCollectSnapLines]
 * @see [cropSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-dragInitialized">Online Documentation</a>
 */
 override   fun dragInitialized()
/**
 * Finds the entries ([Rect]s) that have been registered using the [addSameHeightEntry] previously that best match the given constraints.
 * @param [size] The size to find the closest set of identical sizes.
 * @param [maxSize] The maximum allowed size.
 * @param [minSize] The minimum allowed size.
 * @return The set of rectangles that have been added previously using [addSameHeightEntry].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-findSameHeightEntries">Online Documentation</a>
 */
 open   fun findSameHeightEntries( size: Double ,
 maxSize: Double ,
 minSize: Double ):IListEnumerable<Rect>
/**
 * Finds the entries ([Rect]s) that have been registered using the [addSameWidthEntry] previously that best match the given constraints.
 * @param [size] The size to find the closest set of identical sizes.
 * @param [maxSize] The maximum allowed size.
 * @param [minSize] The minimum allowed size.
 * @return The set of rectangles that have been added previously using [addSameWidthEntry].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-findSameWidthEntries">Online Documentation</a>
 */
 open   fun findSameWidthEntries( size: Double ,
 maxSize: Double ,
 minSize: Double ):IListEnumerable<Rect>
/**
 * Gets a subset of [additionalSnapLines] that matches the given `orientation`, `snapType` and intersects with the provided `area`.
 * @param [orientation] The orientation of the lines to return.
 * @param [snapType] The snap type to be included.
 * @param [area] The area to test for intersection.
 * @return An enumerable of the snap lines that match the provided criteria.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getAdditionalSnapLines">Online Documentation</a>
 */
 final   fun getAdditionalSnapLines( orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 area: Rect ):IEnumerable<OrthogonalSnapLine>
/**
 * Gets a subset of [fixedNodeSnapLines] that matches the given `orientation`, `snapType` and intersects with the provided `area`.
 * @param [orientation] The orientation of the lines to return.
 * @param [snapType] The snap type to be included.
 * @param [area] The area to test for intersection.
 * @return An enumerable of the snap lines that match the provided criteria.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getFixedNodeSnapLines">Online Documentation</a>
 */
 final   fun getFixedNodeSnapLines( orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 area: Rect ):IEnumerable<OrthogonalSnapLine>
/**
 * Gets a subset of [fixedPortSnapLines] that matches the given `orientation`, `snapType` and intersects with the provided `area`.
 * @param [orientation] The orientation of the lines to return.
 * @param [snapType] The snap type to be included.
 * @param [area] The area to test for intersection.
 * @return An enumerable of the snap lines that match the provided criteria.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getFixedPortSnapLines">Online Documentation</a>
 */
 final   fun getFixedPortSnapLines( orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 area: Rect ):IEnumerable<OrthogonalSnapLine>
/**
 * Gets a subset of [fixedSegmentSnapLines] that matches the given `orientation`, `snapType` and intersects with the provided `area`.
 * @param [orientation] The orientation of the lines to return.
 * @param [snapType] The snap type to be included.
 * @param [area] The area to test for intersection.
 * @return An enumerable of the snap lines that match the provided criteria.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getFixedSegmentSnapLines">Online Documentation</a>
 */
 final   fun getFixedSegmentSnapLines( orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 area: Rect ):IEnumerable<OrthogonalSnapLine>
/**
 * Gets the movement info for the given bend.
 * @param [bend] The bend to obtain the info for.
 * @return An instance of [MovementInfo] that describes the movement of the bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(IBend)">Online Documentation</a>
 */
 open   fun getMovementInfo( bend: IBend ):MovementInfo
/**
 * Gets the movement info for the given node.
 * @param [node] The node to obtain the info for.
 * @return An instance of [MovementInfo] that describes the movement of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(INode)">Online Documentation</a>
 */
 open   fun getMovementInfo( node: INode ):MovementInfo
/**
 * Gets the movement info for the given port.
 * @param [port] The port to obtain the info for.
 * @return An instance of [MovementInfo] that describes the movement of the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(IPort)">Online Documentation</a>
 */
 open   fun getMovementInfo( port: IPort ):MovementInfo
/**
 * Gets the [movement information][MovementInfo] for the provided edge.
 * @param [edge] The edge to obtain the movement information of.
 * @return An [IListEnumerable] of [MovementInfo]s items that describe the geometry of the edge being modified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfos">Online Documentation</a>
 */
 open   fun getMovementInfos( edge: IEdge ):IListEnumerable<MovementInfo>
/**
 * Called by [IInputMode] implementations when an interactive drag is started.
 * @param [context] The context in which the interactive drag is started.
 * @param [originalLocation] The original location of the mouse.
 * @throws InvalidOperationError If this context is already [initialized][SnapContext.isInitialized].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Raises the [CollectSnapLines] event.
 * @param [event] The [CollectGraphSnapLinesEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-onCollectSnapLines">Online Documentation</a>
 */
 open protected   fun onCollectSnapLines( event: CollectGraphSnapLinesEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-wrapContext">Online Documentation</a>
 */
 override   fun wrapContext( context: IInputModeContext ):IInputModeContext
/**
 * Occurs every time this instance has been [initialized][SnapContext.dragInitialized] to collect [OrthogonalSnapLine]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23CollectSnapLines">Online Documentation</a>
 */
fun addCollectSnapLinesListener(listener: EventHandler1<CollectGraphSnapLinesEventArgs>)
fun removeCollectSnapLinesListener(listener: EventHandler1<CollectGraphSnapLinesEventArgs>)

companion object : ClassMetadata<GraphSnapContext> {
}
}

inline fun GraphSnapContext(
    block: GraphSnapContext.() -> Unit
): GraphSnapContext {
    return GraphSnapContext()
        .apply(block)
}

/**
 * Occurs every time this instance has been [initialized][SnapContext.dragInitialized] to collect [OrthogonalSnapLine]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23CollectSnapLines">Online Documentation</a>
 */
inline fun  GraphSnapContext.addCollectSnapLinesHandler(
    crossinline handler: (event:CollectGraphSnapLinesEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<CollectGraphSnapLinesEventArgs> = { _, event -> handler(event) }
    addCollectSnapLinesListener(listener)
    return { removeCollectSnapLinesListener(listener) }
}
