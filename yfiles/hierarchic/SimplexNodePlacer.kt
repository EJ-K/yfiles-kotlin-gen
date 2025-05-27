// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.INodeMap
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a [INodePlacer] implementation based on [rank assignment][yfiles.algorithms.RankAssignments].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SimplexNodePlacer] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-constructor-SimplexNodePlacer">Online Documentation</a>
 */
external open class SimplexNodePlacer  () : INodePlacer {

/**
 * Gets or sets whether or not a barycenter drawing mode should be used.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23barycenterMode">Online Documentation</a>
 */
open var barycenterMode: Boolean
/**
 * Gets or sets whether or not an optimization step should be applied that tries to further reduce the number of bends.
 * 
 * Default value - `true`
 * @see [maximumDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23bendReduction">Online Documentation</a>
 */
open var bendReduction: Boolean
/**
 * Gets or sets whether or not the [SimplexNodePlacer] should break *long* edge segments in favor of a potentially more compact layout.
 * 
 * Default value - `false`. Long edges will not be broken, in favor of straight edge paths and better performance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23breakLongSegments">Online Documentation</a>
 */
open var breakLongSegments: Boolean
/**
 * Gets or sets whether or not the [SimplexNodePlacer] enforces the placement of nodes at their exact current positions, even if this violates minimum distance constraints.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23exactPlacement">Online Documentation</a>
 */
open var exactPlacement: Boolean
/**
 * Gets or sets whether or not the [SimplexNodePlacer] should try to use the coordinates given from the current sketch for the determination of the layer coordinates.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23fromSketchLayerAssignment">Online Documentation</a>
 */
open var fromSketchLayerAssignment: Boolean
/**
 * Gets or sets the strategy used for controlling the horizontal compactness of group nodes.
 * 
 * Default value - [GroupCompactionPolicy.NONE]. No group compaction is performed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23groupCompactionStrategy">Online Documentation</a>
 */
open var groupCompactionStrategy: GroupCompactionPolicy
/**
 * Gets or sets whether or not the [SimplexNodePlacer] tries to create a maximally compact horizontal layout at the cost of more bends.
 * 
 * Default value - `false`
 * @see [labelCompaction]
 * @see [breakLongSegments]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23horizontalCompaction">Online Documentation</a>
 */
open var horizontalCompaction: Boolean
/**
 * Gets or sets whether or not the [SimplexNodePlacer] places labels in a more compact style.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23labelCompaction">Online Documentation</a>
 */
open var labelCompaction: Boolean
/**
 * Gets or sets the time limit (in milliseconds) set for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the minimum distance between the upper and lower sublayer.
 * 
 * Default value - `15.0`
 * @throws ArgumentError if minimum sublayer distance is negative
 * @see [nodeCompaction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23minimumSublayerDistance">Online Documentation</a>
 */
open var minimumSublayerDistance: Double
/**
 * Gets or sets whether or not nodes should be placed in a more compact style with respect to layout width.
 * 
 * Default value - `false`. Nodes are not placed in a compact style.
 * @see [minimumSublayerDistance]
 * @see [assignNodesToSublayer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23nodeCompaction">Online Documentation</a>
 */
open var nodeCompaction: Boolean
/**
 * Gets or sets whether or not a postprocessing step should be applied to reduce the number of bends.
 * 
 * Default value - `false`. A postprocessing step to reduce the number of bends is not applied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23straightenEdges">Online Documentation</a>
 */
open var straightenEdges: Boolean
/**
 * Gets or sets the relative weight of edges crossing a swimlane relative to edges that stay in their lane.
 * 
 * Default value - `0.0`. The algorithm ignores edges crossing a swimlane border.
 * @throws ArgumentError if the relative weight does not lie within [0,1]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23swimLaneCrossingWeight">Online Documentation</a>
 */
open var swimLaneCrossingWeight: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-assignLayerCoordinates">Online Documentation</a>
 */
 override   fun assignLayerCoordinates( graph: LayoutGraph ,
 layoutDataProvider: ILayoutDataProvider ,
 layers: ILayers )
/**
 * Assigns the nodes of a given layer to the corresponding upper/lower sublayer if [node compaction][nodeCompaction] is enabled.
 * @param [layerNodes] a [list][NodeList] of all [normal nodes][NodeDataType.NORMAL] of a layer
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [graph] the given graph
 * @param [lowerSublayer] the [INodeMap] holding sublayer information
 * @see [nodeCompaction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-assignNodesToSublayer">Online Documentation</a>
 */
 open protected   fun assignNodesToSublayer( layerNodes: NodeList ,
 ldp: ILayoutDataProvider ,
 graph: LayoutGraph ,
 lowerSublayer: INodeMap<ILayer> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-assignSequenceCoordinates">Online Documentation</a>
 */
 override   fun assignSequenceCoordinates( graph: LayoutGraph ,
 layoutDataProvider: ILayoutDataProvider ,
 layers: ILayers ,
 drawingDistanceCalculator: IDrawingDistanceCalculator )
/**
 * Returns the alignment of the node with a specified layer.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [node] the given node
 * @param [layerIndex] the index of the layer
 * @param [minLayerHeight] the minimum height of the layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-getLayerAlignment">Online Documentation</a>
 */
 open protected   fun getLayerAlignment( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 node: Node ,
 layerIndex: Int ,
 minLayerHeight: Double ):Double
/**
 * Specifies the minimum allowed distance between two nodes of the same given layer.
 * @param [graph] the graph that contains the nodes
 * @param [layer] the layer that contains the nodes
 * @param [predNode] the node to the left of the other one, may be `null` to indicate a border line
 * @param [succ] the node to the right of the other one, may be `null` to indicate a border line
 * @return the minimum distance allowed between those two nodes ( >=0 )
 * @see [IDrawingDistanceCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-getMinDistance">Online Documentation</a>
 */
 open protected   fun getMinDistance( graph: LayoutGraph ,
 layer: ILayer ,
 predNode: Node? ,
 succ: Node? ):Double
/**
 * Returns the minimum height of a given [layer][ILayer].
 * @param [graph] the given graph
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [layer] the given [ILayer] object
 * @return the minimum height
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-getMinimumLayerHeight">Online Documentation</a>
 */
 open protected   fun getMinimumLayerHeight( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 layer: ILayer ):Double
/**
 * Returns whether or not the given node should be treated as a node with fixed (given) coordinates.
 * @param [graph] the given graph
 * @param [provider] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [node] the given node
 * @param [inLayer] `true` if the layer coordinate of the node is queried, `false` if the sequence coordinate is queried
 * @return `true` if the node should be treated as fixed, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplexNodePlacer%23SimplexNodePlacer-method-isFixedNode">Online Documentation</a>
 */
 open protected   fun isFixedNode( graph: LayoutGraph ,
 provider: ILayoutDataProvider ,
 node: Node ,
 inLayer: Boolean ):Boolean

companion object : ClassMetadata<SimplexNodePlacer> {
}
}

inline fun SimplexNodePlacer(
    block: SimplexNodePlacer.() -> Unit
): SimplexNodePlacer {
    return SimplexNodePlacer()
        .apply(block)
}
