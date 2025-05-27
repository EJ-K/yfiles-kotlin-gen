// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import js.array.ReadonlyArray
import yfiles.algorithms.BorderLine
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.GraphDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.algorithms.YPointPath
import yfiles.algorithms.YRectangle
import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph

/**
 * This layout algorithm clears a specified area by moving intersecting elements, while trying to minimize the changes in the given layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ClearAreaLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-constructor-ClearAreaLayout">Online Documentation</a>
 */
external open class ClearAreaLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the rectangular area that must be cleared.
 * 
 * Default value - `null`. There is no area to be cleared.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23area">Online Documentation</a>
 */
open var area: YRectangle?
/**
 * Gets or sets the outline describing the shape of the area that must be cleared.
 * 
 * Default value - `null`. There is no outline to be cleared.
 * @throws ArgumentError if the given array does not contain exactly four non-null [BorderLine]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23areaOutline">Online Documentation</a>
 */
open var areaOutline: ReadonlyArray<BorderLine>?
/**
 * Gets or sets the strategy applied for clearing the desired area.
 * 
 * Default value - [ClearAreaStrategy.PRESERVE_SHAPES]
 * @throws ArgumentError if an unknown strategy is provided
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23clearAreaStrategy">Online Documentation</a>
 */
open var clearAreaStrategy: ClearAreaStrategy
/**
 * Gets or sets the strategy that assigns nodes to components whose elements should preferably not be separated.
 * 
 * Default value - [ComponentAssignmentStrategy.CUSTOMIZED]. Components can be user-defined and if none are defined, each node is a separate component.
 * @throws ArgumentError if the specified strategy does not match one of the predefined strategies
 * @see [COMPONENT_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23componentAssignmentStrategy">Online Documentation</a>
 */
open var componentAssignmentStrategy: ComponentAssignmentStrategy
/**
 * Gets or sets whether or not the layout algorithm considers edge labels, moving them outside the area, if necessary.
 * 
 * Default value - `true`. Edge labels are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets or sets whether or not edges are considered when clearing the [area] such that no segments intersecting the area are allowed.
 * 
 * Default value - `true`. Edges are not allowed to intersect the area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23considerEdges">Online Documentation</a>
 */
open var considerEdges: Boolean
/**
 * Gets or sets whether or not the layout algorithm considers node labels, moving them outside the area, if necessary.
 * 
 * Default value - `true`. Node labels are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the custom edge router instance that is applied to reroute edges.
 * 
 * Default value - `null`. There is no custom router and the routing strategy is automatically determined.
 * @see [ROUTE_EDGE_DP_KEY]
 * @see [edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23edgeRouter">Online Documentation</a>
 */
open var edgeRouter: ILayoutAlgorithm?
/**
 * Gets or sets the routing strategy that is preserved while clearing the area and applied when rerouting edges.
 * 
 * Default value - [EdgeRoutingStrategy.AUTOMATIC]. The routing strategy is automatically determined.
 * @throws ArgumentError if the given strategy does not match one of the predefined routing strategies
 * @see [edgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23edgeRoutingStrategy">Online Documentation</a>
 */
open var edgeRoutingStrategy: EdgeRoutingStrategy
/**
 * Gets or sets whether the ports of the input graph must be fixed or if they can be changed.
 * 
 * Default value - `true`. Ports are fixed and not allowed to change when adjusting the edge paths.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23fixPorts">Online Documentation</a>
 */
open var fixPorts: Boolean
/**
 * Gets or sets the current grid spacing.
 * 
 * Default value - `0`. No grid is considered.
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the layout orientation that is considered during the clearing of the area.
 * 
 * Default value - [LayoutOrientation.NONE]. The layout is considered to have no specific orientation.
 * @throws ArgumentError if the specified orientation does not match one of the predefined orientations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23layoutOrientation">Online Documentation</a>
 */
