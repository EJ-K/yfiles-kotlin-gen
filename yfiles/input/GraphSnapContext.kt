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
import yfiles.graph.ILabel
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
open external class GraphSnapContext () : SnapContext {
  /**
   * Gets or sets the items that were affected by the drag gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23affectedItems">Online Documentation</a>
   */
  final val affectedItems: IListEnumerable<IModelItem>
  
  /**
   * Gets or sets the grid constraint provider for the [IBend]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23bendGridConstraintProvider">Online Documentation</a>
   */
  final var bendGridConstraintProvider: IGridConstraintProvider<IBend>?
  
  /**
   * Gets or sets whether this instance should [collect][GraphSnapContext] snap references for fixed edge segments.
   * 
   * The default is `true`.
   * @see [ISnapReferenceProvider]
   * @see [collectFixedSegmentSnapReferences]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectEdgeSnapReferences">Online Documentation</a>
   */
  final var collectEdgeSnapReferences: Boolean
  
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
   * Gets or sets whether this instance should [collect][GraphSnapContext] the sizes of fixed nodes.
   * 
   * The default is `true`.
   * @see [collectSameSizeEntries]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodeSizes">Online Documentation</a>
   */
  final var collectNodeSizes: Boolean
  
  /**
   * Gets or sets whether this instance should [collect][GraphSnapContext] snap references for fixed nodes.
   * 
   * The default is `true`.
   * @see [ISnapReferenceProvider]
   * @see [collectFixedNodeSnapReferences]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectNodeSnapReferences">Online Documentation</a>
   */
  final var collectNodeSnapReferences: Boolean
  
  /**
   * Gets or sets whether this instance should [collect][GraphSnapContext] snap references for fixed ports.
   * 
   * The default is `true`.
   * @see [ISnapReferenceProvider]
   * @see [collectFixedPortSnapReferences]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collectPortSnapReferences">Online Documentation</a>
   */
  final var collectPortSnapReferences: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines in parallel to the edge path of the label owner at the distance of other edge labels in the graph.
   * 
   * The default is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerEdgeLabelAllEdgeLabelsDistanceSnapping">Online Documentation</a>
   */
  final var considerEdgeLabelAllEdgeLabelsDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect two snap lines in parallel to the edge path of the label owner at the initial distance of the edge label.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerEdgeLabelOwnerDistanceSnapping">Online Documentation</a>
   */
  final var considerEdgeLabelOwnerDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines in parallel to the edge path of the label owner at the distances of all edge labels of that owner.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerEdgeLabelOwnerLabelsDistanceSnapping">Online Documentation</a>
   */
  final var considerEdgeLabelOwnerLabelsDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines on the edge path.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerEdgeLabelOwnerPathSnapping">Online Documentation</a>
   */
  final var considerEdgeLabelOwnerPathSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines for the initial position of a label.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerInitialLabelLocationSnapping">Online Documentation</a>
   */
  final var considerInitialLabelLocationSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines in parallel to the border of the label owner at the distance of other node labels in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerNodeLabelAllNodeLabelsDistanceSnapping">Online Documentation</a>
   */
  final var considerNodeLabelAllNodeLabelsDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect four snap lines in parallel to the owner's borders at the initial label distance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerNodeLabelOwnerDistanceSnapping">Online Documentation</a>
   */
  final var considerNodeLabelOwnerDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines in parallel to the border of the label owner at the distance of other node labels of that owner.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerNodeLabelOwnerLabelsDistanceSnapping">Online Documentation</a>
   */
  final var considerNodeLabelOwnerLabelsDistanceSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect six snap lines, two through the center and four through the border sides of the label owner.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerNodeLabelOwnerShapeSnapping">Online Documentation</a>
   */
  final var considerNodeLabelOwnerShapeSnapping: Boolean
  
  /**
   * Gets or sets whether this instance should collect snap lines to the center of the owner port.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23considerPortLabelOwnerLocationSnapping">Online Documentation</a>
   */
  final var considerPortLabelOwnerLocationSnapping: Boolean
  
  /**
   * Gets or sets a value indicating whether to crop the orthogonal snap lines at obstacles.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23cropSnapLines">Online Documentation</a>
   */
  final var cropSnapLines: Boolean
  
  /**
   * Gets or sets the preferred distance between edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23edgeDistance">Online Documentation</a>
   */
  final var edgeDistance: Double
  
  /**
   * Gets the nodes that stay fixed for the current edit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23fixedNodes">Online Documentation</a>
   */
  protected final val fixedNodes: ICollection<out INode>
  
  /**
   * Gets or sets which types of items [IGridConstraintProvider] implementations should snap.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23gridSnappableItems">Online Documentation</a>
   */
  final var gridSnappableItems: GridSnappableItems
  
  /**
   * Gets or sets the preferred distance between node borders.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23nodeDistance">Online Documentation</a>
   */
  final var nodeDistance: Double
  
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
   * Gets or sets the grid constraint provider for the [IPort]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23portGridConstraintProvider">Online Documentation</a>
   */
  final var portGridConstraintProvider: IGridConstraintProvider<IPort>?
  
  /**
   * Gets or sets the amount by which snap lines that are induced by existing edge segments and node borders are being extended.
   * 
   * The default is `40.0`, this value will be used to extend the ends of the snap lines.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapLineExtension">Online Documentation</a>
   */
  final var snapLineExtension: Double
  
  /**
   * Gets the collection of [snapReferences][GraphSnapContext] other than [OrthogonalSnapLine]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snapReferences">Online Documentation</a>
   */
  final val snapReferences: IEnumerable<SnapReference>
  
  /**
   * Gets or sets which types of items snap result provider implementations should snap.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23snappableItems">Online Documentation</a>
   */
  final var snappableItems: SnappableItems
  
  /**
   * Adds [MovementInfo] representing an [IBend] that will be considered for the next drag gesture.
   * 
   * The default [IHandle] of an [IBend] calls this method in its [initializeDrag][IDragHandler] method so snap results are calculated when this bend is repositioned. Custom [IHandle] implementations can add infos created by [getMovementInfo][GraphSnapContext].
   * @param [info] The [MovementInfo] representing the bend to be moved. Can be created with [getMovementInfo][GraphSnapContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addBendToBeMoved">Online Documentation</a>
   */
  open fun addBendToBeMoved(
    info: MovementInfo,
  )
  
  /**
   * Adds [MovementInfo] representing the end of an [IEdge] that will be considered for the next drag gesture.
   * @param [info] The [MovementInfo] representing the edge end to be reparented. Can be created with [getMovementInfos][GraphSnapContext].
   * @param [sourceEnd] `true` if the `info` represents the source end of the edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addEdgeEndToBeMoved">Online Documentation</a>
   */
  open fun addEdgeEndToBeMoved(
    info: MovementInfo,
    sourceEnd: Boolean,
  )
  
  /**
   * Adds an item which will be reshaped.
   * @param [item] The item to be reshaped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addItemToBeReshaped">Online Documentation</a>
   */
  open fun addItemToBeReshaped(
    item: IModelItem,
  )
  
  /**
   * Adds [MovementInfo] representing an [ILabel] that will be considered for the next drag gesture.
   * 
   * The default [LabelPositionHandler] calls this method in its [initializeDrag][LabelPositionHandler] method so snap results are calculated for this label. Custom [LabelPositionHandler] implementations can add infos created by [getMovementInfo][GraphSnapContext].
   * @param [info] The [MovementInfo] representing the label to be moved. Can be created with [getMovementInfo][GraphSnapContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addLabelToBeMoved">Online Documentation</a>
   */
  open fun addLabelToBeMoved(
    info: MovementInfo,
  )
  
  /**
   * Adds [MovementInfo] representing an [INode] that will be considered for the next drag gesture.
   * 
   * The default [IPositionHandler] of an [INode] calls this method in its [initializeDrag][IDragHandler] method so snap results are calculated when this node is repositioned. Custom [IPositionHandler] implementations can add infos created by [getMovementInfo][GraphSnapContext].
   * @param [info] The [MovementInfo] representing the node to be moved. Can be created with [getMovementInfo][GraphSnapContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addNodeToBeMoved">Online Documentation</a>
   */
  open fun addNodeToBeMoved(
    info: MovementInfo,
  )
  
  /**
   * Adds an orthogonally moved segment to this context for which this instance will automatically collect [SnapResult]s and provide a default visualization.
   * @param [start] The starting point of the manipulated segment.
   * @param [end] The end point of the manipulated segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addOrthogonalSegment">Online Documentation</a>
   */
  open fun addOrthogonalSegment(
    start: MovementInfo,
    end: MovementInfo,
  )
  
  /**
   * Adds [MovementInfo] representing an [IPort] that will be considered for the next drag gesture.
   * 
   * The default [IHandle] of an [IPort] calls this method in its [initializeDrag][IDragHandler] method so snap results are calculated for this port. Custom [IHandle] implementations can add infos created by [getMovementInfo][GraphSnapContext].
   * @param [info] The [MovementInfo] representing the port to be moved. Can be created with [getMovementInfo][GraphSnapContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addPortToBeMoved">Online Documentation</a>
   */
  open fun addPortToBeMoved(
    info: MovementInfo,
  )
  
  /**
   * Adds an entry for the same-height-snapping.
   * @param [rectangle] The rectangle to obtain the height value from. This rectangle will be used for the snap result visualization.
   * @see [addSameWidthEntry]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addSameHeightEntry">Online Documentation</a>
   */
  open fun addSameHeightEntry(
    rectangle: Rect,
  )
  
  /**
   * Adds an entry for the same-width-snapping.
   * @param [rectangle] The rectangle to obtain the width value from. This rectangle will be used for the snap result visualization.
   * @see [addSameHeightEntry]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-addSameWidthEntry">Online Documentation</a>
   */
  open fun addSameWidthEntry(
    rectangle: Rect,
  )
  
  /**
   * Disposes of all previously temporarily collected state and clears the [snapResults][SnapContext] collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-cleanUp">Online Documentation</a>
   */
  override fun cleanUp()
  
  /**
   * Collects the [SnapReference]s for the nodes which are not moving.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedNodeSnapReferences">Online Documentation</a>
   */
  protected open fun collectFixedNodeSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Collects the [SnapReference]s for the ports which are not moving.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedPortSnapReferences">Online Documentation</a>
   */
  protected open fun collectFixedPortSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Collects snap references for edge segments.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectFixedSegmentSnapReferences">Online Documentation</a>
   */
  protected open fun collectFixedSegmentSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Collects [SnapGrid]s for bends, ports, and nodes if the corresponding [bendGridConstraintProvider][GraphSnapContext], [portGridConstraintProvider][GraphSnapContext], or [nodeGridConstraintProvider][GraphSnapContext] are set.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectGridSnapReferences">Online Documentation</a>
   */
  protected open fun collectGridSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Collects all node widths and heights in collections used by the [SnapSize].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectSameSizeEntries">Online Documentation</a>
   */
  protected open fun collectSameSizeEntries()
  
  /**
   * Collects first the [entries with same size][GraphSnapContext] and then [SnapSize] for snapping to the width and height of these sizes.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectSameSizeSnapReferences">Online Documentation</a>
   */
  protected open fun collectSameSizeSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Finds pairs of nodes that are visually adjacent to create [center][GraphSnapContext] and [same distance][GraphSnapContext] snap lines.
   * @param [event] The [CollectSnapReferencesEventArgs] required for adding snap references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-collectVisibleNodePairs">Online Documentation</a>
   */
  protected open fun collectVisibleNodePairs(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * Collects a list of snap lines.
   * @see [onCollectSnapReferences]
   * @see [cropSnapLines]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-dragInitialized">Online Documentation</a>
   */
  override fun dragInitialized()
  
  /**
   * Gets the movement info for the given bend.
   * @param [bend] The bend to obtain the info for.
   * @return An instance of [MovementInfo] that describes the movement of the bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(IBend)">Online Documentation</a>
   */
  open fun getMovementInfo(
    bend: IBend,
  ): MovementInfo
  
  /**
   * Gets the movement info for the given node.
   * @param [node] The node to obtain the info for.
   * @return An instance of [MovementInfo] that describes the movement of the node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(INode)">Online Documentation</a>
   */
  open fun getMovementInfo(
    node: INode,
  ): MovementInfo
  
  /**
   * Gets the movement info for the given label.
   * @param [label] The node to obtain the info for.
   * @return An instance of [MovementInfo] that describes the movement of the node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(ILabel)">Online Documentation</a>
   */
  open fun getMovementInfo(
    label: ILabel,
  ): MovementInfo
  
  /**
   * Gets the movement info for the given port.
   * @param [port] The port to obtain the info for.
   * @return An instance of [MovementInfo] that describes the movement of the port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfo(IPort)">Online Documentation</a>
   */
  open fun getMovementInfo(
    port: IPort,
  ): MovementInfo
  
  /**
   * Gets the [MovementInfo] for the provided edge.
   * @param [edge] The edge to obtain the movement information of.
   * @return An [IListEnumerable] of [MovementInfo] items that describe the geometry of the edge being modified.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-getMovementInfos">Online Documentation</a>
   */
  open fun getMovementInfos(
    edge: IEdge,
  ): IListEnumerable<MovementInfo>
  
  /**
   * Called by [IInputMode] implementations when an interactive drag is started.
   * @param [context] The context in which the interactive drag is started.
   * @param [originalLocation] The original location of the mouse.
   * @throws InvalidOperationError If this context is already [initialized][SnapContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Raises the [collect-snap-references][GraphSnapContext] event.
   * @param [event] The [CollectSnapReferencesEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-onCollectSnapReferences">Online Documentation</a>
   */
  protected open fun onCollectSnapReferences(
    event: CollectSnapReferencesEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23GraphSnapContext-method-wrapContext">Online Documentation</a>
   */
  override fun wrapContext(
    context: IInputModeContext,
  ): IInputModeContext
  
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
 * `collect-snap-references`: Occurs every time this instance has been [initialized][SnapContext] to collect [OrthogonalSnapLine]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphSnapContext%23collect-snap-references">Online Documentation</a>
 */
inline fun  GraphSnapContext.addCollectSnapReferencesHandler(
  crossinline handler: (event:CollectSnapReferencesEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<CollectSnapReferencesEventArgs> = { event, _ -> handler(event) }
  addEventListener("collect-snap-references", listener)
  return { removeEventListener("collect-snap-references", listener) }
}