open var layoutOrientation: LayoutOrientation
/**
 * Gets or sets the time limit in milliseconds for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the spacing that is considered between elements when they are moved to clear the area.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * Clears the specified rectangular [area], the area defined via [AREA_NODES_DP_KEY] or [EXPANDED_NODE_DP_KEY] by moving all other graph elements currently intersecting with it.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Creates and sets the value of the property [areaOutline] of the `layout` determined from the `items`.
 * @param [items] The [IModelItem]s from which the [BorderLine]s are determined.
 * @param [spacing] The spacing that is considered between the area and the elements.
 * @param [closed] Whether the area is closed or can be traversed by other elements (without overlaps).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-defaultmethod-configureAreaOutline">Online Documentation</a>
 */
   fun configureAreaOutline( items: IEnumerable<IModelItem> ,
 spacing: Double ,
 closed: Boolean  = definedExternally)
/**
 * This method is called each time when edges are rerouted with the given edge router.
 * @param [edgeRouter] the instance used for routing the edges
 * @see [edgeRouter]
 * @see [edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-configureEdgeRouter">Online Documentation</a>
 */
 open protected   fun configureEdgeRouter( edgeRouter: ILayoutAlgorithm? )
/**
 * Creates the outline that describes the shape of the given nodes and edges.
 * @param [graph] the input graph
 * @param [areaNodes] the nodes that are part of the area that should be cleared
 * @param [areaEdges] the edges that are adjacent to the given area nodes
 * @return an array of four [BorderLine]s describing the outline of the area to be cleared
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-method-createAreaOutline">Online Documentation</a>
 */
 open protected   fun createAreaOutline( graph: LayoutGraph ,
 areaNodes: NodeList ,
 areaEdges: EdgeList ):ReadonlyArray<BorderLine>
/**
 * Moves the [areaOutline] by the given `delta`.
 * @param [delta] The delta to move the [areaOutline].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ClearAreaLayout-defaultmethod-moveAreaOutline">Online Documentation</a>
 */
   fun moveAreaOutline( delta: IPoint )

companion object : ClassMetadata<ClearAreaLayout> {
/**
 * A data provider key for specifying the group node inside which the cleared area should be located.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23AREA_GROUP_NODE_DP_KEY">Online Documentation</a>
 */
 val AREA_GROUP_NODE_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying a set of nodes that define the area which should be cleared.
 * @see [createAreaOutline]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23AREA_NODES_DP_KEY">Online Documentation</a>
 */
 val AREA_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for defining custom components whose elements should preferably not be separated.
 * @see [componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23COMPONENT_ID_DP_KEY">Online Documentation</a>
 */
 val COMPONENT_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for marking the node that was expanded and, thus, defines the area that must be cleared.
 * @see [EXPANDED_NODE_ORIGINAL_BOUNDS_DP_KEY]
 * @see [EXPANDED_NODE_ORIGINAL_EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_DP_KEY">Online Documentation</a>
 */
 val EXPANDED_NODE_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying the original, non-expanded bounds of the expanded node.
 * @see [EXPANDED_NODE_DP_KEY]
 * @see [EXPANDED_NODE_ORIGINAL_EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_ORIGINAL_BOUNDS_DP_KEY">Online Documentation</a>
 */
 val EXPANDED_NODE_ORIGINAL_BOUNDS_DP_KEY: GraphDpKey<YRectangle>
/**
 * A data provider key for associating original paths for edges connecting to the expanded node, including edges that did so only when the node was not yet expanded.
 * @see [EXPANDED_NODE_DP_KEY]
 * @see [EXPANDED_NODE_ORIGINAL_BOUNDS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23EXPANDED_NODE_ORIGINAL_EDGE_PATH_DP_KEY">Online Documentation</a>
 */
 val EXPANDED_NODE_ORIGINAL_EDGE_PATH_DP_KEY: EdgeDpKey<YPointPath>
/**
 * A data provider key for obtaining the edges that should be routed by the custom edge router.
 * @see [edgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayout%23ROUTE_EDGE_DP_KEY">Online Documentation</a>
 */
 val ROUTE_EDGE_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun ClearAreaLayout(
    block: ClearAreaLayout.() -> Unit
): ClearAreaLayout {
    return ClearAreaLayout()
        .apply(block)
}
